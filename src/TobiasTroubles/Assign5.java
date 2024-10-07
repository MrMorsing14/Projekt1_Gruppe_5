package TobiasTroubles;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
//import java.util.Scanner;


public class Assign5 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int dinDag = scanner.nextInt();
        int year = 2000;
        int month = 11;
        int date = 30;
        int hour = 19;
        int minute = 37;
        int second = 15;

        Date.UTC(year, month, date, hour, minute, second);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);





    }
}
