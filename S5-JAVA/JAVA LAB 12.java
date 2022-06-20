// Write java program to find the sum of the digits
// and reverse of a given number using class and objects

import java.util.*;
class Sum
{
    void reverse(int no)
    {
        
        int r,rev=0,sum=0;
        while(no>0)
        {
            r=no%10;
            sum=sum+r;
            rev=rev*10+r;
            no=no/10;
        }
        System.out.println("sum=" +sum);
        System.out.println("reverse=" +rev);
        
        }
    }

public class Sumrev { 
    public static void main(String[] args) {

       Scanner in =new Scanner(System.in);
       System.out.print("enter a number:");
       int n=in.nextInt();
       in.close();
       Sum ob=new Sum();
       ob.reverse(n);
       
    }
    
}
