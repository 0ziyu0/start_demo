package com.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="spring.datasource.test1")
public class DBConfig1 {

	private String url;
	private String username;
	private String password;
	private Integer minPoolSize;
	private Integer maxPoolSize;
	private Integer maxLifetime;
	private Integer borrowConnectionTimeout;
	private Integer loginTimeout;
	private Integer maintenanceInterval;
	private Integer maxIdleTime;
	private String testQuery;
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getMinPoolSize() {
		return minPoolSize;
	}
	public void setMinPoolSize(Integer minPoolSize) {
		this.minPoolSize = minPoolSize;
	}
	public Integer getMaxPoolSize() {
		return maxPoolSize;
	}
	public void setMaxPoolSize(Integer maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}
	public Integer getMaxLifetime() {
		return maxLifetime;
	}
	public void setMaxLifetime(Integer maxLifetime) {
		this.maxLifetime = maxLifetime;
	}
	public Integer getBorrowConnectionTimeout() {
		return borrowConnectionTimeout;
	}
	public void setBorrowConnectionTimeout(Integer borrowConnectionTimeout) {
		this.borrowConnectionTimeout = borrowConnectionTimeout;
	}
	public Integer getLoginTimeout() {
		return loginTimeout;
	}
	public void setLoginTimeout(Integer loginTimeout) {
		this.loginTimeout = loginTimeout;
	}
	public Integer getMaintenanceInterval() {
		return maintenanceInterval;
	}
	public void setMaintenanceInterval(Integer maintenanceInterval) {
		this.maintenanceInterval = maintenanceInterval;
	}
	public Integer getMaxIdleTime() {
		return maxIdleTime;
	}
	public void setMaxIdleTime(Integer maxIdleTime) {
		this.maxIdleTime = maxIdleTime;
	}
	public String getTestQuery() {
		return testQuery;
	}
	public void setTestQuery(String testQuery) {
		this.testQuery = testQuery;
	}
	
}
