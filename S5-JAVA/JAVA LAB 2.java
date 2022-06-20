Write a program to find te sum, difference, product
quotient and remainder of two numbers passed as command line arguments.

import java.util.Scanner;

public class pg2{
    static Float a;
    static Float b;
    public static void main(String[] args){
        try{
            pg2.a = Float.parseFloat(args[0]);
            pg2.b = Float.parseFloat(args[1]);
        }
        catch(Exception e){
            System.out.println("\nError : try giving numbers to perform operation" );
            System.exit(0);
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("\nChoose the operation to perform : \n1. sum\n2. Difference\n3. Product\n4. Quotient\n5. Remainder\n");
        int ch = in.nextInt();
        switch(ch){
            case 1 :
                System.out.println("\nSum of " + pg2.a + " and " + pg2.b + " is : " + (pg2.a+pg2.b));
                break;
            case 2 :
                System.out.println("\nDifference of " + pg2.a + " and " + pg2.b + " is : " + (pg2.a-pg2.b));
                break;
            case 3 :
                System.out.println("\nProduct of " + pg2.a + " and " + pg2.b + " is : " + (pg2.a*pg2.b));
                break;
            case 4 :
                System.out.println("\nQuotient of " + pg2.a + " and " + pg2.b + " is : " + (pg2.a/pg2.b));
                break;
            case 5 :
                System.out.println("\nRemainder of " + pg2.a + " and " + pg2.b + " is : " + (pg2.a%pg2.b));
                break;
            default : 
                System.out.println("\nChoose a valid option");
                System.exit(0);
        }

        
    } 
}