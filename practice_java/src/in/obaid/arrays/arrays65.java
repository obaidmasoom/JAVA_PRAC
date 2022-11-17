package in.obaid.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrays65 {
	// 5. Write a program to add first list into the second list
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> persons = new ArrayList<String>();
		persons.add("obaid");
		persons.add("sayyad");

		ArrayList<String> personlist2 = new ArrayList<String>();
		personlist2.add("sai");
		personlist2.add("umair");
		personlist2.add("ibrahim");

		ArrayList<String> array3 = new ArrayList<String>();
		for (int i = 0; i < persons.size(); i++) {
			array3.add(persons.get(i) + " " + personlist2.get(i));

			System.out.println(array3.get(i));

			System.out.println(persons.get(i));
		}
	}
}
