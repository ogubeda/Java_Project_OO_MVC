package Modules.Order;

import java.util.Comparator;

import Modules.Cars.Classes.Cars;

public class OrderModel implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        return car1.getModel().compareTo(car2.getModel());
    }// end_compare
    //////
    /////

}// end_OrderBrand