package in.obaid.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrays63 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> persons = new ArrayList<String>();
		persons.add("obaid");
		persons.add("sayyad");
		persons.add("sai");
		persons.add("umair");
		persons.add("ibrahim");

		for (int i = 0; i < persons.size(); i++) {
			// for()
			System.out.println(persons.get(i));
			if (persons.get(i).length() > 5) {
				System.out.println(persons.get(i).length());
				System.out.println("Print 1 "+persons.get(2));
			}
		}
	}
}
