package Assignment8;
import java.util.Scanner;
public class Ternery {

	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
		 int n1;
		 int n2 ;
		 int max;
		 
System.out.println("Enter N1: ");
n1 = sc.nextInt();


System.out.println("Enter N2: ");
n2 = sc.nextInt();




		max =(n1 > n2) ? n1 : n2;

		System.out.println("Largest number is: "  + max );
	}
}
