/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;
import java.util.ArrayList;
class Test{
    int roll;
    String name;
}
public class collection {
    public static void main(String[] args){
        ArrayList<String> l1= new ArrayList<String>();
        ArrayList l2= new ArrayList();
        Test t=new Test();
        t.roll=21;
        l1.add("sasmita");
        l1.add("asmita");
        l1.add("smita");
        l2.add(34);
        l2.add(t.roll);
        l2.add(34.444);
        System.out.println("list 1 is" +l1);
        System.out.println("list 2 is" +l2);
                
    }
}
