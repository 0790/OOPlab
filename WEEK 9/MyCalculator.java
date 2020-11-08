mport java.util.*;
import java.util.Scanner;
public class MyCalculator{
    int power(int n, int p) throws Exception{
        if(n<0 || p<0)
            throw new Exception("n and p should not be negative");
        else if(n==0 || p == 0) 
            throw new Exception("n and p should not be zero") ;
        return (int)Math.pow((double)n,(double)p);
    }
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        
            int n = in.nextInt();
            int p = in.nextInt();
            MyCalculator M = new MyCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        
    }
}

