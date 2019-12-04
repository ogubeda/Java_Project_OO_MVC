package Modules.Utils.Menus.Admin;

import Modules.Cars.Utils.*;
import Modules.Users.Classes.Admin;
import Modules.Users.Utils.profileUsers;
import Modules.Utils.chooseDummies;

public class menuAdmin {
    //////
    public static void menu(Admin user) {
        //////
        String[] options = {"Electric", "Hybrid", "Combustion", "Dummies Mode", "Admin Users", "Profile","Log Out","Exit"};
		int selection = 0;
		boolean stop = false, modeDum = false;
		//////
		/////
	
		do {
			selection = functionsMenu.buttonMenu(options, "Select an option.", "Pick an option");
			switch (selection) {
				case 0:
					menuSecondAdmin.menuSecondary(0, modeDum);
					break;
					//////
				case 1:
					menuSecondAdmin.menuSecondary(1, modeDum);;
					break;
					//////
				case 2:
					menuSecondAdmin .menuSecondary(2, modeDum);
					break;
					//////
				case 3:
					if (modeDum == false) {
						chooseDummies.quantity();
						modeDum = true;
						options[3] = "Disable Dummies";
						System.out.println("Dummies on.");
					}else {
						modeDum = false;
						options[3] = "Dummies Mode";
						System.out.println("Dummies off.");
					}
					break;
                    //////
				case 4:
					menuTypeUsers.menu(modeDum);
                    break;
					//////
				case 5:
					profileUsers.show(user);
					break;
					//////
                case 6:
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
}// end_menuAdmin