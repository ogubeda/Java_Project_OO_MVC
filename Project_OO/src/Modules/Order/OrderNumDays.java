package Modules.Order;

import java.util.Comparator;

import Modules.Cars.Classes.*;
import Modules.Cars.Utils.functionsMenu;

public class OrderNumDays implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        String[] options = {"Higher to lower", "Lower to higher", "Back"};
        int select = 0;
        //////
        /////

        select = functionsMenu.buttonMenu(options, "Choose an option.", "Higher to Lower Number of Days");
        if (select == 0) {
            if (((Electric)car1).getNumDays() > ((Electric)car2).getNumDays())
                return -1;
            if (((Electric)car1).getNumDays() < ((Electric)car2).getNumDays())
                return 1;
        }else if (select == 1) {
            if (((Electric)car1).getNumDays() < ((Electric)car2).getNumDays())
                return -1;
            if (((Electric)car1).getNumDays() > ((Electric)car2).getNumDays())
                return 1;
        }// end_else
        //////
        return 0;
    }// end_compare
    //////
    /////

}// end_OrderBrand