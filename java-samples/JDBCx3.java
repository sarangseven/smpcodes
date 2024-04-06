import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCx3 {
    public static void main(String args[]) throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db12", "root", "root");
        Statement stmt= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=stmt.executeQuery("select * from emp");
        System.out.println("records in table are...");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getInt(3));
        }
        con.close();
    }
}
