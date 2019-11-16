package Framework;
import javax.swing.JOptionPane;

public class verificar_string {
    public static void main (String[] args) {
        String cad = "";
        boolean stop = false;
        int exit = 0;
        do {
            try {
                cad = JOptionPane.showInputDialog(null, "Introduce una cadena", "Verificar cadena", JOptionPane.QUESTION_MESSAGE);
                if (cad != null) {
                    stop = true;
                    if (cad.equals(""))
                        throw new IllegalAccessException();
                }else {
                    exit = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres salir?", "Salir", JOptionPane.WARNING_MESSAGE);
                    if (exit == JOptionPane.OK_OPTION)
                        System.exit(0);
                    else
                        stop = false;
                }//end_else
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has introducido una cadena valida.", "Error", JOptionPane.ERROR_MESSAGE);
                stop = false;
            }//end_catch
        }while (stop == false);
        JOptionPane.showMessageDialog(null, "Has introducido la cadena " + cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}