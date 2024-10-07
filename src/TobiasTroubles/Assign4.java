package TobiasTroubles;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assign4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello i am a program that will tell you the distance you have traveled" +
                " based on you speed and time.");
        System.out.println("Please enter the speed you were driving at");
        int mySpeed = scanner.nextInt();
        System.out.println("Thank you, you were driving " + mySpeed + "km/h");
        System.out.println("Now enter you time");
        int myTime = scanner.nextInt();
        System.out.println("Thank you, you were driving for " + myTime + " minutes");
        System.out.println("now that i have your speed and time, i will tell you the distance you have traveled");
        System.out.println("Your distance traveled is: " + myTime * mySpeed + " Meters");
    }
}
