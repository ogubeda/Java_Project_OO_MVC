package Framework;

import javax.swing.JOptionPane;

public class verificar_s_n {
	public static void main (String[] args) {
		boolean stop = false;
		String option = "";
		char opt_conv = 0;
		int exit = 0;
		
		do {
			try {
				option = JOptionPane.showInputDialog(null, "Introduce 'S' or 'N'", "Validar S/N", JOptionPane.INFORMATION_MESSAGE);
				if (option == null) {
					exit = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.WARNING_MESSAGE);
					if (exit == JOptionPane.OK_OPTION)
						System.exit(0);
					else
						stop = false;
				}else {
					if (option.length() == 1) {
						opt_conv = option.charAt(0);
						opt_conv = Character.toUpperCase(opt_conv);
					}else
						throw new IllegalAccessException("You have introduced to much chars.");
					if ((opt_conv == 'S') || (opt_conv == 'N'))
						stop = true;
					else
						throw new IllegalAccessException("Value isn't 'S' or 'N'.");
				}//end_else
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't introduced a valid value.", "Error", JOptionPane.WARNING_MESSAGE);
				System.out.println(e);
				stop = false;
			}//end_catch
		}while (stop == false);
		JOptionPane.showMessageDialog(null, "Has introducido " + opt_conv, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}