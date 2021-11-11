package Java_practise;

import java.util.ArrayList;

public class for_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String [] food = {"a","n","f","p"};
		ArrayList<String> food = new ArrayList<String>();
		food.add("a");
		food.add("hhhh");
		food.add("uuuu");
		
		for(String i  : food) {
			System.out.println(i);
			
		}

	}

}
