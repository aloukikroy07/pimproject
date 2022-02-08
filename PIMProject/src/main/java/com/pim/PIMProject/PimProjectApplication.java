package com.pim.PIMProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.pim.PIMProject", "com.pim.controller", "com.pim.service", "com.pim.repository", "com.pim.model"})
public class PimProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PimProjectApplication.class, args);
	}

}
