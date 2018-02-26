import java.util.*;

public class Lab05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInputNumber = 0;
		boolean numberRetrieved = false;
		
		do {
			try {
				System.out.println("Enter a number 1-26: ");
				userInputNumber = input.nextInt();
				
				if(!(userInputNumber < 1 || userInputNumber > 26)) {numberRetrieved = true;} else {System.out.println("Bad input.");}
				
			}
			catch(InputMismatchException ex) {
				System.out.println("Bad input.");
				input.nextLine();
			}
		} while(!numberRetrieved);
		
		System.out.println("Enter a phrase: ");
		String userInputPhrase = input.next();
		
		userInputPhrase = shiftPhrase(userInputPhrase, userInputNumber);
		System.out.println(userInputPhrase);
		
		System.exit(0);
	}
	
	private static String shiftPhrase(String userInputPhrase, int userInputNumber) {
		char[] newPhrase = userInputPhrase.toCharArray();
		for(int i = 0; i < userInputPhrase.length(); i++) {
			char rot = newPhrase[i];
			
			//fix this with rot-n
			if       (rot >= 'a' && rot <= 'm') rot += 13;
            else if  (rot >= 'A' && rot <= 'M') rot += 13;
            else if  (rot >= 'n' && rot <= 'z') rot -= 13;
            else if  (rot >= 'N' && rot <= 'Z') rot -= 13;
            
			newPhrase[i] = rot;
		}
		return String.valueOf(newPhrase);
	}
}
