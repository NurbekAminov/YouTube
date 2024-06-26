package com.example.service;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Component
public class CommandLineRunnerService implements CommandLineRunner {
    @Autowired
    private DataSource dataSource;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner");
        Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();

    }
}
