package Modules.Cars.Utils;

import javax.swing.JOptionPane;
import Modules.Cars.Classes.Singleton;

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
                JOptionPane.showMessageDialog(null, "You haven't introduced a valid chain.", "Error", JOptionPane.ERROR_MESSAGE);
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

	public static int verCarPlate (String carPlate) {
		//////
		boolean repeatedPlateC = false, repeatedPlateE = false, repeatedPlateH = false;
		//////
		/////

		if (functionsRegularExp.verRegExCarPlate(carPlate)) {
			for (int i = 0; i < Singleton.electricList.size(); i++) {
				if (carPlate.equals(Singleton.electricList.get(i).getCarPlate()))
					repeatedPlateE = true;
			}// end_for
			//////
			for (int i = 0; i < Singleton.hybridList.size(); i++) {
				if (carPlate.equals(Singleton.hybridList.get(i).getCarPlate()))
					repeatedPlateH = true;
			}// end_for
			//////
			for (int i = 0; i < Singleton.combustionList.size(); i++) {
				if (carPlate.equals(Singleton.combustionList.get(i).getCarPlate()))
					repeatedPlateC = true;
			}// end_for
			if (repeatedPlateE == false && repeatedPlateH == false && repeatedPlateC == false)
				return 1;
			else
				return 0;
		}else {
			JOptionPane.showMessageDialog(null, "Invalid Car Plate format.", "Error", JOptionPane.ERROR_MESSAGE);
			return -1;
		}
	}//////
	/////

}
