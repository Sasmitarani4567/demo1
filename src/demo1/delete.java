

package demo1;
import java.sql.*;
import java.util.*;

public class delete {

    public static void main(String[] args) {
        
        String department;
        int id;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  old ID");
        id=sc.nextInt();   
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");  
            if(con!=null)
            {
            System.out.println("Connected");
                PreparedStatement ps=con.prepareStatement("delete from registration where id=?");
                ps.setInt(1, id);
                int i=ps.executeUpdate();
                if(i>0)
                    System.out.println("Record deleted");
                else
                    System.out.println("Record notdeleted");
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