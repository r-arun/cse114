import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FileReading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = null;
		try {
			input = new Scanner(new File("test.txt"));
			int wordCount = 0;
			int charCount = 0;
			while(input.hasNext()){
				String s = input.next();
				charCount += s.length();
				++wordCount;
			}
			System.out.println(wordCount);
			System.out.println(charCount);
		} catch (IOException e) {
			e.printStackTrace();
		}
		input.close();
		//Always close Scanner when reading from file
	}

}
