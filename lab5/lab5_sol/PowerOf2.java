import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = 0;
		while(num > 0){
			if(num % 2 == 0){
				num/=2;
				++count;
			}
			else{
				break;
			}
		}
		System.out.println("The number is divisible by 2 "+count+" times");
	}

}
