import java.util.Scanner;
public class WeatherMapElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature");
		int temp = input.nextInt();
		if(temp >= 40)
			System.out.println("Red");
		else if(30 <= temp)
			System.out.println("Yellow");
		else if(20 <= temp)
			System.out.println("Green");
		else if(10 <= temp)
			System.out.println("Blue");
		else
			System.out.println("White");
	}

}
