package Framework;
import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

public class verificar_char {
    public static void main (String[] args) {
        String charc = "";
        char option = 0;
        int exit = 0;
        boolean stop = false;
        do {
            try {
                charc = JOptionPane.showInputDialog(null, "Introduce a character", "Valida Caracter", JOptionPane.QUESTION_MESSAGE);
                if (charc != null) {
                    if (charc.matches("^[a-zA-Z]+$")) {
                        if (charc.length() == 1) {
                            option = charc.charAt(0);
                            stop = true;
                        }else
                            throw new IllegalAccessException("The value is higher than one.");
                    }else {
                        throw new IllegalAccessException("The value isn't a char.");
                    }
                }else {
                    exit = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.WARNING_MESSAGE);
                    if (exit == JOptionPane.OK_OPTION)
                        System.exit(0);
                    else
                        stop = false;
                }//end_else
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "You haven't introduce a valid value.", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
                stop = false;
            }//end_catch
        }while (stop == false);
        JOptionPane.showMessageDialog(null, "You have introduced this character: " + option, "Valida Caracter", JOptionPane.INFORMATION_MESSAGE);
    }
}