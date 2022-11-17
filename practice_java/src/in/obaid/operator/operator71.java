package in.obaid.operator;

import java.util.Scanner;

public class operator71 {
	public static void main(String[] args) {
		int a, b, max;
		System.out.println("Enter two numbers: ");
		Scanner z = new Scanner(System.in);
		a = z.nextInt();
		b = z.nextInt();
		if (a == b) {
			System.out.println("Equal");
		}
		max = (a > b) ? a : b;
		System.out.println("Maximum number is " + max);
	}
}
