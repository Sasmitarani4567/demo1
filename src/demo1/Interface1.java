
package demo1;
interface test2 {
  public void m1();  
}
public class Interface1{

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
       test2 i=()->System.out.println("hi");
        i.m1();
    }
}
