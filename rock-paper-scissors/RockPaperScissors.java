import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String playerChoice = scanner.next().toLowerCase(); // Read player's choice

        // Generate a random choice for the computer
        String[] choices = { "rock", "paper", "scissors" };
        int computerChoiceIndex = random.nextInt(choices.length);
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        String result = "";
        if (playerChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            result = "You win!";
        } else {
            result = "Computer wins!";
        }

        System.out.println(result);
        scanner.close();
    }
}
