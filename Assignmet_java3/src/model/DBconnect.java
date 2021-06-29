/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class DBconnect {
    public static Connection getconnect(String database) throws SQLException{
        String usser = "sa";
        String pass = "";
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName="+database;
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection con = DriverManager.getConnection(url, usser, pass);
             return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
           
                    }
}
