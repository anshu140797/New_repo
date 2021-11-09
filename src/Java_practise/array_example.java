package Java_practise;

public class array_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] foods= {"pizza","maggi","burger"};
		//System.out.println(foods[1]);
		
		String[] cars = new String[3];
		cars[0]="alto";
		cars[1]="santro";
		cars[2]= "yoyo";
		//System.out.println(cars[1]);
		
		for(int i =0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		

}
}