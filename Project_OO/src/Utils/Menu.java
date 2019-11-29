package Utils;

import java.util.ArrayList;


import Modules.Cars.Classes.*;
import Modules.Cars.Classes.Singleton;
import Modules.Cars.Dummies.generateDummies;
import Modules.Cars.Utils.*;


public class Menu {
	//////
	public static void main(String[] args) {
		String[] options = {"Electric", "Hybrid", "Combustion", "Dummies Mode","Register", "Log In","Exit"};
		int selection = 0, rangeDum = 0;
		boolean stop = false, modeDum = false;
		Singleton.electricList = new ArrayList<Electric>();
		Singleton.hybridList = new ArrayList<Hybrid>();
		Singleton.combustionList = new ArrayList<Combustion>();
		//////
		/////
	
		//////
		do {
			selection = functionsMenu.buttonMenu(options, "Choose a type of car.", "Pick an option");
			switch (selection) {
				case 0:
					MenuSecond.menuSecondary(0, modeDum);
					break;
					//////
				case 1:
					MenuSecond.menuSecondary(1, modeDum);
					break;
					//////
				case 2:
					MenuSecond.menuSecondary(2, modeDum);
					break;
					//////
				case 3:
					if (modeDum == false) {
						rangeDum = functions.ver_int("How much Dummies you want to generate?", "Generate Dummies");
						generateDummies.generate(rangeDum, -1);
						modeDum = true;
						options[3] = "Disable Dummies";
					}else {
						modeDum = false;
						options[3] = "Dummies Mode";
					}
					break;
					//////
				default:
					stop = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
					break;
					//////
			}// end_switch
		}while (stop == false);
	}// end_main
	//////
	/////
	
}// end_Menu
