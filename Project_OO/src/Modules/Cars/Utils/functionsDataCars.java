package Modules.Cars.Utils;

import javax.swing.JOptionPane;

import Modules.Cars.Classes.Singleton;

public class functionsDataCars {
	//////Creación de las funciones para crear los atributos generales
	/////
	
	public static String createBrand(String message, String title) {
		//////
		String brand = "";
		boolean resume = false;
		//////
		/////
		
		do {
			brand = functions.verString(message, title);
			if (functionsRegularExp.verRegExName(brand) == true)
				resume = true;
			else
				JOptionPane.showMessageDialog(null, "You haven't introduced a valid Brand.", "Error", JOptionPane.ERROR_MESSAGE);
		}while (resume == false);
		//////
		return brand;
	}//end_createBrand
	//////
	/////
	
	public static String createModel(String message, String title) {
		//////
		String model = "";
		boolean resume = false;
		//////
		/////
		
		do {
			model = functions.verString(message, title);
			if (functionsRegularExp.verRegExNameNum(model) == true)
				resume = true;
			else
				JOptionPane.showMessageDialog(null, "You haven't introduce a valid Model", "Error", JOptionPane.ERROR_MESSAGE);
		}while (resume == false);
		//////
		return model;
	}// end_createModelString
	//////
	/////
	
	public static int createSeats(String message, String title) {
		//////
		int seats = 0;
		boolean resume = false;
		//////
		/////
		
		do {
			seats = functions.ver_int(message, title);
			if (seats > 8)
				JOptionPane.showMessageDialog(null, "You have introduced to much Seats.", "Error", JOptionPane.ERROR_MESSAGE);
			else if (seats < 3)
				JOptionPane.showMessageDialog(null, "You can't introduce less than 3 Seats", "Error", JOptionPane.ERROR_MESSAGE);
			else
				resume = true;
		}while (resume == false);
		//////
		return seats;
		//////
	}// createSeats
	//////
	/////
	
	public static boolean createParkingHelp(String message, String title) {
		//////
		boolean parkinghelp = false;
		//////
		/////
		
		parkinghelp = functionsMenu.contWin(message, title);
		//////
		return parkinghelp;
	}// end_createParkingHelp
	//////
	/////
	
	public static int createDoors(String message, String title) {
		//////
		int doors = 0;
		boolean resume = false;
		//////
		/////
		
		do {
			doors = functions.ver_int(message, title);
			if (doors < 2)
				JOptionPane.showMessageDialog(null, "You can't introduce less than 2 doors.", "Error", JOptionPane.ERROR_MESSAGE);
			else if (doors > 6)
				JOptionPane.showMessageDialog(null, "You can't introduce more than 5 doors.", "Error", JOptionPane.ERROR_MESSAGE);
			else
				resume = true;
		}while (resume == false);
		//////
		return doors;
	}// end_createDoors
	//////
	/////

	public static String createCarPlate (String message, String title) {
		//////
		String carPlate = "";
		boolean resume = false, repeatedPlateE = false, repeatedPlateH = false, repeatedPlateC = false;
		//////
		/////

		do {
			repeatedPlateC = false;
			repeatedPlateE = false;
			repeatedPlateH = false;
			carPlate = functions.verString(message, title);
			if (functionsRegularExp.verRegExCarPlate(carPlate) == true) {
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
				//////
				if (repeatedPlateE == false && repeatedPlateH == false && repeatedPlateC == false)
					resume = true;
				else
					JOptionPane.showMessageDialog(null, "The Plate of the Car is repeated", "Error", JOptionPane.ERROR_MESSAGE);
		}else
				JOptionPane.showMessageDialog(null, "You have introduced an invalid format", "Error", JOptionPane.ERROR_MESSAGE);
		}while (resume == false);
		//////
		return carPlate;
	}// end_createCarPlate
	//////
	/////
	
	public static String createDStart(String message, String title) {
		//////
		String dStart = "";
		boolean resume = false;
		//////
		/////
		
		do {
			dStart = functions.verString(message, title);
			if (functionsRegularExp.verRegExData(dStart) == true)
				resume = true;
			else
				JOptionPane.showMessageDialog(null, "You haven't introduced the correct format for the date.", "Error", JOptionPane.ERROR_MESSAGE);
		}while (resume == false);
		//////
		return dStart;
	}// end_createDStart
	//////
	/////
	
	public static String createDEnd(String message, String title) {
		//////
		String dEnd = "";
		boolean resume = false;
		//////
		/////
		
		do {
			dEnd = functions.verString(message, title);
			if (functionsRegularExp.verRegExData(dEnd) == true)
				resume = true;
			else
				JOptionPane.showMessageDialog(null, "You haven't introduced the correct format for the date.", "Error", JOptionPane.ERROR_MESSAGE);
		}while (resume == false);
		//////
		return dEnd;
	}// end_createDEnd
	//////
	/////
	
	//////Funciones para crear los atributos de objetos especificos
	public static int createbattery(String message, String title) {
		//////
		int battery = 0;
		boolean resume = false;
		//////
		/////
		
		do {
			battery = functions.ver_int(message, title);
			if (battery < 60)
				JOptionPane.showMessageDialog(null, "There isn't bateries lower than 60kWh.", "Error", JOptionPane.ERROR_MESSAGE);
			else
				resume = true;
		}while (resume == false);
		//////
		return battery;
	}// end_createbattery
	//////
	/////
	
	public static String createTypeHybrid(String message, String title) {
		//////
		String typeHybrid = "";
		int type = 0;
		String[] comboBody = {"Electric/Diesel", "Electric/Petrol", "Hydrogen/Diesel", "Hydrogen/Petorl"};
		//////
		/////
		
		type = functionsMenu.comboBoxMenu(comboBody, message, title);
		if (type == 0)
			typeHybrid = comboBody[0];
		if (type == 1)
			typeHybrid = comboBody[1];
		if (type == 2)
			typeHybrid = comboBody[2];
		if (type == 3)
			typeHybrid = comboBody[3];
		//////
		return typeHybrid;
	}// end_createTypeHybrid
	//////
	/////
	
	public static String createTypeCombustion(String message, String title) {
		//////
		String typeCombustion = "";
		int type = 0;
		String[] options = {"Petrol", "Diesel", "Natural Gas"};
		//////
		/////
		
		type = functionsMenu.buttonMenu(options, message, title);
		if (type == 0)
			typeCombustion = options[0];
		if (type == 1)
			typeCombustion = options[1];
		if (type == 2)
			typeCombustion = options[2];
		//////
		return typeCombustion;
	}// end_createTypeCombustion

}// end_functionsDataCars
