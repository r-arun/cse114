import java.util.Scanner;

public class funcWarmup {
	public static void repeater(int n){
		String str = "Hello World";
		for(int i = 0; i < n; ++i)
			System.out.println(str);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		repeater(n);
	}

}
