package AdvanceJava;
import java.sql.*;
public class JdbcDe {
    public static void main(String[] args) throws Exception{
        String url ="jdbc:mysql://localhost:3306/college";
        String uname = "root";
        String pwd = "Root123@";
        String query = "select * from Student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pwd);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

//        String name = "";
        while (rs.next()) {
            String name = rs.getInt(1) + "|" + rs.getInt(2);
            System.out.println(name);
        }

//        rs.next();
//        name = rs.getInt(1) + "|" + rs.getInt(2);
//        System.out.println(name);




        con.close();
        st.close();
        

    }
}
