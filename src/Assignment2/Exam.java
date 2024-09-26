
/*Assignment 2: Exam Grading System
Write a program that determines whether a student passes an exam based on three subjects.
 A student passes if the average score is at least 60, and none of the
  individual scores is below 40.
Requirements:
•    Use logical operators && and || to combine conditions.
*/

package Assignment2;
import java.util.Scanner;
public class Exam {
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private int sub1,sub2,sub3;
	private int marks;
	private double avg;
	
	public void accept()
	{
		System.out.println("Enter Name :");
		name =sc.next();
		System.out.println("Enter Marks for Subject 1 :");
		sub1 = sc.nextInt();
		System.out.println("Enter Marks for Subject 2 :");
		sub2 = sc.nextInt();
		System.out.println("Enter Marks for Subject 3 :");
		sub3 = sc.nextInt();
		
	}
	
	public void Checkmarks()
	{
		
		
		if(marks>40 && marks<100)
		System.out.println("Your marks is good..");
		else
			System.out.print("you are not Qualify!!");
			
	}
	
	public void display()
	{
		System.out.println("Your Name is : "+name);
		System.out.println("Marks of subject 1 :"+sub1);
		System.out.println("Marks of subject 2 :"+sub2);
		System.out.println("Marks of subject 3 :"+sub3);
		System.out.println("Your Average is  :"+avg);
	}
	

}
