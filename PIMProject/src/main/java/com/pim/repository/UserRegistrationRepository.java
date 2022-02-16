package com.pim.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pim.PIMProject.Model.CustomerProfiles;
import com.pim.PIMProject.Model.FinancialInstitutionInfo;
import com.pim.PIMProject.Model.Info;
import com.pim.PIMProject.Model.InterfaceLogs;
import com.pim.PIMProject.Model.RegisterUser;
import com.pim.PIMProject.Model.TransferFunds;
import com.pim.util.CommonFunctions;

@Repository
public class UserRegistrationRepository<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(UserRegistrationRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private CommonFunctions<T> cf;
	
	public String formatedDate(String value) throws ParseException {
//		Date date = new Date();
//		Timestamp ts=new Timestamp(date.getTime());
		
		LocalDateTime myDateObj = LocalDateTime.now();   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
	    String formattedDate = myDateObj.format(myFormatObj);
		return formattedDate;
	}
	
	public int insertUserRegistration(JAXBContext reqClass, RegisterUser ru) {
		LocalDateTime myDateObj = LocalDateTime.now();   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
	    String formattedDate = myDateObj.format(myFormatObj);
	    
		Info info = ru.getEntity().getInfo();
		FinancialInstitutionInfo fi = ru.getEntity().getFinancialInstitutionInfo();
		
		String sqll = "select * from t_customer_profiles where nid = '"+ru.getEntity().getInfo().getnID()+"'";
		List <CustomerProfiles> userData = jdbcTemplate.query(sqll, BeanPropertyRowMapper.newInstance(CustomerProfiles.class));
		 /*ACTIVATED_BY,*/
		if (userData.isEmpty()) {
			String sql = "insert into t_customer_profiles (APPLICATION_ID, ENTITY_TYPE, MOBILE_NO, EMAIL, BRANCH_ID, CUSTOMER_ID,"
					+ " CUSTOMER_NAME, CUSTOMER_ADDRESS,"+ " GENDER, POST_CODE, NID, TIN_NO, PASSWORD, IDTP_PIN, APP_PASSWORD, "
					+ "FIN_NAME,"+" PRIMARY_ACCOUNT_NO, BIRTH_DATE, REGISTRATION_DATE, ACTIVATION_DATE,  ACTIVATED_BY,"
					+ "REMARKS, TRANS_COUNT, TODAY_TRANS_AMT, TICKET_SIZE, DAILY_LIMIT)"
					
					+ " values (0, '"+info.getEntityType()+"', '"+info.getMobileNumber()+"', '"+info.getEmail()+"', 2, 0,"
					+ " 'Customer Name', 'Customer Address',"+" 'Gender',"+info.getPostalCode()+", '"+info.getnID()+"', '"+info.gettIN()+"', '"+info.getPassword()
					+"', '"+info.getiDTPKey()+"', 'App Password', 'Fin Name', 'Primary Acc No.', to_date('"+info.getDateOfBirth()+"', 'dd-mm-yyyy'),"
							+ "to_date('"+formattedDate+"', 'dd-mm-yyyy'), to_date('"+formattedDate+"', 'dd-mm-yyyy'), 1, 'Remarks', 0, 0, 0, 0)";
			
			int insertion = jdbcTemplate.update(sql);
			
			if (insertion == 1) {
				userData = jdbcTemplate.query(sqll, BeanPropertyRowMapper.newInstance(CustomerProfiles.class));
				String sql2 = "insert into t_customer_accounts (PROFILE_ID, ACCOUNT_NO, ACC_TITLE, BRANCH_ID, REG_TYPE, DEBIT_ALLOWED, STATUS)"
						+ "values ("+userData.get(0).getId()+", "+fi.getAccountNumber()+", 'Acc_title', 1,'B', '1',1)";
				
				 insertion = jdbcTemplate.update(sql2);
			}
			
			if (insertion == 1) {
				String sql2 = "insert into t_interface_logs (COMPANY_ID, API_PROVIDERS_ID, API_CLASSES_ID, REQUEST_ID, REQUEST_TIME, REQUEST_NAME, REQUEST_PARAMS, RESPONSE, RESPONSE_TIME, RESPONSE_RESULT)"
						+ " values (1, "+1+", "+0+", "+0+", to_date('"+formattedDate+"', 'dd-mm-yyyy'), '"+"REQUEST_NAME"+"','REQUEST_PARAM', 'RESPONSE', to_date('"+formattedDate+"', 'dd-mm-yyyy'),'1')";
				
				 insertion = jdbcTemplate.update(sql2);
			}
			
			
			return insertion;
		}
		else {
			return 0;
		}
	}
	

	@SuppressWarnings("unchecked")
	public  <T extends InterfaceLogs> int insertInterfaceLogs(JAXBContext reqClass, T ifl) throws Exception { 
		
	    int insertionStatus = 0;
		LocalDateTime myDateObj = LocalDateTime.now();   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
	    String formattedDate = myDateObj.format(myFormatObj);
	    
	    String requestInfoXml =cf.makeXmlForInterfaceLogs(reqClass, ifl.getRequestParams());
	    System.out.println(requestInfoXml);
	    
		try {
			String sql = "insert into t_interface_logs (COMPANY_ID, API_PROVIDERS_ID, API_CLASSES_ID, REQUEST_ID, REQUEST_TIME, REQUEST_NAME, REQUEST_PARAMS, RESPONSE, RESPONSE_TIME, RESPONSE_RESULT)"
					+ " values (1, "+ifl.getApiProvidersId()+", "+ifl.getApiClassesId()+", '"+ cf.setStringDefaultVal(ifl.getRequestId())+"', to_date('"+formattedDate+"', 'dd-mm-yyyy'), '"
					+ifl.getRequestName()+"', '"+requestInfoXml+"', '"+ifl.getResponse()+"', to_date('"+formattedDate+"', 'dd-mm-yyyy'), '"+cf.setStringDefaultVal(ifl.getResponseResult())+"')";
			
			insertionStatus = jdbcTemplate.update(sql);
			
		} catch (Exception e) {
			logger.error("Error Info: "+e);
		}
		
		return insertionStatus;
	}

	
	
	
	
}
