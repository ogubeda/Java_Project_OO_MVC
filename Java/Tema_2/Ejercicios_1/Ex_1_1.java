import javax.swing.JOptionPane;

public class Exer_1_1 {
    public static int ver_int (String num, int n1, boolean stop) {
        do {
            try {
                num = JOptionPane.showInputDialog(null, "Introduce un numero", "Media", JOptionPane.QUESTION_MESSAGE);
                if (num == null) {
                    JOptionPane.showMessageDialog(null, "Has seleccionado salir", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }else {
                    n1 = Integer.parseInt(num);
                    stop = true;
                }//end_else
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, vuelve a introducir un numero", "Error", JOptionPane.ERROR_MESSAGE);
                stop = false;
            }//end_catch
        }while (stop == false);
        return n1;
        //////
        //////
    }//end_ver_int
    public static void main (String[] args) {
        int sum = 0;
        int num_int = 0;

        //////
        //////
		for (int i = 0; i < 3; i++) {
            num_int = ver_int("", 0, false);
            sum = sum + num_int;
        }//end_for
        JOptionPane.showMessageDialog(null, "El resultado ha sido "+(sum/3)+" .", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }//end_main
}//end_Exer_1_1
