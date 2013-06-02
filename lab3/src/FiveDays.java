import java.util.Scanner;
public class FiveDays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		switch(day){
		case 5:
			System.out.println("5 iPhones");
		case 4:
			System.out.println("4 Java Books");
		case 3:
			System.out.println("3 Keyboards");
		case 2:
			System.out.println("2 Loudspeakers");
		case 1:
			System.out.println("1 Microphone");
		}
	}

}
