package Java_practise;
import java.util.Scanner;

public class Scanner_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = s.nextLine();
		System.out.println("Hi "+name);
		System.out.println("you age?");
		int age = s.nextInt();
		System.out.println("age" + age);
		s.nextLine();       //to clear the /n from the scanner
		System.out.println("what food");
		String food=s.nextLine();
		System.out.println("i like "+ food);
	}

}
