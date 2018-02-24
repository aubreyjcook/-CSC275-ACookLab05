import java.util.*;

public class Lab05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.println("Enter a number 1-26: ");
				int userInput = input.nextInt();
			}
			catch(InputMismatchException ex) {
				System.out.println("Please input a number.");
				input.nextLine();
			}
		} while(continueInput);
	}
}
