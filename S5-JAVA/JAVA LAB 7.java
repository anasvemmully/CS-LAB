// write a program base conversion 
// a) integer to binary 
// b) integer to octal 
// c) integer to hexa decimal 

import java.util.Scanner;

class convert{
    // public static void BuiltinConvert(int n){
    //     System.out.println(Integer.toBinaryString(n));
    //     System.out.println(Integer.toOctalString(n));
    //     System.out.println(Integer.toHexString(n));
    // }
    public static void Convert(int n){
        convert.binary(n);
        convert.octal(n);
        convert.hexadecimal(n);
    }
    public static void binary(int n){
        int rem;
        String binary = "";
        char bin[]={'0','1'};
        while(n>0)
        {
            rem = n%2;
            binary = bin[rem] + binary;
            n = n/2;
        }
        System.out.print("\nBinary : " + binary); 
    }
    public static void octal(int n){
        int rem;
        String octal = "";
        char oct[]={'0','1','2','3','4','5','6','7'};
        while(n>0)
        {
            rem = n%8;
            octal = oct[rem] + octal;
            n = n/8;
        }
        System.out.print("\nOctal : " + octal); 
    }
    public static void hexadecimal(int n){
        int rem;
        String hexadecimal = "";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n>0)
        {
            rem = n%16;
            hexadecimal = hex[rem] + hexadecimal;
            n = n/16;
        }
        System.out.print("\nHexadecimal : " +hexadecimal); 
    }
}

public class pg7 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        in.close();
        // convert.BuiltinConvert(n);
        convert.Convert(n);
    }
}
