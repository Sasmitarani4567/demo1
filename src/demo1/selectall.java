package demo1;

import java.sql.*;
import java.util.*;
public class selectall {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            if(con!=null)
            {
            System.out.println("Connected");
                PreparedStatement ps=con.prepareStatement("Select * from registration");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                    System.out.println("Id      :   "+rs.getInt(1));
                    System.out.println("Name    :   "+rs.getString(2));
                    System.out.println("Departmnt  :   "+rs.getString(3));
                    System.out.println("age  :   "+rs.getInt(4));
                }
                
            }
            else
                System.out.println("Not Connected");
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        
    }

}
