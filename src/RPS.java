import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        String playerMove;

        while (true) {
            System.out.println("Please enter your move (r, p or s)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("s") || playerMove.equals("p")) {
                break;
            }
            System.out.println(playerMove + " That is not a valid move");
        }

        System.out.println("Computer played " + computerMove);
        if (playerMove.equals(computerMove)) { // tie
            System.out.println("The game was a tie");
        }

            if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("You lose");
            }
                if (computerMove.equals("s")) {
                    System.out.println("You win!");
                }

            }
             if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                System.out.println("You lose");
            }
            if (computerMove.equals("r")) {
                    System.out.println("You win!");
                }

            }
             if (playerMove.equals("s")) {
            if (computerMove.equals("r")) {
                System.out.println("You lose");
            }
             if (computerMove.equals("p")) {
                System.out.println("You win!");
            }


        }

            System.out.println("Play again? y/n");
            String playAgain =  scanner.nextLine();
            if (!playAgain.equals("y    ")){
                break;


            }
        }
    }
}
