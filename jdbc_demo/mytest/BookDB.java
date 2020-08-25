package mytest;

import java.sql.*;

public class BookDB {
    static final String driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/my_book?useUnicode=true&characterEncoding=utf8";
    static final String user = "root";
    static final String password = "";
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public Statement getStatement(){
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public static void close(){
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                statement=null;
            }
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                connection=null;
            }
        }
    }
}
