package com.example.demo.db2.config;


import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "db2EntityManagerFactory",
		transactionManagerRef = "db2TransactionManager",
		basePackages = "com.example.demo.db2.repo"
		)
public class DbTwoConfig {

	// DataSource
	@Bean
	@ConfigurationProperties(prefix = "db2.datasource")
	public DataSource db2DataSource() {
		return DataSourceBuilder.create().build();
	}

	// EntityManagerFactory
	@Bean
	public LocalContainerEntityManagerFactoryBean db2EntityManagerFactory(EntityManagerFactoryBuilder emfb) {
		HashMap<String, Object> props = new HashMap<>();
		props.put("hibernate.hbm2ddl.auto", "create");
		props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL10Dialect");
		return emfb.dataSource(db2DataSource())
				.packages("com.example.demo.db2.entity")
				.properties(props)
				.build();

	}

	// TransactionManager
	@Bean
	public PlatformTransactionManager db2TransactionManager(
			@Qualifier("db2EntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
}
