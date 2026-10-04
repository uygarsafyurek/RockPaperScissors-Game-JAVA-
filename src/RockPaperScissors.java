
import java.util.Scanner;
import java.util.Locale;
public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		
		//declare variables
		int playerScore = 0;
		int computerScore = 0;
		String playersMove;
		
		System.out.print("Points to win: ");
		int points = input.nextInt();
		input.nextLine();
		
		//first loop for the game
		while (playerScore != points && computerScore != points) {
			
			// do-while loop for invalid inputs
			do {
			System.out.print("Rock, paper, or scissors? ");
			playersMove = input.nextLine().trim();
			}
			
			while(!playersMove.equalsIgnoreCase("rock") && !playersMove.equalsIgnoreCase("paper") && !playersMove.equalsIgnoreCase("scissors"));
			
			//pulling computer's move from ComputerOpponent.java file
			String computerMove = ComputerOpponent.getMove();
				
				//if-else if-else statements
				if (playersMove.equalsIgnoreCase("rock")) {
					if (computerMove.equals("rock")) {
						System.out.printf(", so it's a tie." + " (" + playerScore + "-" + computerScore + ")\n");
					}
					else if (computerMove.equals("paper")) {
						computerScore++;
						System.out.print(", so you lose." + " (" + playerScore + "-" + computerScore + ")\n");
					}
					else if (computerMove.equals("scissors")) {
						playerScore++;
						System.out.print(", so you win!" + " (" + playerScore + "-" + computerScore + ")\n");
					}
				}
				else if (playersMove.equalsIgnoreCase("paper")) {
					if (computerMove.equals("rock")) {
						playerScore++;
						System.out.print(", so you win!" + " (" + playerScore + "-" + computerScore + ")\n");
					}
					else if (computerMove.equals("paper")) {
						System.out.print(", so it's a tie." + " (" + playerScore + "-" + computerScore + ")\n");
					}
					else if (computerMove.equals("scissors")) {
						computerScore++;
						System.out.print(", so you lose." + " (" + playerScore + "-" + computerScore + ")\n");
					}	
				}
				else if (playersMove.equalsIgnoreCase("scissors")) {
					if (computerMove.equals("rock")) {
						computerScore++;
						System.out.print(", so you lose." + " (" + playerScore + "-" + computerScore + ")\n");
					}
					else if (computerMove.equals("paper")) {
						playerScore++;
						System.out.print(", so you win!" + " (" + playerScore + "-" + computerScore + ")\n");
					}
					else if (computerMove.equalsIgnoreCase("scissors")) {
						System.out.print(", so it's a tie." + " (" + playerScore + "-" + computerScore + ")\n");
					}	
				}
			}
		
		if (playerScore == points) {
			System.out.println("Congratulations! You won!");
		}
		else if(computerScore == points) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

	}

}
