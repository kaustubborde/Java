
package Assignment1;

import java.util.Scanner;

public class AgeIncome {
	Scanner sc = new Scanner(System.in);

	private int age;
	private double income;

	public void accept() {
		System.out.println("Enter Your Age :");
		age = sc.nextInt();

		System.out.println("Enter your incode :");
		income = sc.nextDouble();

	}

	public void CheckAge() {
		if (age > 18 && age < 60)
			System.out.println("Person is Eligible for a loan.");
		else
			System.out.println("Person is not eligible for a loan!!");

	}

	public void CheckIncome() {
		if (income > 25000 && income < 100000)
			System.out.println("Your income is $25,000 You are Eligible for a loan.");
		else
			System.out.println("Your income is below to $25,000,Sorry You are not eligible for a loan!!!");
	}

	public void display() {

		System.out.println("Your Age is  :" + age);
		System.out.println("Your Income is:" + income);
	}
}
