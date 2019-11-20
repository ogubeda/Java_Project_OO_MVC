package Modules.Order;

import java.util.Comparator;

import Modules.Cars.Classes.*;

public class OrderTypeComb implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        return ((Combustion)car1).getBrand().compareTo(((Combustion)car2).getBrand());
    }// end_compare
    //////
    /////

}// end_OrderBrand