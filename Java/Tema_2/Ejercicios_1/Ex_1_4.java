import javax.swing.JOptionPane;

public class Ex_1_4 {
    public static void main (String[] args){
        String num = "";
        String cad = "";
        int num_tr = 0;
        boolean stop = false;
        do{
            num = JOptionPane.showInputDialog(null, "Introduce un numero");
            if (num == null) {
                JOptionPane.showMessageDialog(null, "Has seleccionado salir.", "Saliendo", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }else {
                try {
                    num_tr = Integer.parseInt(num);
                    for (int i = 1; i <= 10; i++)
                        cad = cad + (num_tr + " * " + i + " = " + (num_tr*i) + "\n");
                        stop = true;
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "No has introducido un valor correcto.", "Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println(e);
                }
            }//end_else
        }while (stop == false); 
        JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}