import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class PowerOfPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int orig = num;
		for(int i = 2; i <= orig && num > 0; ++i){
			int cnt = 0;
			boolean flag = true;
			while(num > 0){
				if(num % i > 0){
					flag = false;
					if(cnt >0)
						System.out.println(i+"->"+ cnt);
					break;
				}
				else{
					num/=i;
					++cnt;
				}
			}
			if(flag==true)
					System.out.println(i+"->"+ cnt);
		}
	}

}
