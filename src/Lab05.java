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
		
		String newPhrase = shiftPhrase(userInputPhrase, userInputNumber);
		System.out.println(newPhrase);
	}
	
	private static String shiftPhrase(String userInputPhrase, int userInputNumber) {
		char[] newPhrase = userInputPhrase.toCharArray();
		
		return newPhrase;
	}
}
