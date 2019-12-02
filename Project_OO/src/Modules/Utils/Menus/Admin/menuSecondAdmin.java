package Modules.Utils.Menus.Admin;

import javax.swing.JOptionPane;

import Modules.Cars.Dummies.*;
import Modules.Cars.Utils.*;
import Modules.Utils.checker;

public class menuSecondAdmin {
    //////
	public static void menuSecondary(int engine, boolean modeDum) {
		String[] options = {"Create", "Read", "Update", "Remove", "Order","Back"};
		Object[] optSec = {"", "Back", "Exit"};
		int selection = 0, returnedInt = 0;
		boolean replay = false, stop = false;
		String returnedString = "";
		//////
		/////
		
		do {
			selection = functionsMenu.buttonMenu(options, "Choose an option", "Pick an option");
			switch (selection) {
				case 0:
					do {
						if (modeDum) {
							if (generateDummies.generate(engine) == 1)
								JOptionPane.showMessageDialog(null, "Car create", "Verify", JOptionPane.INFORMATION_MESSAGE);
						}else
							functionsCars_crud.createCar(engine);
						//////
						optSec[0] = "Create other car";
						replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Create Car");
					}while (replay == true);
					break;
					//////
				case 1:
					do {
						if (checker.checkCars(engine))
							replay = false;
						else {
							optSec[0] = "Search other car";
							returnedString = functionsCars_crud.readCar(engine);
							//////
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
						if (checker.checkCars(engine))
							replay = false;
						else{
							if (modeDum)
								updateDummies.updateCar(engine);
							else
								returnedInt = functionsCars_crud.updateCar(engine);
							//////
							optSec[0] = "Update other car";
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
						if (checker.checkCars(engine))
							replay = false;
						else {
							optSec[0] = "Delete other car";
							returnedInt = functionsCars_crud.deleteCar(engine);
							if (returnedInt == -1)
								replay = false;
							else
								replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Delete Car");
						}// end_else
					}while (replay == true);
					break;
					//////
				case 4:
					if (checker.checkCars(engine) == false) {
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

}