package Modules.Utils.Menus.Admin;

import javax.swing.JOptionPane;

import Modules.Cars.Utils.functionsMenu;
import Modules.Users.Classes.Users;
import Modules.Users.Dummies.generateDummiesUsers;
import Modules.Users.Dummies.updateDummiesUsers;
import Modules.Users.Utils.functionsCrudUsers;
import Modules.Users.Utils.functionsUsers;
import Modules.Utils.checker;

public class menuCrudUsers {
    //////
    public static void menuSecondary(int typeUser, boolean modeDum) {
		String[] options = {"Create", "Read", "Update", "Remove", "Back"};
		Object[] optSec = {"", "Back", "Exit"};
		int selection = 0, returnedInt = 0;
		boolean replay = false, stop = false;
        String returnedString = "";
        Users user = null;
		//////
		/////
		
		do {
			selection = functionsMenu.buttonMenu(options, "Choose an option", "Pick an option");
			switch (selection) {
				case 0:
					do {
						if (modeDum) {
							if (generateDummiesUsers.generate(typeUser) == 1)
								JOptionPane.showMessageDialog(null, "User created.", "Verify", JOptionPane.INFORMATION_MESSAGE);
						}else {
							functionsCrudUsers.createUser(typeUser);
							//////
							optSec[0] = "Create other User";
							replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Create User");
						}
					}while (replay == true);
					break;
					//////
				case 1:
					do {
						if (checker.checkUsers(typeUser))
							replay = false;
						else {
                            optSec[0] = "Search other User";
							returnedString = functionsCrudUsers.readUser(typeUser);
							//////
							if (returnedString == null)
								replay = false;
							else
								replay = functionsMenu.buttonMenuSec(optSec, returnedString + "\nChoose an option.", "Read User");
						}// end_else
					}while (replay == true);
					break;
					//////
				case 2:
					do {
						if (checker.checkUsers(typeUser))
							replay = false;
						else{
							user = functionsUsers.selectUser(typeUser);
							if (user != null) {
								if (modeDum)
									returnedInt = updateDummiesUsers.update(user, true);
								else {
									returnedInt = functionsCrudUsers.updateUser(user, true);
									optSec[0] = "Update other User";
									if (returnedInt == -1)
										replay = false;
									else
										replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Update User");
								}// end_else
							}else
								replay = false;
						}// end_else
					}while (replay == true);
					break;
					//////
				case 3:
					do {
						if (checker.checkUsers(typeUser))
							replay = false;
						else {
                            optSec[0] = "Delete other User";
							user = functionsUsers.selectUser(typeUser);
							returnedInt = functionsCrudUsers.deleteUser(typeUser);
							if (returnedInt == -1)
								replay = false;
							else
								replay = functionsMenu.buttonMenuSec(optSec, "Choose an option.", "Delete User");
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

}// end_menuCrudUsers
//////