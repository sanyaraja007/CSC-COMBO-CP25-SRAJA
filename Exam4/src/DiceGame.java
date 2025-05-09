import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		
		System.out.print("Enter the number of sides for the dice: ");
		int NumSides = scanner.nextInt();
		
		System.out.println("Enter the number of Players:");
				
		int numPlayers = scanner.nextInt();
		scanner.nextLine();
		

		Player[] players = new Player[numPlayers];
		for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            String name = scanner.nextLine();
            players[i] = new Player(name, new Dice(NumSides));
		}
		


		for (Player player : players) {
			player.rollDie();  
			String name = player.getName();
			int value = player.getDie().getValue();
			int numSides = player.getDie().getNumSides();

			System.out.println("Player " + name + " rolled a " + value + " on a " + numSides + "-sided die.");

		}
		int winnerIndex = decideWinner(players);
		String winnerName = players[winnerIndex].getName();

		System.out.println(winnerName + " won the game!");
	}

	public static int decideWinner(Player[] players) {
		int maxIndex = 0;
		int maxValue = players[0].getDie().getValue();

		for (int i = 1; i < players.length; i++) {
			int currentValue = players[i].getDie().getValue();
			if (currentValue > maxValue) {
				maxValue = currentValue;
				maxIndex = i;
			}
		}

		return maxIndex;
	}
}




















