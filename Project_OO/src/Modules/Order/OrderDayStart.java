package Modules.Order;

import java.util.Comparator;
import Modules.Cars.Classes.Cars;

public class OrderDayStart implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        return car2.getdStartDate().compareDate(car1.getdStartDate());
    }// end_compare
    //////
    /////

}// end_OrderBrand