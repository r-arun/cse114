import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fileName = input.next();
		int n = input.nextInt();
		PrintWriter output = null;
		try{
			File file = new File(fileName);
			output = new PrintWriter(file);
			for(int i = 1; i <= n; ++i)
				output.print(i+" ");
			output.println();
			output.close();
		}
		catch(IOException e){
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		input.close();
	}

}
