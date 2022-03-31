package com.pim.repository;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;

import com.pim.PIMProject.Model.Request.CustomerProfiles;
import com.pim.PIMProject.Model.Request.FinancialInstitutionInfo;
import com.pim.PIMProject.Model.Request.Info;
import com.pim.PIMProject.Model.Request.InterfaceLogs;
import com.pim.PIMProject.Model.Request.RegisterUser;
import com.pim.PIMProject.Model.Request.SenderVID;
import com.pim.PIMProject.Model.Request.TransferFunds;
import com.pim.PIMProject.Model.Response.RegisterUserResponse;
import com.pim.db.mapping.model.Transactions;
import com.pim.util.CommonMethods;

@Repository
public class PimRepository<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(PimRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private CommonMethods<T> cms;
	
	@Autowired
    private PlatformTransactionManager transactionManager;
	
	public int insertUserRegistration(RegisterUser request, RegisterUserResponse response) {
		Info info = request.getEntity().getInfo();
		FinancialInstitutionInfo fi = request.getEntity().getFinancialInstitutionInfo();
		String sql = "";  int insertion = 0;
		
		String sqll = "select * from t_customer_profiles where nid = '"+request.getEntity().getInfo().getnID()+"'";
		List <CustomerProfiles> userData = jdbcTemplate.query(sqll, BeanPropertyRowMapper.newInstance(CustomerProfiles.class));
		
		if (userData.isEmpty()) {
			try {
				sql = "INSERT INTO T_CUSTOMER_PROFILES (APPLICATION_ID, ENTITY_TYPE, IDTP_VID, MOBILE_NO, EMAIL, BRANCH_ID, CUSTOMER_ID,"
				+ " CUSTOMER_NAME, CUSTOMER_ADDRESS,"+ " GENDER, POST_CODE, NID, TIN_NO, PASSWORD, IDTP_PIN, APP_PASSWORD, "
				+ "FIN_NAME,"+" PRIMARY_ACCOUNT_NO, BIRTH_DATE, REGISTRATION_DATE, ACTIVATION_DATE,  ACTIVATED_BY,"
				+ "REMARKS, TRANS_COUNT, TODAY_TRANS_AMT, TICKET_SIZE, DAILY_LIMIT)"
				
				+ " values (0, '"+info.getEntityType()+"', '"+request.getEntity().getRequestedVirtualID().getValue()+"', '"+info.getMobileNumber()+"', '"+info.getEmail()+"', 2, 0,"
				+ " 'Customer Name', 'Customer Address',"+" 'Gender',"+info.getPostalCode()+", '"+info.getnID()+"', '"+info.gettIN()+"', '"+info.getPassword()
				+"', '"+info.getiDTPKey()+"', 'App Password', 'Fin Name', 'Primary Acc No.', to_date('"+info.getDateOfBirth()+"', 'dd-mm-yyyy'),"
				+ "to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), 1, 'Remarks', 0, 0, 0, 0)";
				
				try {
					insertion = jdbcTemplate.update(sql);
				} catch (Exception e) {
				    logger.error("Error Info: "+e);
				}
				
			} catch (Exception e) {
				logger.error("Error Info: "+e);
			}
			
			if (insertion == 1) {
				userData = jdbcTemplate.query(sqll, BeanPropertyRowMapper.newInstance(CustomerProfiles.class));
				String sql2 = "INSERT INTO T_CUSTOMER_ACCOUNTS (PROFILE_ID, ACCOUNT_NO, IDTP_ACC_VID, ACC_TITLE, BRANCH_ID, REG_TYPE, STATUS)"
						+ "values ("+userData.get(0).getId()+", "+fi.getAccountNumber()+", '"+request.getEntity().getRequestedVirtualID()+"', 'Acc_title', 1,'B',1)";
				
				try {
					insertion = jdbcTemplate.update(sql2);
				} catch (Exception e) {
				    logger.error("Error Info: "+e);
				}
				 
			}
			return insertion;
		}
		else {
			return 0;
		}
	}
	
	@SuppressWarnings("unchecked")
	public  <T extends InterfaceLogs> int insertInterfaceLogs(T ifl) throws Exception { 
	    int insertionStatus = 0;
		try {
			String sql = "INSERT INTO T_INTERFACE_LOGS (COMPANY_ID, API_PROVIDERS_ID, API_CLASSES_ID, REQUEST_ID, REQUEST_TIME, REQUEST_NAME, REQUEST_PARAMS, RESPONSE, RESPONSE_TIME, RESPONSE_RESULT)"
					+ " values (1, "+ifl.getApiProvidersId()+", "+ifl.getApiClassesId()+", '"+ cms.setStringDefaultVal(ifl.getRequestId())+"', to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), '"
					+ifl.getRequestName()+"', '"+ifl.getRequestParams()+"', '"+ifl.getResponse()+"', to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), '"+cms.setStringDefaultVal(ifl.getResponseResult())+"')";
			
			try {
				insertionStatus = jdbcTemplate.update(sql);
			} catch (Exception e) {
			    logger.error("Error Info: "+e);
			}
			
		} catch (Exception e) {
			logger.error("Error Info: "+e);
		}
		
		return insertionStatus;
	}
	
	@SuppressWarnings("unchecked")
	public  <T extends Transactions> int insertTransactions(T t,  List<CustomerProfiles> cpData, Map map) throws Exception { 
	    int insertionStatus = 0;
		if (t.getProfileId() == null) t.setProfileId(15);
		if (t.getUserId() == null) t.setUserId(1);
		
		try {
			String sql = "INSERT INTO T_TRANSACTIONS (SENDING_BANK_REF_NO, RECEIVING_BANK_REF_NO, IDTP_REF_NO, TRANS_CODE, PROFILE_ID, TRANS_DATE, SENDER_IDTP_VID, RECEIVER_IDTP_VID, TRANS_AMT, "
					+ "CHARGE_AMT, TAX_AMT, DESCRIPTION, PURPOSE, TR_STATUS, REASON, CBS_REF, RECONCILED, API_SUCCESS, USER_ID)"
					
					+ " values ('"+map.get("SendingBankRefNo")+"', '"+map.get("ReceivingBankRefNo")+"', '"+map.get("IDTPRefNo")+"', "+map.get("TransCode")+", "+cpData.get(0).getId()+", to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), '"
					+map.get("SenderIdtpVid")+"', '"+map.get("ReceiverIdtpVid")+"', "+map.get("TransAmt")+", "+t.getChargeAmt()+", "+t.getTaxAmt()+", '"+t.getDescription()
					+"', '"+t.getPurpose()+"', '"+t.getTrStatus()+"', '"+t.getReason()+"', '"+t.getCbsRef()+"', '"+t.getReconciled()+"', '"+t.getApiSuccess()
					+"', "+t.getUserId()+")";
			
			
			try {
				insertionStatus = jdbcTemplate.update(sql);
			} catch (Exception e) {
			    logger.error("Error Info: "+e);
			}
			
		} catch (Exception e) {
			logger.info("Error Info: "+e);
		}
		
		return insertionStatus;
	}
	
	public List <CustomerProfiles> selectProfileData(String vid) {
		String query = "select * from t_customer_profiles where idtp_vid = '"+vid.toString()+"'";
		List<CustomerProfiles> data = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(CustomerProfiles.class));
		return data;
	}
	
}
