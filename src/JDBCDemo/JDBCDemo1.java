package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. create the connection
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/college";

        Connection con = DriverManager.getConnection(url,username,password);

        // 3. create statement
        Statement st = con.createStatement();

        // 4. execute query ( DML - Data manipulation language ) - insert update delete
    //    String sql = "insert into student values(12,'malati','ENTC',57)";
     //   String sql = "update student set branch='IT' where rno=12";
        String sql = "delete from student where name='amol'";

        st.executeUpdate(sql); // insert / update / delete
    }
}
