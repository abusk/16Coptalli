package com.coptalli.ds;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {

    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource hikariDataSource;
    static {
        Config dbConfig = ConfigFactory.parseResources("bootdb.conf");
        config.setDriverClassName(dbConfig.getString("db.driverClassName"));
        config.setJdbcUrl(dbConfig.getString("db.jdbcUrl"));
        config.setUsername(dbConfig.getString("db.user"));
        config.setPassword(dbConfig.getString("db.password"));
        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );

        hikariDataSource = new HikariDataSource(config);
    }
    private DataSource(){
    }
    public static Connection getConnection() throws SQLException {
       return hikariDataSource.getConnection();
    }

    public static void main(String[] args) throws SQLException {
        Connection c = DataSource.getConnection();
        System.out.println("connection created");
    }
}
