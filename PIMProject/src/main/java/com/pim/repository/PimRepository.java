package com.pim.repository;

import java.text.ParseException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pim.PIMProject.Model.Request.CustomerProfiles;
import com.pim.PIMProject.Model.Request.FinancialInstitutionInfo;
import com.pim.PIMProject.Model.Request.Info;
import com.pim.PIMProject.Model.Request.InterfaceLogs;
import com.pim.PIMProject.Model.Request.RegisterUser;
import com.pim.db.mapping.model.Transactions;
import com.pim.util.CommonMethods;

@Repository
public class PimRepository<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(PimRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private CommonMethods<T> cms;
	
	public int insertUserRegistration(RegisterUser request, RegisterUser response) {
		Info info = response.getEntity().getInfo();
		FinancialInstitutionInfo fi = response.getEntity().getFinancialInstitutionInfo();
		String sql = "";  int insertion = 0;
		
		String sqll = "select * from t_customer_profiles where nid = '"+response.getEntity().getInfo().getnID()+"'";
		List <CustomerProfiles> userData = jdbcTemplate.query(sqll, BeanPropertyRowMapper.newInstance(CustomerProfiles.class));
		
		if (userData.isEmpty()) {
			try {
				sql = "insert into t_customer_profiles (APPLICATION_ID, ENTITY_TYPE, MOBILE_NO, EMAIL, BRANCH_ID, CUSTOMER_ID,"
				+ " CUSTOMER_NAME, CUSTOMER_ADDRESS,"+ " GENDER, POST_CODE, NID, TIN_NO, PASSWORD, IDTP_PIN, APP_PASSWORD, "
				+ "FIN_NAME,"+" PRIMARY_ACCOUNT_NO, BIRTH_DATE, REGISTRATION_DATE, ACTIVATION_DATE,  ACTIVATED_BY,"
				+ "REMARKS, TRANS_COUNT, TODAY_TRANS_AMT, TICKET_SIZE, DAILY_LIMIT)"
				
				+ " values (0, '"+info.getEntityType()+"', '"+info.getMobileNumber()+"', '"+info.getEmail()+"', 2, 0,"
				+ " 'Customer Name', 'Customer Address',"+" 'Gender',"+info.getPostalCode()+", '"+info.getnID()+"', '"+info.gettIN()+"', '"+info.getPassword()
				+"', '"+info.getiDTPKey()+"', 'App Password', 'Fin Name', 'Primary Acc No.', to_date('"+info.getDateOfBirth()+"', 'dd-mm-yyyy'),"
				+ "to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), 1, 'Remarks', 0, 0, 0, 0)";
				
				insertion = jdbcTemplate.update(sql);
				
			} catch (ParseException e) {
				logger.error("Error Info: "+e);
			}
			
			if (insertion == 1) {
				userData = jdbcTemplate.query(sqll, BeanPropertyRowMapper.newInstance(CustomerProfiles.class));
				String sql2 = "insert into t_customer_accounts (PROFILE_ID, ACCOUNT_NO, ACC_TITLE, BRANCH_ID, REG_TYPE, DEBIT_ALLOWED, STATUS)"
						+ "values ("+userData.get(0).getId()+", "+fi.getAccountNumber()+", 'Acc_title', 1,'B', '1',1)";
				
				 insertion = jdbcTemplate.update(sql2);
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
			String sql = "insert into t_interface_logs (COMPANY_ID, API_PROVIDERS_ID, API_CLASSES_ID, REQUEST_ID, REQUEST_TIME, REQUEST_NAME, REQUEST_PARAMS, RESPONSE, RESPONSE_TIME, RESPONSE_RESULT)"
					+ " values (1, "+ifl.getApiProvidersId()+", "+ifl.getApiClassesId()+", '"+ cms.setStringDefaultVal(ifl.getRequestId())+"', to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), '"
					+ifl.getRequestName()+"', '"+ifl.getRequestParams()+"', '"+ifl.getResponse()+"', to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), '"+cms.setStringDefaultVal(ifl.getResponseResult())+"')";
			
			insertionStatus = jdbcTemplate.update(sql);
			
		} catch (Exception e) {
			logger.error("Error Info: "+e);
		}
		
		return insertionStatus;
	}
	
	@SuppressWarnings("unchecked")
	public  <T extends Transactions> int insertTransactions(T t) throws Exception { 
	    int insertionStatus = 0;
		try {
			String sql = "insert into t_interface_logs (TRANS_ID, TRANS_CODE, PROFILE_ID, TRANS_DATE, SENDER_ACCOUNT, RECEIVER_IDTP_VID, TRANS_AMT, CHARGE_AMT, TAX_AMT,"
					+ " DESCRIPTION, PURPOSE, TR_STATUS, REASON, CBS_REF, RECONCILED, API_SUCCESS, USER_ID)"
					+ " values ('"+t.getTransId()+"', "+t.getTransCode()+", "+t.getProfileId()+", to_date('"+cms.formatedTodayDate()+"', 'dd-mm-yyyy'), '"+t.getSenderAccount()+"', '"+t.getReceiverIdtpVid()+"',"
							+t.getTransAmt()+", "+t.getChargeAmt()+", '"+t.getTaxAmt()+"', '"+t.getDescription()+"', '"+t.getPurpose()+"','"+t.getTrStatus()+"',"
							+ "'"+t.getReason()+"', '"+t.getCbsRef()+"', '"+t.getReconciled()+"', '"+t.getApiSuccess()+"', '"+t.getUserId()+"')";
			
			insertionStatus = jdbcTemplate.update(sql);
			
		} catch (Exception e) {
			logger.error("Error Info: "+e);
		}
		
		return insertionStatus;
	}
	
}
