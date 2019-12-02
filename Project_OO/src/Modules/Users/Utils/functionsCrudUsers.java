package Modules.Users.Utils;

import Modules.Cars.Utils.functionsMenu;
import Modules.Users.Classes.SingletonUsers;
import Modules.Users.Classes.Users;

public class functionsCrudUsers {
    //////
    public static void createUser(int typeUser){
        //////

        functionsLogIn.Register(typeUser, true);
    }// end_createUser
    //////
    /////

    public static String readUser(int typeUser) {
        //////
        int select = 0;
        //////
        /////

        select = functionsUsers.selectUserPos(typeUser);
        if (select != -1) {
            if (typeUser == 0)
                return SingletonUsers.genericList.get(select).toString();
            if (typeUser == 1)
                return SingletonUsers.VIPList.get(select).toString();
            if (typeUser == 2)
                return SingletonUsers.adminList.get(select).toString();
        }
        return null;
    }// end_readUser
    //////
    /////

    public static int updateUser(Users user, boolean admin) {
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
                    user.setUsername(functionsLogIn.createUsername());
                    break;
                    //////
                case 1:
                    user.setPassword(functionsLogIn.createPassword());
                    break;
                    //////
                case 2:
                    user.setEmail("");
                    user.setEmail(functionsLogIn.createEmail());
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
                    user.setUsername(functionsLogIn.createUsername());
                    break;
                    //////
                case 1:
                    user.setPassword(functionsLogIn.createPassword());
                    break;
                    //////
                case 2:
                    user.setEmail("");
                    user.setEmail(functionsLogIn.createEmail());
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

    public static int deleteUser(int typeUser) {
        //////
        int select = 0;
        //////
        /////

        select = functionsUsers.selectUserPos(typeUser);
        if (select != 1) {
            if (typeUser == 0)
                SingletonUsers.genericList.remove(select);
            if (typeUser == 1)
                SingletonUsers.VIPList.remove(select);
            if (typeUser == 2)
                SingletonUsers.adminList.remove(select);
            return 0;
        }
        return -1;
    }//end_deleteUser
    //////
    /////

}// end_functionsCrudUsers