package AdvanceJava;

import java.sql.*;
import java.sql.DriverManager;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/college";
        String uname = "root";
        String pwd = "Root123@";
        String query = "select id from Student where age = 25";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,uname,pwd);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("id");
        System.out.println(name);
        st.close();
        con.close();
    }
}
