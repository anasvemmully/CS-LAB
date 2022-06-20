// Write a program to find the distance between two points

import java.lang.Math; 
import java.util.Scanner;

public class pg1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Distance between two points\n**********************************\n");
        System.out.println("Enter co-ordinates for P1 (x and y): ");
        Float P1x = in.nextFloat();
        Float P1y = in.nextFloat();
        System.out.println("\nEnter co-ordinates for P2 (x and y): ");
        Float P2x = in.nextFloat();
        Float P2y = in.nextFloat();
        Float P1 = (P1x-P2x)*(P1x-P2x);
        Float P2 = (P1y-P2y)*(P1y-P2y);
        Double d = (Double)Math.sqrt(P1 + P2); 
        System.out.println("Distance between P1(" +P1x+","+P1y+")" + " and P2("+P2x+","+P2y+")" + " : " + d);
    }
}