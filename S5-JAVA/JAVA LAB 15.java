// Using class and objects , write a java program to
// find the sum of two complex numbers. 
// (Hint : Use oobject as parameters to function) 

import java.util.Scanner;

class Complex{
    int r,i;
    Complex(){}
    Complex(int tempr,int tempi){
        r = tempr;
        i = tempi;
    }
    Complex add(Complex c1, Complex c2){

        Complex temp = new Complex();
        temp.r = c1.r + c2.r;
        temp.i = c1.i + c2.i;
	return temp;
    }
}

public class pg15{
    public static void main(String args[]){
        int a,b;
        Scanner in = new Scanner(System.in);    
        System.out.println("Enter real and imaginary  part of c1 ");
        a = in.nextInt();
        b = in.nextInt();
        Complex c1 = new Complex(a,b);
        
        System.out.println("Enter real and imaginary  part of c2 ");
        a = in.nextInt();
        b = in.nextInt();
        Complex c2 = new Complex(a,b);
        Complex c3 = new Complex(a,b);

        c3 = c3.add(c1,c2);

        System.out.println("Sum of complex : " + "<" + c3.r + "i + " + c3.i + "j >");


    }
}