package in.obaid.flowcontrol;

import java.util.Scanner;

public class Flowcontrol32 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input side1: ");
		int s1 = in.nextInt();
		System.out.print("Input side2: ");
		int s2 = in.nextInt();
		System.out.print("Input side3: ");
		int s3 = in.nextInt();
		int sum = s1 + s2 + s3;
		if (sum == 180) {
			System.out.print("we can make triangle: " + sum);
		} else
			System.out.print("he said said fuck uuuuuuuu: " + sum);
	}
}
