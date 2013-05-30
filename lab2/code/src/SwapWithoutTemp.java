
public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a = 15;
		int b = 18;
		System.out.println("Before Swapping");
		System.out.print("a = "+a);
		System.out.println(" b = "+b);
		
		a = a + b; //Now a has a + b
		b = a - 2 * b;//b has a - b
		a = a - b; //This is a + b - (a - b) = 2 b
		b = 2 * b + a; // this is 2 * (a - b) + 2b
		
		System.out.println("After Swapping");
		System.out.print("a = "+a/2);
		System.out.println(" b = "+b/2);
		
	}

}