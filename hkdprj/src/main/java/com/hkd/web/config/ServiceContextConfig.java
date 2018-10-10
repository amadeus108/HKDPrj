package com.hkd.web.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= "com.hkd.web")
public class ServiceContextConfig {
	
	@Bean
	public BasicDataSource basicDataSource() {
		
		BasicDataSource basicDataSource = new BasicDataSource();
		
		/*mysql*/
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://211.238.142.40:3306/coworklinedb?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf8");
		basicDataSource.setUsername("admin");
		basicDataSource.setPassword("0000");
		
		basicDataSource.setRemoveAbandoned(true);
		basicDataSource.setInitialSize(20);
		basicDataSource.setMaxActive(30);
		
		return basicDataSource;
	}
		
	//Mybatis 설정을 위한 Bean 객체들
	//객체 만들때는 SqlSessionFactoryBean, return 할 때는 SqlSessionFactory
	//Dao 객체를 생성하는 Mybatis의 Mapper 객체(쿼리문 포함)
	@Bean
	public SqlSessionFactory sqlSessionFactoryBean(BasicDataSource basicDataSource) throws Exception {
		// IoC 컨테이너를 뒤져서 매개변수 설정에 참조된다. ex) basicDataSource 위에서 설정한 이름 똑같이 해야 한다.
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(basicDataSource);
		sqlSessionFactory.setMapperLocations(
				new PathMatchingResourcePatternResolver()
				.getResources("classpath:com/hkd/web/dao/mybatis/mapper/*.xml")
		);
		
		return sqlSessionFactory.getObject();
	}
	
	//위에서 만든 SqlSessionFactory를 IoC 컨테이너에서 찾아 매개변수에 자동으로 넣어주고
	//SqlSessionTemplate 객체를 반환하자.
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	//이메일을 보내기 위한 준비
//	@Bean
//	public JavaMailSender mailSender() {
//		
//		//이메일 보낼 때 이용할 smtp 정보
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		
//		mailSender.setDefaultEncoding("UTF-8");
//		mailSender.setHost("smtp.gmail.com");
//		mailSender.setPort(587); //gmail 기본 설정
//		mailSender.setUsername("amadeus0108@gmail.com");
//		mailSender.setPassword("Skscjswo3#");
//		
//		//이메일 보낼 때 이용할 설정값
//		Properties javaMailProperties = new Properties();
//		javaMailProperties.put("mail.transport.protocol", "smtp");
//		javaMailProperties.put("mail.smtp.auth", true);
//		javaMailProperties.put("mail.smtp.starttls.enable", true);
//		javaMailProperties.put("mail.debug", true);
//		mailSender.setJavaMailProperties(javaMailProperties);
//		
//		return mailSender;
//		
//	}
	
}



