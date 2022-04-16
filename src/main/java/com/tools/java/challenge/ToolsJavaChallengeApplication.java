package com.tools.java.challenge;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class ToolsJavaChallengeApplication{

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(ToolsJavaChallengeApplication.class, args);
	}

}
