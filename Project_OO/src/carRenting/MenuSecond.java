package carRenting;

import javax.swing.JOptionPane;

import funciones.functionsMenu;

public class MenuSecond {
	//////
	public static void menuSecondary(int engine) {
		String[] options = {"Create", "Read", "Update", "Remove", "Back"};
		Object[] optSec = {"", "Back", "Exit"};
		int selection = 0;
		boolean replay = false, stop = false;
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
						if (((Menu.electricList.size() <= 0) && (engine == 0)) || ((Menu.hybridList.size() <= 0) && (engine == 1)) || ((Menu.combustionList.size() <= 0) && (engine == 2))) {
							JOptionPane.showMessageDialog(null, "There's not created cars.", "Error", JOptionPane.ERROR_MESSAGE);
							replay = false;
						}else {
							optSec[0] = "Search other car";
							replay = functionsMenu.buttonMenuSec(optSec, pd.readCar(engine) + "\nChoose an option.", "Ex2");
						}// end_else
					}while (replay == true);
					break;
					//////
				case 2:
					do {
						if (((Menu.electricList.size() <= 0) && (engine == 0)) || ((Menu.hybridList.size() <= 0) && (engine == 1)) || ((Menu.combustionList.size() <= 0) && (engine == 2))) {
							JOptionPane.showMessageDialog(null, "There's not created cars.", "Error", JOptionPane.ERROR_MESSAGE);
							replay = false;
						}else{
							optSec[0] = "Update other car";
							pd.updateCar(engine);
							replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Ex3");
						}// end_else
					}while (replay == true);
					break;
					//////
				case 3:
					do {
						if (((Menu.electricList.size() <= 0) && (engine == 0)) || ((Menu.hybridList.size() <= 0) && (engine == 1)) || ((Menu.combustionList.size() <= 0) && (engine == 2))) {
							JOptionPane.showMessageDialog(null, "There's not created cars.", "Error", JOptionPane.ERROR_MESSAGE);
							replay = false;
						}else {
							optSec[0] = "Delete other car";
							pd.deleteCar(engine);
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
