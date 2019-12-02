package Modules.Utils.Menus.Generic;

import Modules.Cars.Utils.functionsMenu;
import Modules.Users.Classes.Generic;
import Modules.Users.Utils.profileUsers;

public class menuGeneric {
    //////
    public static void menu(Generic user) {
        String[] options = {"Electric", "Hybrid", "Combustion", "Profile","Log Out","Exit"};
		int selection = 0;
		boolean stop = false, modeDum = false;
		//////
		/////

		do {
			selection = functionsMenu.buttonMenu(options, "Choose a type of car.", "Pick an option");
			switch (selection) {
				case 0:
					menuSecondGeneric.menuSecondary(0, modeDum);
					break;
					//////
				case 1:
					menuSecondGeneric.menuSecondary(1, modeDum);
					break;
					//////
				case 2:
					menuSecondGeneric.menuSecondary(2, modeDum);
					break;
					//////
				case 3:
					profileUsers.show(user);
					break;
					//////
				case 4:
                    stop = true;
					break;
					//////
				default:
					stop = functionsMenu.exitConf_win("Do you want to exit?", "Exit");
					break;
					//////
			}// end_switch
        }while (stop == false);
    }// end_menu
}// end_menuGeneric
//////