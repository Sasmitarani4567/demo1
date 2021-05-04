
package demo1;
import java.sql.*;
import java.util.*;

public class update {

    public static void main(String[] args) {
        
        String department;
        int id;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  old ID");
        id=sc.nextInt();
        System.out.println("Enter  new Department");
        department=sc.next();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");  
            if(con!=null)
            {
            System.out.println("Connected");
                PreparedStatement ps=con.prepareStatement("update registration set department=?where id=?");
                ps.setString(1, department);
                ps.setInt(2, id);
                int i=ps.executeUpdate();
                if(i>0)
                    System.out.println("Record Inserted");
                else
                    System.out.println("Record not Inserted");
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