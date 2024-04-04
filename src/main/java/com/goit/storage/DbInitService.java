package com.goit.storage;

import org.flywaydb.core.Flyway;

public class DbInitService {

    public void initDb(String connectionUrl) {

        Flyway flyway = Flyway
                .configure()
                .dataSource(connectionUrl, null, null)
                .load();

        flyway.migrate();
    }
}
