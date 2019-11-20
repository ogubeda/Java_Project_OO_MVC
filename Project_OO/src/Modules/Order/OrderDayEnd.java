package Modules.Order;

import java.util.Comparator;

import Modules.Cars.Classes.Cars;

public class OrderDayEnd implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        return car1.getdEnd().compareTo(car2.getdEnd());
    }// end_compare
    //////
    /////

}// end_OrderBrand