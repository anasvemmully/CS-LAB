import java.util.Scanner;

class fib{
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the limit: ");
		
		int n = scan.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.println("The Fibonacci Series are : ");
 
		while(c<=n)
                {
			System.out.println(c);
		
			a = b;
			b = c;
			c = a + b;
			
    	}
 	}
}
