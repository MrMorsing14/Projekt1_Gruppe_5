import javax.swing.*;
import java.util.Random;

public class Dicemann {
    public static void main(String[] args) {
        Random gen = new Random();
        int tal = gen.nextInt(6) + 1;
        String activity ="";


        switch (tal) {
            case 1 -> activity = "Breakfast";
            case 2 -> activity = "Study";
            case 3 -> activity = "Swim";
            case 4 -> activity = "Go fishing";
            case 5 -> activity = "Call mom";
            case 6 -> activity = "Go back to bed";
        }

        JOptionPane.showMessageDialog(null, "activity : "+activity+" hej");
    }
}

