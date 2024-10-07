package JAVABOGNE;

import javax.swing.JOptionPane;

public class java2332 {
    public static void main(String[] args) {



        JOptionPane.showMessageDialog(null, "Hej, velkommen til Nordeas hæveautomat");
        String EUROString = JOptionPane.showInputDialog("Indtast venligst hvor mange euro du vil veksle");


        double euro = Double.parseDouble(EUROString);
        System.out.println(EUROString);

        JOptionPane.showMessageDialog(null, "Du vil gerne veksle " + euro + " EUR");


        double kurs = 1.11;
        double total;
        total = (euro * kurs);
        double comission = euro * 0.02;

        if (comission<0.5){
            comission=0.5;
        }

        JOptionPane.showMessageDialog(null,
                "Du veksler " + euro + " EUR Til USD. Vi gør opmærksom på en kommission på 2% (minimum 0.5 EUR)");

        JOptionPane.showMessageDialog(null,
                "Du betaler " + (comission + euro) +  " EUR, og de bliver vekslet til " + total + " USD");

        JOptionPane.showMessageDialog(null,
                "Tak fordi du handlede hos Nordea");










    }
}
