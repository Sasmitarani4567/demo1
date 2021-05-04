
package demo1;
import java.sql.*;
import java.util.*;

public class test {

    public static void main(String[] args) {
        
        String name,department;
        int age,id;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID");
        id=sc.nextInt();
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Department");
        department=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","");  
            if(con!=null)
            {
            System.out.println("Connected");
                PreparedStatement ps=con.prepareStatement("insert into registration values(?,?,?,?)");
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, department);
                ps.setInt(4, age);
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