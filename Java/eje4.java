import javax.swing.JOptionPane;

public class Ejercicio4_v2 {
    public static void main (String[] args) {
        int num = 0;
        int prod = 1;
        int dig = 0;
        String cad = " ";
        String cad2 = " ";
        int num_ent = 0;
        int conf = 0;
        boolean stop = false;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
            prod = 1;
            cad2 = " ";
            cad = " ";
            while (num > 0) {
                dig = num % 10;
                num = num / 10;
                cad2= dig + cad2;
                if (((dig % 2) == 0) || ((dig % 3) == 0)) {
                    prod = prod * dig;
                }
            }//end_while
            cad = cad + ("El producto de los digitos de " + cad2 + " es: "+ prod)+"\n";
            conf = JOptionPane.showConfirmDialog(null, cad + "Desea continuar?");
            if (conf == 1)
                stop = false;
            else
                stop = true;
        }while (stop == true);
    }//end_static
}//end_class