import java.util.*;

public class Lab05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean numberRetrieved = false;
		
		do {
			try {
				System.out.println("Enter a number 1-26: ");
				int userInputNumber = input.nextInt();
				
				numberRetrieved = true;
			}
			catch(InputMismatchException ex) {
				System.out.println("Bad input.");
				input.nextLine();
			}
		} while(!numberRetrieved);
		
		System.out.println("Enter a phrase: ");
		String userInputPhrase = input.next();
		
		String newPhrase = shiftPhrase(userInputPhrase);
		System.out.println(newPhrase);
	}
	
	private String shiftPhrase(String userInputPhrase) {
		String newPhrase;
		newPhrase = userInputPhrase;
		
		return newPhrase;
	}
}
