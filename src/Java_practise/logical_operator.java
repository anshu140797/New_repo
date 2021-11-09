package Java_practise;

import java.util.Scanner;

public class logical_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//&& AND
		//|| OR
		// ! NOT reverses boolean value of a condition
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input value q or Q");
		String response = s.next();
//		if(response.equals("q") || response.equals("Q")) {
//			System.out.println("want to quit");
//			
//		}
//		else {
//			System.out.println("want to play");
//		}
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("want to play");
			
			
		}
		else {
			System.out.println("want to quit");
		}

	}

}
