package com.pluralsight.NorthWindTradersAPI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;


    @Configuration
    public class DbConfiguration
    {
        private BasicDataSource basicDataSource;
        @Bean
        public DataSource dataSource(){
            return basicDataSource;
        }
        public DbConfiguration(@Value("${datasource.url}") String url,
                               @Value("${datasource.username}") String username,
                               @Value("${datasource.password}") String password
        ) {
            basicDataSource = new BasicDataSource();
            basicDataSource.setUrl(url);
            basicDataSource.setUsername(username);
            basicDataSource.setPassword(password);
        }

        public BasicDataSource getBasicDataSource() {
            return basicDataSource;
        }
//        @Bean
//        public DataSource dataSource(){
//            return basicDataSource;
//        }
    }
