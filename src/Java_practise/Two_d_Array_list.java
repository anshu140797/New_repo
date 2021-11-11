package Java_practise;

import java.util.ArrayList;

public class Two_d_Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<String>> lists = new ArrayList();
		
		ArrayList<String> food = new ArrayList();
		food.add("maggi");
		food.add("burger");
		food.add("noodles");
		
		ArrayList<String> drinks = new ArrayList();
		drinks.add("pepsi");
		drinks.add("coffee");
		drinks.add("tea");
		
		lists.add(drinks);
		lists.add(food);
		
		System.out.println(lists);
		

	}

}
