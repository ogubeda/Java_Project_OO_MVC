package Modules.Utils;

import Modules.Cars.Utils.*;

public class MenuSecond {
	//////
	public static void menuSecondary(int engine, boolean modeDum) {
		String[] options = {"Read", "Order","Back"};
		Object[] optSec = {"", "Back", "Exit"};
		int selection = 0;
		boolean replay = false, stop = false;
		String returnedString = "";
		//////
		/////
		
		do {
			selection = functionsMenu.buttonMenu(options, "Choose an option", "Pick an option");
			switch (selection) {
				case 0:
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
				case 1:
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
}// end_MenuSecond
