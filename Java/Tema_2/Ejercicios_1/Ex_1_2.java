import javax.swing.JOptionPane;

public class Ex_1_2 {
    public static void main (String[] args) {
        String num1 = "";
        String num2 = "";
        int num1_tr = 0;
        int num2_tr = 0;
        boolean stop = false;
        String cad = "";
        do {
            try {
                num1 = JOptionPane.showInputDialog(null, "Introduce el primer numero", "Mayor y Menor", JOptionPane.QUESTION_MESSAGE);
                if (num1 != null)
                    num1_tr = Integer.parseInt(num1);
                else{
                    JOptionPane.showMessageDialog(null, "Has seleccionado salir", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }//end_else
                num2 = JOptionPane.showInputDialog(null, "Introduce el segundo numero", "Mayor y Menor", JOptionPane.QUESTION_MESSAGE);
                if (num2 != null)
                    num2_tr = Integer.parseInt(num2);
                else {
                    JOptionPane.showMessageDialog(null, "Has seleccionado salir", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                stop = true;
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has introducido un numero", "Mayor y menor", JOptionPane.WARNING_MESSAGE);
                stop = false;
            }//end_catch
        }while (stop == false);
        if (num1_tr > num2_tr)
            cad = cad + (num1_tr + " es mayor que " + num2_tr);
        else if (num2_tr > num1_tr)
            cad = cad + (num2_tr + " es mayor que " + num1_tr);
        else
            cad = cad + (num1_tr + " y " + num2_tr + " son iguales.");
        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }//end_static
}//end_classEx_1_2