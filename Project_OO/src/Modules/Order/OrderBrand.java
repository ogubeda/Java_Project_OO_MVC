package Modules.Order;

import java.util.Comparator;

import Modules.Cars.Classes.Cars;

public class OrderBrand implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        return car1.getBrand().compareTo(car2.getBrand());
    }// end_compare
    //////
    /////

}// end_OrderBrand