package Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnections {
    static Connection connection;

    public static  Connection createconnectiontoOrtho(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // getting the driver
            // creating the connection with the database
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/orthodontic department?useSSL=false"
                    ,"root"
                    ,"Password");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static  Connection createconnectiontoTeethcleaning(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // getting the driver
            // creating the connection with the database
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Teethcleaning?useSSL=false"
                    ,"root"
                    ,"Password");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static  Connection createconnectiontoimplantsandextraction(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // getting the driver
            // creating the connection with the database
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/implantsandextraction?useSSL=false"
                    ,"root"
                    ,"Password");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


}
