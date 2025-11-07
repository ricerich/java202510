package ch03_ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] numbers = {"one", "two", "three"};
		for(String number: numbers) {
			System.out.println("1: "+number);
		}

		ArrayList<String> numbers2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
		for (String number : numbers2) {
			System.out.println("2: "+number);
		}
		

	}

}
