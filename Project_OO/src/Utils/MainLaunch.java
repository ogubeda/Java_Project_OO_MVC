package Utils;

import Modules.Cars.Utils.functionsMenu;

public class MainLaunch {
    //////
    public static void main (String[] args) {
        //////
        String[] optionsLogIn = {"Register", "Log In", "Exit"};
        int select = 0;
        //////
        /////

        select = functionsMenu.buttonMenu(optionsLogIn, "Welcome to our app for rent a car.\nChoose an option.", "Log In");
        switch (select) {
            case 0:
                break;
                //////
            case 1:
                break;
                //////
        }// end_switch

    }//end_main
    //////
}// end_MainLaunch
//////