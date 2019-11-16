package Framework;

import javax.swing.JOptionPane;

public class valida_combo {
	public static void main(String[] args) {
		int exit = 0;
		boolean stop = false;
		Object select;
		
		do {
			select = JOptionPane.showInputDialog(null, "Selecciona una opcion.", "Verifica Combo", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Soltero", "Casado", "Separado", "Divociado", "Viudo" }, "Soltero");
		 	if (select == null) {
		 		exit = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres salir?", "Salir", JOptionPane.WARNING_MESSAGE);
		 		if (exit == JOptionPane.OK_OPTION)
		 			System.exit(0);
		 		else
					stop = false;
			}else
				stop = true;
		}while (stop == false);
		JOptionPane.showMessageDialog(null, "Has seleccionado " + select , "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
