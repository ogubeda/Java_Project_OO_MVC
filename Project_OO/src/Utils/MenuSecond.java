package Utils;

import javax.swing.JOptionPane;
import Modules.Cars.Utils.*;
import Modules.Order.Singleton;
public class MenuSecond {
	//////
	public static void menuSecondary(int engine) {
		String[] options = {"Create", "Read", "Update", "Remove", "Back"};
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
						pd.createCar(engine);
						replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Ex1");
					}while (replay == true);
					break;
					//////
				case 1:
					do {
						if (((Singleton.electricList.isEmpty()) && (engine == 0)) || ((Singleton.hybridList.isEmpty()) && (engine == 1)) || ((Singleton.combustionList.isEmpty()) && (engine == 2))) {
							JOptionPane.showMessageDialog(null, "There's not created cars.", "Error", JOptionPane.ERROR_MESSAGE);
							replay = false;
						}else {
							optSec[0] = "Search other car";
							returnedString = pd.readCar(engine);
							if (returnedString == null)
								replay = false;
							else
								replay = functionsMenu.buttonMenuSec(optSec, returnedString + "\nChoose an option.", "Ex2");
						}// end_else
					}while (replay == true);
					break;
					//////
				case 2:
					do {
						if (((Singleton.electricList.isEmpty()) && (engine == 0)) || ((Singleton.hybridList.isEmpty()) && (engine == 1)) || ((Singleton.combustionList.isEmpty()) && (engine == 2))) {
							JOptionPane.showMessageDialog(null, "There's not created cars.", "Error", JOptionPane.ERROR_MESSAGE);
							replay = false;
						}else{
							optSec[0] = "Update other car";
							returnedInt = pd.updateCar(engine);
							if (returnedInt == -2)
								replay = false;
							else
								replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Ex3");
						}// end_else
					}while (replay == true);
					break;
					//////
				case 3:
					do {
						if (((Singleton.electricList.isEmpty()) && (engine == 0)) || ((Singleton.hybridList.isEmpty()) && (engine == 1)) || ((Singleton.combustionList.isEmpty()) && (engine == 2))) {
							JOptionPane.showMessageDialog(null, "There's not created cars.", "Error", JOptionPane.ERROR_MESSAGE);
							replay = false;
						}else {
							optSec[0] = "Delete other car";
							returnedInt = pd.deleteCar(engine);
							if (returnedInt == -2)
								replay = false;
							else
								replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Ex3");
						}// end_else
					}while (replay == true);
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
