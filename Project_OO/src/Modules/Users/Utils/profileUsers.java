package Modules.Users.Utils;

import Modules.Cars.Utils.functionsMenu;
import Modules.Users.Classes.Users;

public class profileUsers {
    //////
    public static void show(Users user) {
        //////
        String[] options = {"Edit", "Back"};
        int select = 0;
        //////
        /////

        select = functionsMenu.buttonMenu(options, user.toString(), "Profile");
        if (select == 0) {
            functionsCrudUsers.updateUser(user);
        }// end_if
    }
}// end_profileUsers