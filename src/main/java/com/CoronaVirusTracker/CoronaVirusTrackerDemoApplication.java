package com.CoronaVirusTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaVirusTrackerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusTrackerDemoApplication.class, args);
	}

}
