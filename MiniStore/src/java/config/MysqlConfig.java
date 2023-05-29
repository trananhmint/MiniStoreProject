/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class MysqlConfig {
        public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection con= null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url= "jdbc:sqlserver://localhost:1433;databaseName=MiniStore";
        con= DriverManager.getConnection(url, "sa", "12345");
        return con;
    }
}
