package com.techprimers.db.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class Configurationg {

    @Bean
    public DataSource getDatasource() {
        DataSourceBuilder dsb = DataSourceBuilder.create();
        dsb.username("root");
        dsb.password(securePasswordService());
        dsb.url("jdbc:mysql://localhost:3306/users");
        return dsb.build();
    }

    private String securePasswordService() {
        return "1234";
    }
}