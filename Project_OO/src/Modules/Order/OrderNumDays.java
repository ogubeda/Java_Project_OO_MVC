package Modules.Order;

import java.util.Comparator;

import Modules.Cars.Classes.Cars;

public class OrderNumDays implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        if (car1.getNumDays() > car2.getNumDays())
            return -1;
        if (car1.getNumDays() < car2.getNumDays())
            return 1;
        return 0;
    }// end_compare
    //////
    /////

}// end_OrderBrand