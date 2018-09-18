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
@EnableTransactionManagement //hibernate 설정
@ComponentScan(basePackages= {"com.hkd.web.dao.hb", "com.hkd.web.service"})
public class ServiceContextConfig {
	
	public BasicDataSource basicDataSource() {
		
		BasicDataSource basicDataSource = new BasicDataSource();
		
		/*mysql*/
/*		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost/newlecturedb?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf8");
		basicDataSource.setUsername("hong");
		basicDataSource.setPassword("1234");*/
		
		basicDataSource.setRemoveAbandoned(true);
		basicDataSource.setInitialSize(20);
		basicDataSource.setMaxActive(30);
		
		return basicDataSource;
	}
	
	//hibernate 설정을 위한 Bean 객체들
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		Properties props = new Properties();
		//props.put("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect"); //연결할 DB가 무엇인지 설정
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.put("hibernate.show_sql", "true"); //콘솔에 찍어주세요
		
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(basicDataSource());
		sessionFactoryBean.setPackagesToScan("com.hkd.web.entity");
		sessionFactoryBean.setHibernateProperties(props);
		
		return sessionFactoryBean;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		//transactionManager 는 sessionFactory를 반환해야 하는데 위 LocalSessionFactoryBean가 SessionFactory를 만들었다, getObject()로 반환할 수 있다. 
		
		return transactionManager;
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
	@Bean
	public JavaMailSender mailSender() {
		
		//이메일 보낼 때 이용할 smtp 정보
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		
		mailSender.setDefaultEncoding("UTF-8");
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587); //gmail 기본 설정
		mailSender.setUsername("amadeus0108@gmail.com");
		mailSender.setPassword("Skscjswo3#");
		
		//이메일 보낼 때 이용할 설정값
		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.smtp.auth", true);
		javaMailProperties.put("mail.smtp.starttls.enable", true);
		javaMailProperties.put("mail.debug", true);
		mailSender.setJavaMailProperties(javaMailProperties);
		
		return mailSender;
		
	}
	
}



