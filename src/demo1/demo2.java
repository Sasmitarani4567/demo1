
package demo1;
import java.util.*;
public class demo2 
{
    int x=5;
    void display(int x)
    {
        System.out.println(this.x+this.x);
        
    }
}
 class operator1 extends demo2{
     void display1()
    {
        System.out.println("chlid method");
        
    }
    public static void main(String[] args)
    {
       demo2 d=new demo2();
       d.display(10);
       
       
    }
    
}





