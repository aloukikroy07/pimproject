package com.pim.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.pim.PIMProject.Model.CustomerProfiles;
import com.pim.PIMProject.Model.Info;
import com.pim.PIMProject.Model.RegisterUser;

@Repository
public class UserRegistrationRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String formatedDate(String value) throws ParseException {
//		Date date = new Date();
//		Timestamp ts=new Timestamp(date.getTime());
		
		LocalDateTime myDateObj = LocalDateTime.now();   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
	    String formattedDate = myDateObj.format(myFormatObj);
		return formattedDate;
	}
	
	public int insertUserRegistration(RegisterUser ru) {
		LocalDateTime myDateObj = LocalDateTime.now();   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
	    String formattedDate = myDateObj.format(myFormatObj);
	    
		Info info = ru.getEntity().getInfo();
		
		String sqll = "select * from t_customer_profiles where nid = '"+ru.getEntity().getInfo().getnID()+"'";
		List <CustomerProfiles> userData = jdbcTemplate.query(sqll, BeanPropertyRowMapper.newInstance(CustomerProfiles.class));
		
		if (userData.isEmpty()) {
			String sql = "insert into t_customer_profiles (APPLICATION_ID, ENTITY_TYPE, MOBILE_NO, EMAIL, BRANCH_ID, CUSTOMER_ID,"
					+ " CUSTOMER_NAME, CUSTOMER_ADDRESS,"+ " GENDER, POST_CODE, NID, TIN_NO, PASSWORD, IDTP_PIN, APP_PASSWORD, "
					+ "FIN_NAME,"+" PRIMARY_ACCOUNT_NO, BIRTH_DATE, REGISTRATION_DATE, ACTIVATION_DATE, REMARKS, "
					+ "TRANS_COUNT, TODAY_TRANS_AMT, TICKET_SIZE, DAILY_LIMIT)"
					
					+ " values (0, '"+info.getEntityType()+"', '"+info.getMobileNumber()+"', '"+info.getEmail()+"', 2, 0,"
					+ " 'Customer Name', 'Customer Address',"+" 'Gender',"+info.getPostalCode()+", '"+info.getnID()+"', '"+info.gettIN()+"', '"+info.getPassword()
					+"', '"+info.getiDTPKey()+"', 'App Password', 'Fin Name', 'Primary Acc No.', to_date('"+info.getDateOfBirth()+"', 'dd-mm-yyyy'),"
							+ "to_date('"+formattedDate+"', 'dd-mm-yyyy'), to_date('"+formattedDate+"', 'dd-mm-yyyy'), 'Remarks', 0, 0, 0, 0)";
			
			int insertion = jdbcTemplate.update(sql);
			
			return insertion;
		}
		else {
			return 0;
		}
	}
}
