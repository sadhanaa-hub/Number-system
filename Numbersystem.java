package files;
import java.util.*;
public class Numbersystem {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of terms: ");
		        int n = sc.nextInt();

		        // Natural Numbers
		        System.out.println("\nNatural Numbers:");
		        for(int i=1;i<=n;i++){
		            System.out.print(i+" ");
		        }

		        // Fibonacci
		        int a=0,b=1;
		        System.out.println("\n\nFibonacci Series:");
		        for(int i=1;i<=n;i++){
		            System.out.print(a+" ");
		            int c=a+b;
		            a=b;
		            b=c;
		        }

		        // Squares
		        System.out.println("\n\nSquare Series:");
		        for(int i=1;i<=n;i++){
		            System.out.print(i*i+" ");
		        }

		        sc.close();
		    }
	}

