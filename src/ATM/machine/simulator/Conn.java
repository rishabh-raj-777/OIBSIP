package ATM.machine.simulator;


import java.sql.*;

public class Conn {
    Connection connection;
    public Statement statement;

    public Conn(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "password");//Enter your own password in the "password" feild so that you can connect to your database server.
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
