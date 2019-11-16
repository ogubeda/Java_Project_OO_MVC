import java.awt.Frame;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main (String[] args) {
        float num1 = 0;
        float num2 = 0;
        float res = 0;
        int option = 0;
        String option2 = " ";
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null,"Las opciones son: \n 1.- Sumar \n 2.- Restar \n 3.- Dividir \n 4.- Multiplicar \n 0.- Salir"));
            if (option <= 4) {
                num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo numero"));
            }
            switch (option) {
                case 1:
                    res = num1+num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es:\n"+res);
                    break;
                case 2:
                    res = num1-num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la resta es:\n"+res);
                    break;
                case 3:
                    res = num1/num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la division es:\n"+res);
                    break;
                case 4:
                    res = num1*num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion:\n"+res);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Has salido de la calculadora.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Introduce un caracter valido.");
                    break;
                }
        } while (option != 0);
    }
}