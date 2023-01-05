package com.BookStore.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

public class jdbcConfig {
    @Value("${driver}")
    private String Driver;
    @Value("${url}")
    private String Url;
    @Value("${user}")
    private String UserName;
    @Value("${password}")
    private String Password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource Ds=new DruidDataSource();
        Ds.setDriverClassName(Driver);
        Ds.setUrl(Url);
        Ds.setUsername(UserName);
        Ds.setPassword(Password);
        return Ds;
    }
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager DSTM =new DataSourceTransactionManager();
        DSTM.setDataSource(dataSource);
        return DSTM;
    }
}
