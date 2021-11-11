package Java_practise;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food = new ArrayList();
		food.add("maggi");
		food.add("burger");
		food.add("noodles");
		
		food.set(0, "sushi");
		food.remove(2);
		
		for(int i = 0; i<food.size();i++) {
			System.out.println(food.get(i));
		}

	}

}
