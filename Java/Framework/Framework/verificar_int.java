package Framework;
import javax.swing.JOptionPane;

public class verificar_int {
    public static void main (String[] args) {
        String num = "";
        int num_int = 0;
        int exit = 0;
        boolean stop = false;
        do {
            try {
                num = JOptionPane.showInputDialog(null, "Introduce a number.", "Verifica Int", JOptionPane.QUESTION_MESSAGE);
                if (num != null){
                    num_int = Integer.parseInt(num);
                    stop = true;
                }else {
                    exit = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.WARNING_MESSAGE);
                    if (exit == JOptionPane.OK_OPTION)
                        System.exit(0);
                    else
                        stop = false;
                }//end_else
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "You haven't introduced a valid value.", "Error", JOptionPane.ERROR_MESSAGE);
                stop = false;
            }//end_catch
        }while (stop == false);
        JOptionPane.showMessageDialog(null, "You have introduced a valid value.", "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}