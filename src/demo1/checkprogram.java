package demo1;
abstract class Calculate  
{  
    abstract int multiply(int a, int b);  
}  
   
 class Main  
{  
    public static void main(String[] args)  
    {  
        /*we can create refeerence of abstract class*/
        int result = new Calculate()  
        {      
            @Override  
            int multiply(int a, int b)  
            {  
                return a*b;  
            }  
        }.multiply(12,32);  
        System.out.println("result = "+result);  
    }  
}  