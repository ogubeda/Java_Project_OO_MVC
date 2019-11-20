package Modules.Order;

import java.util.Comparator;

import Modules.Cars.Classes.*;

public class OrderTypeHyb implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        return ((Hybrid)car1).getTypeSecond().compareTo(((Hybrid)car2).getTypeSecond());
    }// end_compare
    //////
    /////

}// end_OrderBrand