// Write a program to count and display total
// number of objects created to a class 
// (Hint : static members)

import java.util.*;

class pg16{
    public static void main(String args[]){
        char ch;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter y/n to create an object for the class pg3");
            ch = sc.next().charAt(0);
            switch(ch){
                case 'y':
                case 'Y':
                    Object obj = new Object();
                    break;
                case 'n':
                case 'N':
                    System.out.println("Total no of objects created: " + Object.count );
                    System.exit(0);
                    break;
            
            }
        }
    }
}

class Object{
    static int count = 0;
    Object(){
        count++;
    }
}