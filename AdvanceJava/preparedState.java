package AdvanceJava;

import java.sql.*;


public class preparedState {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/college";
        String uname= "root";
        String pwd = "Root123@";
        String query = "insert into Student values(?,?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pwd);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,4);
        st.setInt(2,28);
        st.setString(3,"Bcom");
        st.executeUpdate();
        System.out.println("Record Updated");
        st.close();
        con.close();

    }
}
