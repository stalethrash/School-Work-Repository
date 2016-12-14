/*
 * Mitch Meyer
 * 5/3/2016
 * Assignment 8.1
 * Bellevue University
 * MyDataBase.java
 */

package coffeeBeans;

import java.sql.*;
import java.net.URL;

public class MyDataBase {
    
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    
    private String userID = null;
    private String password = null;
    
    public void setUserID(String user){
        
        userID = user;
    }
    
    public void setPassword(String pass){
        
        password = pass;
    }
    
    public ResultSet getResults(String SQL){
        
        try{
            DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", userID, password);
            statement = connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            resultSet = statement.executeQuery(SQL);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return resultSet;
    }
    
    public void updateDatabase(String SQL){
        
        try{DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", userID, password);
            statement = connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            
           statement.executeUpdate(SQL);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        }
    
    public void closeConnection(){
        
        try{
            statement.close();
            connection.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
