package JAVABOGNE;

import java.util.Scanner;

public class Java2333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Goddag og velkommen til Postnord. Hvad er vægten  på brevet?");
        int brev = scanner.nextInt();

        System.out.println("vægten på brevet er " + brev + " gram");

        if (brev>=500){
            System.out.println("Prisen for at sende dette brev er 39kr");
        }
        if (brev<=100){
            System.out.println("Prisen for at sende dette brev er 19kr");
        }
        if (brev>100 && brev<500){
            System.out.println("Prisen for at sende dette brev er 29kr");
        }



    }
}
