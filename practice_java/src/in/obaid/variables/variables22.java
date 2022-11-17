package in.obaid.variables;

import java.util.Scanner;

public class variables22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = scan.nextDouble();
		System.out.print("Enter the th1ird number: ");
		double num3 = scan.nextDouble();
		scan.close();
		System.out.print("The average of entered numbers is:" + avr(num1, num2, num3));
	}

	public static double avr(double a, double b, double c) {
		return (a + b + c) / 3;
	}
}
