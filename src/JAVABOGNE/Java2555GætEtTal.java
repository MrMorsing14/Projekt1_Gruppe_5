package JAVABOGNE;

import java.util.Random;
import java.util.Scanner;

public class Java2555GætEtTal {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = random.nextInt(100)+1;
        System.out.println("Over eller under 1-100");
        int ans = scanner.nextInt();

        System.out.println(guess);

        while (ans!=guess){
            if(guess> ans) {
                System.out.println("Over");
                guess= scanner.nextInt();
            }
            else if (guess<ans) {
                System.out.println("Under");
                guess= scanner.nextInt();
            }


        }
        System.out.println("det er korrekt svaret er " + guess);
    }
}
