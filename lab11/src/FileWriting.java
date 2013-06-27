import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;


public class FileWriting {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("scores.txt");
		if (file.exists()) {
		System.out.println("File already exists");
		System.exit(0);
		}
		// Create the file
		PrintWriter output = null;
		try {
			output = new PrintWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Write output to the file
		output.print("John T Smith ");
		// Close the file
		output.close();

	}

}
