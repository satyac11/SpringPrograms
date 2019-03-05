package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean
	public Employee getEmployee() {
		return new Employee("satya",705,27);
	}
}
