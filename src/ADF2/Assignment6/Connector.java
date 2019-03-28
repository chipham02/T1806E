package ADF2.Assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
    final static String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    final static String JDBC_URL = "jdbc:mysql://localhost:3306/t1806e";
    final static String JDBC_USER = "root";
    final static String JDBC_PASS = "";

    public Connector conn;
    public Statement statement;

    public static Connector instance;

    private Connector(){
        try {
            Class.forName(Connector.JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(Connector.JDBC_URL,Connector.JDBC_USER,Connector.JDBC_PASS);
            statement = conn.createStatement();

        }catch (ClassNotFoundException e){

        }catch (SQLException e){}
    }


    /*public static Connector getInstance(){
        if (instance==null){
            synchronized (Connector.class){
                instance = new Connector();
            }
        }
        return instance;
    }*/

    public static Connector getInstance(){
        if (instance == null){
            instance = new Connector();
        }
        return instance;
    }
}
