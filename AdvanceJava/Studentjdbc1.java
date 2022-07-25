package AdvanceJava;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Studentjdbc1 {
    public static void main(String[] args) throws Exception {
        List<StudentJdbc> student = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/college";
        String uname= "root";
        String pwd = "Root123@";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pwd);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Student");
        while (rs.next()){
            StudentJdbc stud = new StudentJdbc();
            stud.setId(rs.getInt("id"));
            stud.setAge(rs.getInt("age"));
            stud.setStream(rs.getString("stream"));
            student.add(stud);

        }
        for(StudentJdbc stud:student){
            System.out.println(stud.getId()+" "+stud.getAge()+" "+stud.getStream());
        }
        con.close();

    }
}
