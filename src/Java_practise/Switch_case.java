package Java_practise;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="Thrusday";
		switch(day) {
		case "Sunday": System.out.println("This is Sunday");
		break;
		case "Monday": System.out.println("This is monday");
		break;
		case "Tuesday": System.out.println("This is Tuesday");
		break;
		case "Wednesday": System.out.println("This is Wednesday");
		break;
		case "Thrusday": System.out.println("This is Thrusday");
		break; // if we remove break it will print thursday as well as friday.
		case "Friday": System.out.println("This is Friday");
		break;
		default:System.out.println("aisa kuch nhi hota hai");
		}

	}

}
