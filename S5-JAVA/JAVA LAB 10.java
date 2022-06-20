// Write a java program to convert centimeter to inch, meter and kilometer.

import java.util.Scanner;
public class pg10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a measure for centimeter : ");
        Double cm = in.nextDouble();
        System.out.println("\nInch : " + cm/2.54);
        System.out.println("\nMeter : " + cm/100);
        System.out.println("\nKilometer : " + cm/100000);
    }
}