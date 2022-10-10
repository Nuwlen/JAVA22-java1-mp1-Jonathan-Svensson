import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		do {
			game();
		} while (checkNewGame());
	}
	
	static boolean checkNewGame() {
		Scanner myScanner = new Scanner(System.in);
		int playAgain;
		
		do {
			System.out.println("New game? (1/0)");
			playAgain = myScanner.nextInt();
		} while (!(playAgain == 0 || playAgain == 1));
		
		if (playAgain == 1) {
			return true;
		}
		return false;
	}
	
	static boolean isCorrectGuess(int rand, int userGuess) {
		if (userGuess < rand) {
			System.out.println("Guess higher");
			return false;
		}
		if (userGuess > rand) {
			System.out.println("Guess lower");
			return false;
		}
		return true;
	}
	
	static void game(){
		Scanner myScanner = new Scanner(System.in);
		int rand = (int) Math.round(Math.random()*100);
		int attempts = 0;
		int userGuess;
		boolean correctGuess;
		
		//System.out.println("The magic number: " + rand);
		System.out.println("Guess a number between: 0-100");
		
		do {
			userGuess = myScanner.nextInt();
			correctGuess = isCorrectGuess(rand, userGuess);
			attempts++;
		} while (!correctGuess);
		
		System.out.println("You guessed correctly! after " + attempts + " attempts");
	}	
}
