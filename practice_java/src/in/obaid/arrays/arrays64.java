package in.obaid.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrays64 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> persons = new ArrayList<String>();
		persons.add("obaid");
		persons.add("sayyad");
		persons.add("sai");
		persons.add("umair");
		persons.add("ibrahim");

		System.out.println(persons.get(2));
		String name = persons.get(2);
		System.out.println(name.substring(0,2));

	}
}

