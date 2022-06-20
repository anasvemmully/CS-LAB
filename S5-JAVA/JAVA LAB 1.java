// Write a java program to display Armstrrongnunmbers within a range

import java.util.*;
class pg
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int l,h,i,rem,sum,num;
        System.out.println("ENTER THE LOWER LIMIT AND UPPER LIMIT:");
        l=in.nextInt();
        h=in.nextInt();

        System.out.println("ARMSTRONG NUMBERS:");
        for(i=l;i<=h;i++)
        {
            num=i;
            sum=0;
            while(num!=0)
            {
                rem=num%10;
                int b = Integer.valueOf(String.valueOf(i).length());
                sum=(int) (sum+Math.pow(rem,b));
                num=num/10;
            }
            if(sum==i)
            System.out.println(i);
        }
    }
}
