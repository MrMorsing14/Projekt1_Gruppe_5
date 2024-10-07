import javax.swing.*;

public class sysud {
    public static void main(String[] args) {
        String take = JOptionPane.showInputDialog("Hvad er dit take på Systemudvikling");
        if (take!="wack"){
            JOptionPane.showMessageDialog(null, "ikk lyv");
        }else {
            JOptionPane.showMessageDialog(null, "er vi enige");
        }
    }
}
