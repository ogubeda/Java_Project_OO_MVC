package Modules.Utils.Menus.Admin;

import Modules.Cars.Utils.functionsMenu;

public class menuTypeUsers {
    //////
    public static void menu(boolean modeDum) {
        String[] options = {"Generic", "VIP", "Admin","Back"};
		int selection = 0;
		boolean stop = false;
		//////
		/////

		do {
			selection = functionsMenu.buttonMenu(options, "Choose a type of user.", "Pick an option");
			switch (selection) {
				case 0:
					menuCrudUsers.menuSecondary(0, modeDum);
					break;
					//////
				case 1:
					menuCrudUsers.menuSecondary(1, modeDum);
					break;
					//////
				case 2:
					menuCrudUsers.menuSecondary(2, modeDum);
					break;
					//////
				default:
					stop = true;
					break;
					//////
			}// end_switch
        }while (stop == false);
    }// end_menu
}// menuTypeUsers
//////