package com.boot.datasource;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atomikos.jdbc.AtomikosDataSourceBean;

import com.boot.config.DBConfig1;
import com.boot.config.DBConfig2;
import com.mysql.cj.jdbc.MysqlXADataSource;

import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
@MapperScan(basePackages="com.boot.test02", sqlSessionTemplateRef = "test2SqlSessionTemplate")
public class MyBatiesConfig2 {

	@Bean(name = "test2DataSource")
	public DataSource testDataSource(DBConfig2 testConfig) throws SQLException {
		
		MysqlXADataSource mysqlXADataSource = new MysqlXADataSource();
		mysqlXADataSource.setUrl(testConfig.getUrl());
		mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
		mysqlXADataSource.setPassword(testConfig.getPassword());
		mysqlXADataSource.setUser(testConfig.getUsername());
		
		// 将本地事务注册到 Atomikos
		AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
		xaDataSource.setXaDataSource(mysqlXADataSource);
		xaDataSource.setUniqueResourceName("test2DataSource");
		
		xaDataSource.setMinPoolSize(testConfig.getMinPoolSize());
		xaDataSource.setMaxPoolSize(testConfig.getMaxPoolSize());
		xaDataSource.setMaxLifetime(testConfig.getMaxLifetime());
		xaDataSource.setBorrowConnectionTimeout(testConfig.getBorrowConnectionTimeout());
		xaDataSource.setLoginTimeout(testConfig.getLoginTimeout());
		xaDataSource.setMaintenanceInterval(testConfig.getMaintenanceInterval());
		xaDataSource.setMaxIdleTime(testConfig.getMaxIdleTime());
		xaDataSource.setTestQuery(testConfig.getTestQuery());
		
		return xaDataSource;
	}
	
	@Bean(name = "test2SqlSessionFactory")
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test2DataSource") DataSource dataSource)
			throws Exception {
		
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		
		return bean.getObject();
	}
	
	@Bean(name = "test2SqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
		
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
}














