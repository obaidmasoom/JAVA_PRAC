package in.obaid.arrays;

import java.util.*;
import java.util.Scanner;

public class arrays61 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> persons = new ArrayList<String>();
		persons.add("oabid");
		persons.add("sayyad");
		persons.add("sai");
		persons.add("umair");
		persons.add("ibrahim");
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
	}
}