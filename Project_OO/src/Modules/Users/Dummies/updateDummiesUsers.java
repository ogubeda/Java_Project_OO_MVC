package Modules.Users.Dummies;

import Modules.Cars.Utils.functionsMenu;
import Modules.Users.Classes.Users;

public class updateDummiesUsers {
    //////
    public static int update(Users user) {
         //////
         String[] options = {"Username", "Password", "Email", "Back"};
         int select = 0, returnedValue = 0;
         //////
         /////
 
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
         return returnedValue;
    }// end_update
}// end_updateDummiesUsers
//////