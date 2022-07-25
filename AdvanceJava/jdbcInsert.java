package AdvanceJava;

import java.sql.*;

public class jdbcInsert {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/college";
        String uname= "root";
        String pwd = "Root123@";
        String query = "insert into Student values(12,27,'Elec')";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pwd);
        Statement st = con.createStatement();
        int rs = st.executeUpdate(query);
        System.out.println(rs + " Rows affected");

    }
}
