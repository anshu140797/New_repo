package Java_practise;

import java.util.Scanner;

public class nested_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int rows;
		int cols;
		String symbol = "";
		
		System.out.println("Enter rows");
		rows=s.nextInt();
		System.out.println("Enter columns");
		cols=s.nextInt();
		System.out.println("Enter the symbol");
		symbol = s.next();
		
		for(int i=1;i<=rows;i++) {
			System.out.println();
			for(int j=1;j<=cols;j++) {
				System.out.print(symbol);
			}
		}
		
		

	}

}
