package com.pim.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pim.PIMProject.Model.ContactReference;
import com.pim.PIMProject.Model.Creds;
import com.pim.PIMProject.Model.CustomerProfile;
import com.pim.PIMProject.Model.DeviceInfo;
import com.pim.PIMProject.Model.FinancialInstitutionInfo;
import com.pim.PIMProject.Model.Info;
import com.pim.PIMProject.Model.OtherInfo;
import com.pim.PIMProject.Model.RegisterUser;
import com.pim.PIMProject.Model.RequestedVirtualID;

@Repository
public class UserRegistrationRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public int insertUserRegistration(RegisterUser ru) {
		
//		Info info = ru.getEntity().getInfo();
//		
//		String sqll = "select * from t_customer_profiles where nid = '"+ru.getEntity().getInfo().getnID()+"'";
//		List <CustomerProfile> userData = jdbcTemplate.query(sqll, BeanPropertyRowMapper.newInstance(CustomerProfile.class));
//		
//		if (userData.isEmpty()) {
//			/*String sql = "insert into t_customer_profiles (APPLICATION_ID, ENTITY_TYPE, MOBILE_NO, EMAIL, BRANCH_ID, CUSTOMER_ID, CUSTOMER_NAME, CUSTOMER_ADDRESS,"
//					+ " GENDER, POST_CODE, NID, TIN_NO, PASSWORD, IDTP_PIN, APP_PASSWORD, FIN_NAME, PRIMARY_ACCOUNT_NO, BIRTH_DATE, REGISTRATION_DATE, ACTIVATION_DATE, "
//					+ " ACTIVATED_BY, REMARKS, TRANS_COUNT, TODAY_TRANS_AMT, TICKET_SIZE, DAILY_LIMIT, STATUS)"*/
//			
//			String sql = "insert into t_customer_profiles (APPLICATION_ID, ENTITY_TYPE, MOBILE_NO, EMAIL,"
//					+ " POST_CODE, NID, TIN_NO, PASSWORD, IDTP_PIN, BIRTH_DATE)"
//					+ " values (0, '"+info.getEntityType()+"', '"+info.getMobileNumber()+"', '"+info.getEmail()+"', '"+"', '"+info.getPostalCode()+"', '"+info.getnID()
//					+"', '"+info.gettIN()+"', '"+info.getPassword()+"', '"+info.getiDTPKey()+"', '"+info.getDateOfBirth()+"')";
//			
//			int insertion = jdbcTemplate.update(sql);
//			
//			return insertion;
//		}
//		else {
			return 0;
//		}
	}
}
