import java.util.Scanner;
public class CollegeYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if(year > 0){
			switch(year){
			case 1:
				System.out.println("Freshman");
				break;
			case 2:
				System.out.println("Sophomore");
				break;
			case 3:
				System.out.println("Junior");
				break;
			case 4:
				System.out.println("Senior");
				break;
			default:
				System.out.println("Senior");
			}
		}
	}

}
