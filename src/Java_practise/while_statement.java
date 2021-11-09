package Java_practise;

import java.util.Scanner;

public class while_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String name="";
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name=s.nextLine();
		}
		
		System.out.println("Hi "+name);

	}

}
