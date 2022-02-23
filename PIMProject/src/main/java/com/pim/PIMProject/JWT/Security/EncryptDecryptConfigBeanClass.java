package com.pim.PIMProject.JWT.Security;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class EncryptDecryptConfigBeanClass {
	public static SimpleStringPBEConfig getSimpleStringPBEConfig() {
	      final SimpleStringPBEConfig pbeConfig = new SimpleStringPBEConfig();
//	      pbeConfig.setPassword("javacodegeek"); 
	      pbeConfig.setPassword("12345678");//encryptor private key
	      pbeConfig.setAlgorithm("PBEWithMD5AndDES");
	      //pbeConfig.setAlgorithm("AES");
	      pbeConfig.setKeyObtentionIterations("1000");
	      pbeConfig.setPoolSize("10");
	      pbeConfig.setProviderName("SunJCE");
	      pbeConfig.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
	      pbeConfig.setStringOutputType("base64");

	      return pbeConfig;
	  }

	  @Bean(name = "jasyptStringEncryptor")
	  public StringEncryptor encryptor() {
	      final PooledPBEStringEncryptor pbeStringEncryptor = new PooledPBEStringEncryptor();
	      pbeStringEncryptor.setConfig(getSimpleStringPBEConfig());

	      return pbeStringEncryptor;
	  }
	  

	  @Bean(name = "passwordEncoder")
	  public PasswordEncoder pe () {
		  return new BCryptPasswordEncoder();
	  }
}
