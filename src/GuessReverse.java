import java.util.Scanner;

public class GuessReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int guess = max/2;

        System.out.println("think of a number between " + min + " and " + max);
        System.out.println("Tænk på et nummer");
        int correct = scanner.nextInt();
        System.out.println(guess);

        int i = 0;
        while (guess != correct) {
            if (guess > correct) {
                max = guess;
            }  else {
                min = guess;
            }

            guess = min+(max-min)/2;
            System.out.println(guess);
            i++;
        }
        System.out.println("jeg er bedre end dig menneske. " + i + " forsøg");
    }
}

