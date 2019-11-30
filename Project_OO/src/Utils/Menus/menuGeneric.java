package Utils.Menus;

import Modules.Cars.Utils.functionsMenu;
import Utils.Menu;
import Utils.MenuSecond;

public class menuGeneric {
    //////
    public static void menu() {
        String[] options = {"Electric", "Hybrid", "Combustion","Log Out","Exit"};
		int selection = 0;
		boolean stop = false, modeDum = false, logOut = false;
		//////
		/////

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
                    stop = true;
                    logOut = true;
					break;
					//////
				default:
					stop = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
					break;
					//////
			}// end_switch
        }while (stop == false);
        if (logOut == true)
            Menu.run();
    }// end_menu
}// end_menuGeneric
//////