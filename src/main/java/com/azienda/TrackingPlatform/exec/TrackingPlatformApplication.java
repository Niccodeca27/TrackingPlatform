package com.azienda.TrackingPlatform.exec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.azienda.TrackingPlatform.service", "com.azienda.TrackingPlatform.controller"})
@EnableJpaRepositories(basePackages = {"com.azienda.TrackingPlatform.repository"})
@EntityScan(basePackages = {"com.azienda.TrackingPlatform.model"})
public class TrackingPlatformApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(TrackingPlatformApplication.class, args);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
