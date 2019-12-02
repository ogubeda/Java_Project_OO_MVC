package Modules.Users.Dummies;

import Modules.Cars.Utils.functionsMenu;
import Modules.Users.Classes.Users;
import Modules.Users.Utils.functionsLogIn;

public class updateDummiesUsers {
    //////
    public static int update(Users user, boolean admin) {
        //////
        String[] options = {"Username", "Password", "Email", "Back"};
        String[] optionsAd = {"Username", "Password", "Email", "Change Type","Back"};
        int select = 0, returnedValue = 0;
        //////
        /////

        if (admin == false){
            select = functionsMenu.buttonMenu(options, "Choose an option.", "Update User");
            switch (select) {
                case 0:
                    user.setUsername("");
                    user.setUsername(generateDummiesUsers.generateUsername());
                    break;
                    //////
                case 1:
                    user.setPassword(generateDummiesUsers.generatePassword(user.getUsername()));
                    break;
                    //////
                case 2:
                    user.setEmail("");
                    user.setEmail(generateDummiesUsers.generateEmail(user.getUsername()));
                    break;
                    //////
                default:
                    returnedValue = -1;
                    break;
                    //////
            }// end_switch
        }else {
            select = functionsMenu.buttonMenu(optionsAd, "Choose an option.", "Update User");
            switch (select) {
                case 0:
                    user.setUsername("");
                    user.setUsername(generateDummiesUsers.generateUsername());
                    break;
                    //////
                case 1:
                    user.setPassword(generateDummiesUsers.generatePassword(user.getUsername()));
                    break;
                    //////
                case 2:
                    user.setEmail("");
                    user.setEmail(generateDummiesUsers.generateEmail(user.getUsername()));
                    break;
                    //////
                case 3:
                    returnedValue = functionsLogIn.changeUser(user);
                    break;
                    //////
                default:
                    returnedValue = -1;
                    break;
                    //////
            }// end_switch
        }// end_else
        return returnedValue;
    }// end_updateUser
    //////
    /////
}// end_updateDummiesUsers
//////