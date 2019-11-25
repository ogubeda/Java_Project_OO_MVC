package Modules.Cars.Dummies;

import java.util.ArrayList;
import Modules.Cars.Classes.*;
import Modules.Cars.Classes.Singleton;
import Modules.Cars.Dummies.generateDummies;
import Modules.Cars.Utils.*;


public class MenuDummies {
	//////
	public static void main(String[] args) {
		String[] options = {"Electric", "Hybrid", "Combustion", "Exit"};
		int selection = 0, range = 0;
		boolean stop = false;
		Singleton.electricList = new ArrayList<Electric>();
		Singleton.hybridList = new ArrayList<Hybrid>();
		Singleton.combustionList = new ArrayList<Combustion>();
		//////
		/////
		range = functions.ver_int("How much dummies you want to generate?", "Generate Dummies");
		generateDummies.generate(range, -1);
		//////
		do {
			selection = functionsMenu.buttonMenu(options, "Choose a type of car.", "Pick an option");
			switch (selection) {
				case 0:
					MenuSecondDummies.menuSecondary(0);
					break;
					//////
				case 1:
					MenuSecondDummies.menuSecondary(1);
					break;
					//////
				case 2:
					MenuSecondDummies.menuSecondary(2);
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
