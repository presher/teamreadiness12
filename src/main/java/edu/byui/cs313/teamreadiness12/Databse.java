/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.cs313.teamreadiness12;

import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jason
 */
public class Databse {
    
      static Connection getConnection() throws Exception {
        Class.forName("org.postgresql.Driver");

        URI dbUri = new URI(" postgres://akxecadeqtliti:Rgf7IMwbe4s6NZFNIFutESbpzc@ec2-54-243-203-141.compute-1.amazonaws.com:5432/d2k1a3nv9nvd42");

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

        return DriverManager.getConnection(dbUrl, username, password);
    }
    
}
