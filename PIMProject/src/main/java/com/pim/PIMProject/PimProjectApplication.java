package com.pim.PIMProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.pim.PIMProject", "com.pim.controller", "com.pim.service", "com.pim.repository", "com.pim.model"})

public class PimProjectApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(PimProjectApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PimProjectApplication.class, args);
		
//		LOGGER.info("Info level log message");
//        LOGGER.debug("Debug level log message");
//        LOGGER.error("Error level log message");
	}

}
