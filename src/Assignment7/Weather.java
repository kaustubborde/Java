package Assignment7;

import java.util.Scanner;

public class Weather {

	Scanner sc = new Scanner(System.in);
	private int temp;
	private int flag = 0;

	public void get() {
		System.out.println("Enter the temperture = ");
		temp = sc.nextInt();
	}

	void check() {
		if ((temp >= 20) && (temp <= 30)) {
			System.out.println("weather is safe");
			flag = 1;
		} else if (flag == 1) {
			System.out.println("It should not be raining.");

		} else {
			System.out.println("Wether is not good");
		}

	}
}
