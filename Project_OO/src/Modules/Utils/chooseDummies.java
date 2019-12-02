package Modules.Utils;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import Modules.Cars.Dummies.generateDummies;
import Modules.Cars.Utils.functions;
import Modules.Users.Dummies.generateDummiesUsers;


public class chooseDummies {
    //////
    public static void quantity() {
        //////
        int quantityCars = 0, quantityUsers = 0, progress = 0;
        JProgressBar progresDummies = new JProgressBar(0);
        JFrame frame = new JFrame();
        //////
        /////

        quantityCars = functions.ver_int("How much Dummies Cars you want to generate?", "Generate Dummie Cars");
        quantityUsers = functions.ver_int("How much Dummies Users you want to generate?", "Generate Dummie Users");
        progresDummies.setMaximum(quantityCars + quantityUsers - 1);
        progresDummies.setStringPainted(true);
        frame.setSize(300, 100);
        frame.setResizable(false);
		frame.setLocationRelativeTo(null);
        frame.add(progresDummies);
        frame.setVisible(true);
        //////
        for (int i = 0; i < quantityCars; i++) {
            generateDummies.generate(-1);
            progresDummies.setValue(progress++);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }          
        }// end_for
        //////
        for (int i = 0; i < quantityUsers; i++) {
            generateDummiesUsers.generate(-1);
            progresDummies.setValue(progress++);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        frame.dispose();
        //////
    }// end_quantity

}// end_chooseDummies