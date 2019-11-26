package Modules.Cars.Dummies;

import javax.swing.JOptionPane;

import Modules.Cars.Classes.Singleton;
import Modules.Cars.Utils.*;
public class MenuSecondDummies {
	//////
	public static void menuSecondary(int engine) {
		String[] options = {"Create", "Read", "Update", "Remove", "Order","Back"};
		Object[] optSec = {"", "Back", "Exit"};
		int selection = 0, returnedInt = 0;
		boolean replay = false, stop = false;
		String returnedString = "";
		functionsCars_crud pd = new functionsCars_crud();
		//////
		/////
		
		do {
			selection = functionsMenu.buttonMenu(options, "Choose an option", "Pick an option");
			switch (selection) {
				case 0:
					do {
						optSec[0] = "Create other car";
						generateDummies.generate(1, engine);;
						replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Create Car");
					}while (replay == true);
					break;
					//////
				case 1:
					do {
						if (checkCars(engine))
							replay = false;
						else {
							optSec[0] = "Search other car";
							returnedString = pd.readCar(engine);
							if (returnedString == null)
								replay = false;
							else
								replay = functionsMenu.buttonMenuSec(optSec, returnedString + "\nChoose an option.", "Read Car");
						}// end_else
					}while (replay == true);
					break;
					//////
				case 2:
					do {
						if (checkCars(engine))
							replay = false;
						else{
							optSec[0] = "Update other car";
							returnedInt = updateDummies.updateCar(engine);
							if (returnedInt == -1)
								replay = false;
							else
								replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Update Car");
						}// end_else
					}while (replay == true);
					break;
					//////
				case 3:
					do {
						if (checkCars(engine))
							replay = false;
						else {
							optSec[0] = "Delete other car";
							returnedInt = pd.deleteCar(engine);
							if (returnedInt == -1)
								replay = false;
							else
								replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Delete Car");
						}// end_else
					}while (replay == true);
					break;
					//////
				case 4:
					if (checkCars(engine) == false) {
						if (engine == 0)
							functionsOrder.orderElectric();
						if (engine == 1)
							functionsOrder.orderHybrid();
						if (engine == 2)
							functionsOrder.orderCombustion();
						}
					break;
					//////
				default:
					stop = true;
					break;
					//////
			}// end_switch
		}while (stop == false);
	}// end_main
	//////
	/////

	public static boolean checkCars(int engine) {
		//////
		/////

		if (((Singleton.electricList.isEmpty()) && (engine == 0)) || ((Singleton.hybridList.isEmpty()) && (engine == 1)) || ((Singleton.combustionList.isEmpty()) && (engine == 2))) {
			JOptionPane.showMessageDialog(null, "There's not created cars.", "Error", JOptionPane.ERROR_MESSAGE);
			return true;
		}// end_if
		return false;
	}// end_checkCars
	//////
	/////
}// end_MenuSecond