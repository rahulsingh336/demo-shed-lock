package com.example.demoshedlock.configuration;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class SchedulerlockConfig {
    @Bean
    public LockProvider lockProvider(DataSource dataSource) {
//        return new JdbcTemplateLockProvider(dataSource);
        return new JdbcTemplateLockProvider(
                JdbcTemplateLockProvider.Configuration.builder()
                        .withJdbcTemplate(new JdbcTemplate(dataSource))
                        .usingDbTime() // Works on Postgres, MySQL, MariaDb, MS SQL, Oracle, DB2, HSQL and H2
                        .withTableName("localschedular.shedlock")
                        .withLockedByValue("Some-dynamic-node")
                        .build()
        );
    }
}