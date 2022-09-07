package com.session.hibernate.demo.config;

import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

//in this class we are creating all required beans 
@Configuration
public class HibernateConfig {
	
	@Value("${jdbc.url}")
	private String jdbcURL;
	
	@Value("${jdbc.username}")
	private String jdbcUsername;
	
	@Value("${jdbc.password}")
	private String jdbcPassword;
	
	@Value("${jdbc.driverClassName}")
	private String jdbcDriverClassName;
	
		public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		properties.put("hibernate.show_sql",true);
		properties.put("hibernate.format_sql",true);
		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource= new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(jdbcDriverClassName);
		driverManagerDataSource.setUrl(jdbcURL);
		driverManagerDataSource.setUsername(jdbcUsername);
		driverManagerDataSource.setPassword(jdbcPassword);
		return driverManagerDataSource;
	}
	
	//we need this for DAO to connect with DB
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(dataSource());
		localSessionFactoryBean.setHibernateProperties(hibernateProperties());
		localSessionFactoryBean.setPackagesToScan(new String[] {"com.session"});
		return localSessionFactoryBean;
		
	}
	//either all the steps will get complete or non of them using transaction
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory){
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;
		
		
	}
}
