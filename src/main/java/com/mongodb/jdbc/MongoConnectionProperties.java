package com.mongodb.jdbc;

import com.mongodb.ConnectionString;
import java.io.File;
import java.util.logging.Level;

public class MongoConnectionProperties {
    private ConnectionString connectionString;
    private String database;
    private Level logLevel;
    private File logDir;
    private String clientInfo;

    public MongoConnectionProperties(
            ConnectionString connectionString,
            String database,
            Level logLevel,
            File logDir,
            String clientInfo) {
        this.connectionString = connectionString;
        this.database = database;
        this.logLevel = logLevel;
        this.logDir = logDir;
        this.clientInfo = clientInfo;
    }

    public ConnectionString getConnectionString() {
        return connectionString;
    }

    public String getDatabase() {
        return database;
    }

    public Level getLogLevel() {
        return logLevel;
    }

    public File getLogDir() {
        return logDir;
    }

    public String getClientInfo() {
        return clientInfo;
    }
}
