package com.BookStore.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.BookStore.dao","com.BookStore.mapper","com.BookStore.pojo","com.BookStore.service"})
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@EnableTransactionManagement
@Import({jdbcConfig.class,mybatisConfig.class})
public class SpringConfig {
}
