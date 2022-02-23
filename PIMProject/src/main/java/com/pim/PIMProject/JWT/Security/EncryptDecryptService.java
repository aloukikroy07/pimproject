package com.pim.PIMProject.JWT.Security;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EncryptDecryptService {
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	/*Encrypt the Plain/Decrypted text*/
	public String encryptStringValue(String plainText) {
		final SimpleStringPBEConfig pbeConfig = EncryptDecryptConfigBeanClass.getSimpleStringPBEConfig();
        final PooledPBEStringEncryptor pbeStringEncryptor = new PooledPBEStringEncryptor();
        pbeStringEncryptor.setConfig(pbeConfig);
        
        String encryptedValue = pbeStringEncryptor.encrypt(plainText);
        
		return encryptedValue;
    }
	
	/*Decrypt the encrypted text*/
	public String decryptEncryptedValue(String encryptedValue) {
    	final SimpleStringPBEConfig pbeConfig = EncryptDecryptConfigBeanClass.getSimpleStringPBEConfig();
        final PooledPBEStringEncryptor pbeStringEncryptor = new PooledPBEStringEncryptor();
        pbeStringEncryptor.setConfig(pbeConfig);

        String decryptedValue = pbeStringEncryptor.decrypt(encryptedValue);
      //log.info("Decrypted key = {}", pbeStringEncryptor.decrypt(decryptedValue));
        
        return decryptedValue;
    }
	
	
	public String encodePlainTextString(String plainText) {
		String encodedPwd = passwordEncoder.encode(plainText);
		return encodedPwd;
	}
	
	public boolean matchPlainTextAndEncodedString(String plainText, String encodedString) {
		boolean matched = passwordEncoder.matches(plainText, encodedString);
		return matched;
	}
}
