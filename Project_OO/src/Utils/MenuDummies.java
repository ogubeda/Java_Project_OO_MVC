package Utils;

import java.util.ArrayList;

import Modules.Cars.Classes.*;
import Modules.Cars.Classes.Singleton;
import Modules.Cars.Utils.*;
import Modules.Dummies.generateDummies;

public class MenuDummies {
	//////
	public static void main(String[] args) {
		String[] options = {"Electric", "Hybrid", "Combustion", "Exit"};
		int selection = 0;
		boolean stop = false;
		Singleton.electricList = new ArrayList<Electric>();
		Singleton.hybridList = new ArrayList<Hybrid>();
		Singleton.combustionList = new ArrayList<Combustion>();
        //////
        generateDummies.generate();
		//////
		/////
		
		do {
			selection = functionsMenu.buttonMenu(options, "Choose a type of car.", "Pick an option");
			switch (selection) {
				case 0:
					MenuSecond.menuSecondary(0);
					break;
					//////
				case 1:
					MenuSecond.menuSecondary(1);
					break;
					//////
				case 2:
					MenuSecond.menuSecondary(2);
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
	
}// end_MenuDummies