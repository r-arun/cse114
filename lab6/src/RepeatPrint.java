import java.util.Scanner;
/**
 * 
 */


public class RepeatPrint {
	static void repeater(String s, int n, boolean b){
		for(int i = 0; i < n ; ++i){
			if(b)
				System.out.print((i+1)+": ");
			else
				System.out.print(i+": ");
			System.out.println(s);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int n = input.nextInt();
		boolean c =  input.nextBoolean();
		repeater(s, n, c);
	}

}
