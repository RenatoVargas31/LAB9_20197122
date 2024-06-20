package com.example.lab9_20197122.Daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoBase {

        public Connection getConection() throws SQLException {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Falla conexion");
            }

            String username = "root";
            String password = "root";
            String database = "lab9_691";
            String params = "serverTimezone=America/Lima&useSSL=false&allowPublicKeyRetrieval=true";
            String url = "jdbc:mysql://localhost:3306/" + database + "?" + params;

            return DriverManager.getConnection(url, username, password);

        }
}
