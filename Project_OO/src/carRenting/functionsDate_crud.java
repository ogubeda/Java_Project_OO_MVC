package carRenting;

import javax.swing.JOptionPane;
import funciones.functions;
import funciones.functionsRegularExp;

public class functionsDate_crud {
	//////
	public static Fecha createSDate(String message, String title) {
		//////
		String dStart = "";
		boolean firstStep = false;
		Fecha createdDate = null;
		//////
		/////
		
		do {
			dStart = functions.verString(message, title);
			if (functionsRegularExp.verRegExData(dStart) == true) {
				createdDate = new Fecha(dStart);
				if (createdDate.verDate() == true && createdDate.verSysDate() == true)
					firstStep = true;
				else
					JOptionPane.showMessageDialog(null, "You have introduced an invalid date.", "Error", JOptionPane.ERROR_MESSAGE);
			}else
				JOptionPane.showMessageDialog(null, "You haven't introduced the correct format for the date.", "Error", JOptionPane.ERROR_MESSAGE);
		}while (firstStep == false);
		//////
		return createdDate;
	}// end_createSDate
	//////
	/////
	
	public static Fecha createEDate(String message, String title, Fecha sDate) {
		//////
		String dEnd = "";
		Fecha createdDate = null;
		boolean firstStep = false;
		//////
		/////
		
		do {
			dEnd = functions.verString(message, title);
			if (functionsRegularExp.verRegExData(dEnd) == true) {
				createdDate = new Fecha(dEnd);
				if (createdDate.verDate() == true) {
					if (createdDate.subtractDates(sDate) > 0)
						firstStep = true;
					else
						JOptionPane.showMessageDialog(null, "You have introduced a past date compared with the Start Date", "Error", JOptionPane.ERROR_MESSAGE);
				}else
					JOptionPane.showMessageDialog(null, "You have introduced a past date.", "Error", JOptionPane.ERROR_MESSAGE);
			}else
				JOptionPane.showMessageDialog(null, "You didn't respect the correct format.", "Error", JOptionPane.ERROR_MESSAGE);
		}while (firstStep == false);
		//////
		return createdDate;
	}// end_createEDate
	//////
	/////
	
	public static Fecha modifySDate(String message, String title, Fecha sendedDate) {
		//////
		String dEnd = "";
		Fecha createdDate = null;
		boolean firstStep = false;
		//////
		/////
			
		do {
			dEnd = functions.verString(message, title);
			if (functionsRegularExp.verRegExData(dEnd) == true) {
				createdDate = new Fecha(dEnd);
				if (createdDate.verDate() == true && createdDate.verSysDate() == true) {
					if (createdDate.subtractDates(sendedDate) < 0)
						firstStep = true;
					else
						JOptionPane.showMessageDialog(null, "You have introduced a future date compared with the End Date", "Error", JOptionPane.ERROR_MESSAGE);
				}else
					JOptionPane.showMessageDialog(null, "You have introduced a past date.", "Error", JOptionPane.ERROR_MESSAGE);
			}else
				JOptionPane.showMessageDialog(null, "You didn't respect the correct format.", "Error", JOptionPane.ERROR_MESSAGE);
		}while (firstStep == false);
		//////
		return createdDate;
	}// end_modifySDate

}// end_functionsDate_crud
