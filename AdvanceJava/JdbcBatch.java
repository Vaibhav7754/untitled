package AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcBatch {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/college";
        String uname= "root";
        String pwd = "Root123@";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pwd);
        con.setAutoCommit(false);
        Statement st = con.createStatement();
        st.addBatch("insert into Student values(22,32,'MBA')");
        st.addBatch("insert into Student values(23,33,'MCA')");
        st.executeBatch();
        con.commit();
        con.close();


    }
}
