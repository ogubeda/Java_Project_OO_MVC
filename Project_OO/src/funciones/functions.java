package funciones;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class functions {
	public static int ver_int(String message, String title) {
		String n = "";
		int n1 = 0;
		boolean stop = false;
		//////
		/////

		do {
			try {
				n = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (n != null) {
					n1 = Integer.parseInt(n);
					stop = true;
				} else
					stop = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't introduced a valid value.", "Error",
						JOptionPane.ERROR_MESSAGE);
				System.out.println(e);
				stop = false;
			} // end_catch
		} while (stop == false);
		return n1;
	}// end_ver_int
		//////
		/////

	public static float ver_float(String message, String title) {
		String n = "";
		float fn1 = 0;
		boolean stop = false;
		//////
		/////

		do {
			try {
				n = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (n != null) {
					fn1 = Float.parseFloat(n);
					stop = true;
				} else
					stop = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't introduced a valid value.", "Error",
						JOptionPane.ERROR_MESSAGE);
				System.out.println(e);
				stop = false;
			} // end_catch
		} while (stop == false);
		return fn1;
	}// end_ver_float
		//////
		/////

	public static char ver_char(String message, String title) {
		String charc = "";
		char option = 0;
		boolean stop = false;
		//////
		/////

		do {
			try {
				charc = JOptionPane.showInputDialog(null, message, title,
						JOptionPane.QUESTION_MESSAGE);
				if (charc != null) {
					if (charc.matches("^[a-zA-Z]+$")) {
						if (charc.length() == 1) {
							option = charc.charAt(0);
							stop = true;
						} else
							throw new IllegalAccessException("The value is higher than one.");
					} else {
						throw new IllegalAccessException("The value isn't a char.");
					}
				} else
					stop = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't introduce a valid value.", "Error",
						JOptionPane.ERROR_MESSAGE);
				System.out.println(e);
				stop = false;
			} // end_catch
		} while (stop == false);
		return option;
	}// end_ver_char
	//////
	/////
	
	public static String verString(String message, String title) {
		String cad = "";
        boolean stop = false;
        //////
        /////
        
        do {
            try {
                cad = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
                if (cad != null) {
                    stop = true;
                    if (cad.equals(""))
                        throw new IllegalAccessException();
                }else 
                	stop = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has introducido una cadena valida.", "Error", JOptionPane.ERROR_MESSAGE);
                stop = false;
            }//end_catch
        }while (stop == false);
        return cad;
	}// end_verString
	//////
	/////
	
	public static int verAge(String message, String title) {
		int edad = 0;
		boolean repeat = false;
		//////
		/////
		do {
			edad = functions.ver_int("Give me your age.", "Age");
			if ((edad >= 18) && (edad <= 99))
				repeat = true;
			else{
				JOptionPane.showMessageDialog(null, "Your age must have between 18 and 99 years old.", "Error", JOptionPane.ERROR_MESSAGE);
				repeat = false;
			}// end_else
		}while(repeat == false);
		//////
		return edad;
	}// end_verAge
	//////
	/////
	
	public static String[] inputBirthday() {
		//ArrayList<Integer> YearList = new ArrayList<Integer>();
		int option = 0;
		boolean validate = false, error = false;
		String[] birthday = new String[3];
		String[] options = {"Validate", "Continue", "Exit"};
		String[] years = functionsMaths.yearGenerator(82, 18);
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] days = functionsMaths.dayGenerator("");
		JComboBox<String> monthslist = new JComboBox<String>(months);
		JComboBox<String> YearBox = new JComboBox<String>(years); 
		//////
		/////
		
		do {
			JComboBox<String> dayBox = new JComboBox<String>(days);
			Object[] message = {"Select your year.", YearBox,"Select your month.", monthslist, "Select your day", dayBox};
			
			option = JOptionPane.showOptionDialog(null, message, "Birthday", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				switch (option) {
					case 0:
						error = true;
						days = null;
						days = functionsMaths.dayGenerator(monthslist.getSelectedItem().toString());
						break;
						//////
					case 1:
						if (error == true) {
							birthday[0] = YearBox.getSelectedItem().toString();
							birthday[1] = monthslist.getSelectedItem().toString();
							birthday[2] = dayBox.getSelectedItem().toString();
							validate = true;
						}else {
								JOptionPane.showMessageDialog(null, "Validate your month before to continue.", "Error", JOptionPane.ERROR_MESSAGE);
								error = false;
						}// end_else
						break;
						//////
					default:
						validate = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
						break;
						//////
				}// end_switch
		}while (validate == false);
		//////
		return birthday;
	}// end_verBirthYear
	//////
	/////
}
