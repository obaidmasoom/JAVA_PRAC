package in.obaid.variables;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class variables25 {
	public static void main(String args[]) {
		System.out.print("Enter date of birth in YYYY-MM-DD format: ");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println("Enter Name: ");
		String inputname = scanner.nextLine();
		System.out.println("Enter age: ");
		int inputnage = scanner.nextInt();
		System.out.println("Enter current year:");
		int yr = scanner.nextInt();
		scanner.close();

		LocalDate dob = LocalDate.parse(input);

		System.out.println("You are " + calculateAge(dob) + " years old  " + inputname);
		System.out.println("abyyy " + inputnage + " " + "your birth of year is " + (yr - inputnage));
	}

	public static int calculateAge(LocalDate dob) {

		LocalDate curDate = LocalDate.now();
		// calculates the amount of time between two dates and returns the years
		if ((dob != null) && (curDate != null)) {
			return Period.between(dob, curDate).getYears();
		} else {
			return 0;
		}
	}

}
