// Given the sides of a traingle , write a program 
// to check whether the triangle is equilateral, 
// isosceles or scalene. and find it's area.

import java.util.Scanner;
import java.lang.Math;
public class pg5 {
    public static void main(String args[]){
            System.out.println("Enter the three sides of traingle : ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double s = (a+b+c)/2;
            System.out.println(s);
            System.out.println(s-a);
            System.out.println(s-b);
            System.out.println(s-c);
            double pre = s*(s-a)*(s-b)*(s-c);
            double area =  Math.sqrt(pre);
            if(a==b && b==c){
                System.out.println("This is a Equalateral Traingle ,with area : "+area);
            }
            else if(a==b || b==c || a==c){
                System.out.println("This is a isosceles Traingle ,with area : " + area );
            }
            else{
                String val = (pre<0)?("Area not possible"):String.valueOf(area);
                System.out.println("This is a scalene Traingle ,with area : "+val);
            }
    }
}
