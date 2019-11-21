package Modules.Order;

import Modules.Cars.Utils.functionsMenu;

public class OrderMenu {
    //////
    public static int menuString (String opt1, String opt2, String title) {
        //////
        String[] options = {opt1, opt2, "Back"};
        int select = 0;
        //////
        /////
        select = functionsMenu.buttonMenu(options, "Choose an option.", title);
        //////
        return select;
    }// end_menuString
}// end_OrderStringMenu