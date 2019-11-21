package Modules.Order;

import java.util.Comparator;

import Modules.Cars.Classes.*;

public class OrderNumDays implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        if (((Electric)car1).getNumDays() > ((Electric)car2).getNumDays())
            return -1;
        if (((Electric)car1).getNumDays() < ((Electric)car2).getNumDays())
             return 1;
        //////
        return 0;
    }// end_compare
    //////
    /////

}// end_OrderBrand