package in.obaid.stringmanipulation;

import java.util.Scanner;

public class stringmanipulation55 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String input1 = console.nextLine();
		console.close();

		String str1 = "Developer";

		boolean result = input1.contains(str1);
		if (result) {
			System.out.println(input1 + " is present in the string.");
		} else {
			System.out.println(str1 + " is not present in the string.");
		}
	}
}