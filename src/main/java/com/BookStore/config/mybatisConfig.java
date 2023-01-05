package com.BookStore.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class mybatisConfig {
    @Bean
    public SqlSessionFactoryBean sessionFactory(DataSource dataSource){
        SqlSessionFactoryBean SSFB =new SqlSessionFactoryBean();
        SSFB.setDataSource(dataSource);
        SSFB.setTypeAliasesPackage("com.BookStore.pojo");
        return SSFB;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer MSC =new MapperScannerConfigurer();
        MSC.setBasePackage("com.BookStore.mapper");
        return MSC;
    }
}
