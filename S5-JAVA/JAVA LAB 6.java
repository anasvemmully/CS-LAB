// Read an array of 10 or more numbers and write a program 
// to find the smallest element in the array, the largest
// element in the array, and the second largest element in the array.

import java.util.Scanner;
public class sample1
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array(Minimum 2):");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        s.close();
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Largest: "+a[n-1]);
        for(int i = n-1;i!=-1;i--){
            if(a[i]!=a[i-1]){
                System.out.println("Second Largest: "+ a[i-1]);
                break;
            } 
        }
        System.out.println("Smallest: "+a[0]);
    }
}