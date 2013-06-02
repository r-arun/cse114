import java.util.Scanner;
public class WeatherMap {

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
		if(30 <= temp && temp < 40)
			System.out.println("Yellow");
		if(20 <= temp && temp < 30)
			System.out.println("Green");
		if(10 <= temp && temp < 20)
			System.out.println("Blue");
		if(temp < 10)
			System.out.println("White");
	}

}
