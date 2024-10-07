import java.util.InputMismatchException;
import java.util.Scanner;

public class Regnemaskine {
    static Scanner Keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double res;
        char operator;
        boolean KeepGoing = true;

        while (true) {
            System.out.println("Velkommen til Regnemaskinen");
            System.out.println("  + for addition");
            System.out.println("  - for substraktion");
            System.out.println("  * for multiplikation");
            System.out.println("  / for division");
            System.out.println("  q for quit");

            System.out.println("Indtast operatør:");
            operator = Keyboard.next().charAt(0);
            if (operator == 'q') break;


            a = readdouble("Indtast a");
            b = readdouble("Indtast b");

            if (a== 'q') break;;
            if (b== 'q') break;;

            switch (operator) {
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    res = a / b;
                    if (a==0 && b==0)
                    break;
                default:
                    System.out.println("Ugyldig operator");
                    continue;
            }
            System.out.println("Resultat: " + a + operator + b + "=" + res);

        } // while løkker slutter
        System.out.println("Tak for i dag");
    }


    static double readdouble(String prompt) {
        double n=0;
        boolean ok = false;
        while (!ok) {
            try {
                System.out.println(prompt);
                n= Keyboard.nextDouble();
                ok = true;

            } catch (InputMismatchException e) {
                System.out.println("Ulovligt input, prøv igen");
                Keyboard.nextLine();
            }

        }
        return n;
    }
}