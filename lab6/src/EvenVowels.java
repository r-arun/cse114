import java.util.Scanner;
/**
 * 
 */

/**
 * @author arun
 *
 */
public class EvenVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.next();
		boolean vowel = true;
		for(int i = 0; i < s.length(); i+=2){
			switch(s.charAt(i)){
			case 'a': case 'e': case 'i': case 'o': case 'u':
				continue;
			default:
				vowel = false;
				break;
			}
			if(!vowel)
				break;
		}
		if(vowel)
			System.out.println(s+" has all Even vowels");
		else
			System.out.println(s+" has does not  have all even vowels");
	}

}
