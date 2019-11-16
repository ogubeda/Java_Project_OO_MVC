package Framework;

import javax.swing.JOptionPane;

public class verifica_botons {

	public static void main(String[] args) {
		int select = 0;
		int exit = 0;
		boolean stop = false;
		Object[] options = { "Sumar", "Restar", "Multiplicar", "Dividir" }; //Array con las opciones de los botones
		do {
			select = JOptionPane.showOptionDialog(null, "Select one option", "Verifica Botoens", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if (select == -1) {
				exit = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.WARNING_MESSAGE);
				//Confirmacion para salir
				if (exit == JOptionPane.OK_OPTION)
					System.exit(0);
				else
					stop = false;
			}else
				stop = true;
		}while (stop == false);
		JOptionPane.showMessageDialog(null, "You have choosen " + options[select], "Result", JOptionPane.INFORMATION_MESSAGE);
	}
}
