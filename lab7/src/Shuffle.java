import java.util.Scanner;

public class Shuffle {

	public static void _func_b(int arr [], int a, int b){
		if(!(0 <= a && a < arr.length)) return;
		if(!(0 <= b && b < arr.length)) return;
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static int [] _func_a(int a, int b){
		int size = b - a + 1;
		int arr[] = new int[size];
		for(int i = 0; i < size; ++i)
			arr[i] = a+i;
		return arr;
	}

	public static void _c_func_(int [] arr){
		int a = (int)(Math.random() * arr.length);
		int b = (int)(Math.random() * arr.length);
		_func_b(arr, a, b);
	}
	public static void printArray(int arr[]){
		for(int i = 0; i < arr.length; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}	
	
	public static int[] generateTest(int n){
		int [] _a = _func_a(0,n-1);
		int limit =(int)(Math.random() * 12);
		for(int i = 0; i < limit; ++i)
			_c_func_(_a);
		int pos = (int) (Math.random() * n);
		_a[pos] = n;
		return _a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] arr = generateTest(n);
		printArray(arr);
	}

}
