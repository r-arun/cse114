
public class TwosComplement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		System.out.println(Integer.toBinaryString(n));
		n = ~n;
		System.out.println(Integer.toBinaryString(n));
		n = n + 1;
		System.out.println(n);
		System.out.println(Integer.toBinaryString(n));
		
	}

}
