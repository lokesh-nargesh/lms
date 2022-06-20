package library.management.system;

import  java.sql.*;

public class ConnectionProvider {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","1234");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }   
    }
}
