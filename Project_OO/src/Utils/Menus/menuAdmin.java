package Utils.Menus;

import Modules.Cars.Dummies.generateDummies;
import Modules.Cars.Utils.functions;
import Modules.Cars.Utils.functionsMenu;
import Utils.Menu;
import Utils.MenuSecond;

public class menuAdmin {
    //////
    public static void menu() {
        //////
        String[] options = {"Electric", "Hybrid", "Combustion", "Dummies Mode", "Admin Users","Log Out","Exit"};
		int selection = 0, rangeDum = 0;
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
                case 4:
                    break;
                    //////
                case 5:
                    logOut = true;
                    stop = true;
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
}// end_menuAdmin