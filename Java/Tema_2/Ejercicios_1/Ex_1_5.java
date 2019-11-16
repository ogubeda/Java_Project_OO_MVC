import javax.swing.JOptionPane;

public class Ex_1_5 {
    public static void main (String[] args) {
        int num_tr = 0;
        int sum = 0;

        //////
        /////
        for (int i = 0; i < 5; i++) {
            num_tr = ver_int("", 0, false);
            sum = sum + num_tr;
        }//end_for
        JOptionPane.showMessageDialog(null, "El resultado es " + sum, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }//end_main
    //////
    /////
    public static int ver_int(String num, int n1, boolean stop) {
        do {
            num = JOptionPane.showInputDialog(null, "Introduce un numero", "Suma", JOptionPane.QUESTION_MESSAGE);
            if (num == null) {
                JOptionPane.showMessageDialog(null, "Has seleccionado salir.", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }else{
                try {
                    n1 = Integer.parseInt(num);
                    stop = true;
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No has introducido un valor valido.", "Error", JOptionPane.CLOSED_OPTION);
                    stop = false;
                }
            }//end_else
        }while (stop == false);
        return n1;
    }//end_ver_int
}