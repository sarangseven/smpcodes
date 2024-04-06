import java.sql.*;

public class JDBCx2 {
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db12", "root", "root");
        System.out.println("Connection Established");
        Statement stmt =con.createStatement();
        String sql="delete from emp where id=101";
        int i=stmt.executeUpdate(sql);
        if(i>0)
        {
            System.out.println("record deleted");
        }
        else
        {
            System.out.println("record not deleted");
        }
        con.close();
    }
    
}
