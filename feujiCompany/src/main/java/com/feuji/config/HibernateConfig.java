package com.feuji.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySources(value = { @PropertySource(value = "classpath:dbConnection.properties") })
public class HibernateConfig {
	@Autowired
	private Environment environment;
	@Bean
	public Properties properties() {
		Properties properties=new Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("dialect"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("show_sql"));
		properties.put("hibernate.format_sql",environment.getRequiredProperty("format_sql"));
		properties.put("hibernate.hbm2ddl.auto",environment.getRequiredProperty("hbm2ddl.auto"));
		return properties;
		
	}

	@Bean
	public DataSource datasource() {
	
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName(environment.getRequiredProperty("driver"));
		dataSource.setUrl(environment.getRequiredProperty("url"));
		dataSource.setUsername(environment.getRequiredProperty("set"));
		dataSource.setPassword(environment.getRequiredProperty("password"));
		return dataSource;

	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean session=new LocalSessionFactoryBean();
		session.setDataSource(datasource());
		session.setPackagesToScan("com.feuji.entity");
		session.setHibernateProperties(properties());
		
		return session ;
		
	}
	@Bean
	public HibernateTransactionManager getTranscationManager() {
		HibernateTransactionManager manager=new HibernateTransactionManager();	
		manager.setSessionFactory(sessionFactory().getObject());
		return manager;
		
	}
	@Bean
	public HibernateTemplate hibernateTemple() {
		HibernateTemplate template=new HibernateTemplate(sessionFactory().getObject());
		return template;
	}

}
