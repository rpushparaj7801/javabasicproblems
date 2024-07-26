package jdbc;

import java.sql.*;

public class jdbcdemo {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String url="jdbc:mysql://localhost:3306/jdbcdemo";
        String username="root";
        String password = "Pushpa@7801";
        String query = "select * from student ";


        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println("student id is " + rs.getInt(1));
            System.out.println("student name is " + rs.getString(2));
            System.out.println("student address is " + rs.getString(3));
            System.out.println("student age is " + rs.getInt(4));
            System.out.println("student percentage is " + rs.getInt(5));
            System.out.println("student grade is " + rs.getString(6));
        }
            con.close();

    }
}
