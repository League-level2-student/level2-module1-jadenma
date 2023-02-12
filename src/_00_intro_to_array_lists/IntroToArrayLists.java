package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> sports = new ArrayList<String>();
		//2. Add five Strings to your list
		sports.add("soccer");
		sports.add("basketball");
		sports.add("baseball");
		sports.add("football");
		sports.add("volleyball");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < sports.size(); i++){
			String s = sports.get(i);
			System.out.println("String at element " + i + " is " + s);
		}
		//4. Print all the Strings using a for-each loop
		for (String sport : sports) {
			System.out.println(sport);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i<sports.size(); i++) {
			if (i%2==0) {
				System.out.println(sports.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = sports.size()-1; i >=0; i--) {
			System.out.println(sports.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println();
		for (int i = 0; i < sports.size(); i++) {
			if (sports.get(i).contains("e")) {
				System.out.println(sports.get(i));
			}
		}
	}
}
