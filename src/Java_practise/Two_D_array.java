package Java_practise;

public class Two_D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First way
//		String [][] food = new String[2][2];
//		
//		food[0][0]="maggi";
//		food[0][1]="pizza";
//		food[1][0]="burger";
//		food[1][1]="fries";
//		
		//Second way
		String [][] food = {{"maggi","pizza"},{"burger","fries"}};
		
		for(int i=0; i<food.length;i++) {
			System.out.println();
			for(int j=0;j<food[i].length;j++) {
				System.out.print(food[i][j]+" ");
			}
		}
	}

}
