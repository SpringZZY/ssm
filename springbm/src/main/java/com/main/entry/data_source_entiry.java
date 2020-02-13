package com.main.entry;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@PropertySource(value = {"classpath:config/application.properties"})
@Component
@ConfigurationProperties(prefix = "spring.datasource")
@Configuration
public class data_source_entiry {
    
    
    @Value("${spring.jpa.database}")
    private String database;
    
    private String driverClassName;
    private String type;
    private String url;
    private String username;
    private String password;
    private String initialSize;
    private String minIdle;
    private String maxActive;
    private String maxWait;
    private String timeBetweenEvictionRunsMillis;
    private String validationQuery;
    private String testWhileIdle;
    private String testOnBorrow;
    private String testOnReturn;
    private String poolPreparedStatements;
    private String maxPoolPreparedStatementPerConnectionSize;
    private String filters;
    private String connectionProperties;
    private String mapperLocations;
    private String typeAliasesPackag;
   
    @Override
    public String toString() {
        return "data_source_entiry [database=" + database + ", driverClassName=" + driverClassName + ", type=" + type
                + ", url=" + url + ", username=" + username + ", password=" + password + ", initialSize=" + initialSize
                + ", minIdle=" + minIdle + ", maxActive=" + maxActive + ", maxWait=" + maxWait
                + ", timeBetweenEvictionRunsMillis=" + timeBetweenEvictionRunsMillis + ", validationQuery="
                + validationQuery + ", testWhileIdle=" + testWhileIdle + ", testOnBorrow=" + testOnBorrow
                + ", testOnReturn=" + testOnReturn + ", poolPreparedStatements=" + poolPreparedStatements
                + ", maxPoolPreparedStatementPerConnectionSize=" + maxPoolPreparedStatementPerConnectionSize
                + ", filters=" + filters + ", connectionProperties=" + connectionProperties + ", mapperLocations="
                + mapperLocations + ", typeAliasesPackag=" + typeAliasesPackag + "]";
    }


    public String getDatabase() {
        return database;
    }


    public void setDatabase(String database) {
        this.database = database;
    }


    public String getDriverClassName() {
        return driverClassName;
    }


    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


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


    public String getInitialSize() {
        return initialSize;
    }


    public void setInitialSize(String initialSize) {
        this.initialSize = initialSize;
    }


    public String getMinIdle() {
        return minIdle;
    }


    public void setMinIdle(String minIdle) {
        this.minIdle = minIdle;
    }


    public String getMaxActive() {
        return maxActive;
    }


    public void setMaxActive(String maxActive) {
        this.maxActive = maxActive;
    }


    public String getMaxWait() {
        return maxWait;
    }


    public void setMaxWait(String maxWait) {
        this.maxWait = maxWait;
    }


    public String getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }


    public void setTimeBetweenEvictionRunsMillis(String timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }


    public String getValidationQuery() {
        return validationQuery;
    }


    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }


    public String getTestWhileIdle() {
        return testWhileIdle;
    }


    public void setTestWhileIdle(String testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }


    public String getTestOnBorrow() {
        return testOnBorrow;
    }


    public void setTestOnBorrow(String testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }


    public String getTestOnReturn() {
        return testOnReturn;
    }


    public void setTestOnReturn(String testOnReturn) {
        this.testOnReturn = testOnReturn;
    }


    public String getPoolPreparedStatements() {
        return poolPreparedStatements;
    }


    public void setPoolPreparedStatements(String poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }


    public String getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }


    public void setMaxPoolPreparedStatementPerConnectionSize(String maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }


    public String getFilters() {
        return filters;
    }


    public void setFilters(String filters) {
        this.filters = filters;
    }


    public String getConnectionProperties() {
        return connectionProperties;
    }


    public void setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
    }


    public String getMapperLocations() {
        return mapperLocations;
    }


    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }


    public String getTypeAliasesPackag() {
        return typeAliasesPackag;
    }


    public void setTypeAliasesPackag(String typeAliasesPackag) {
        this.typeAliasesPackag = typeAliasesPackag;
    }
    
    @Bean
    @Primary
    public DataSource setDataSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driverClassName);
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }
    
}
