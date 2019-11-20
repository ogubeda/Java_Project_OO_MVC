package Modules.Order;

import Modules.Cars.Utils.functionsMenu;

public class OrderMenu {
    //////
    public static int menuString (String title) {
        //////
        String[] options = {"Higher to lower", "Lower to higher", "Back"};
        int select = 0;
        //////
        /////
        select = functionsMenu.buttonMenu(options, "Choose an option.", title);
        //////
        return select;
    }// end_menuString
}// end_OrderStringMenu