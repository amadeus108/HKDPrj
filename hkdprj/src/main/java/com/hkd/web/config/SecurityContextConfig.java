package com.hkd.web.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@ComponentScan("com.hkd.web.config")
@EnableWebSecurity //security 활성화
public class SecurityContextConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private BasicDataSource dataSource;
	
	
	
	
}







