package Modules.Order;

import java.util.Comparator;
import Modules.Cars.Classes.*;

public class OrderBattery implements Comparator<Cars> {
    //////
    public int compare (Cars car1, Cars car2) {
        //////
        if (((Electric)car1).getbattery() > ((Electric)car2).getbattery())
            return -1;
        if (((Electric)car1).getbattery() < ((Electric)car2).getbattery())
            return 1;
        return 0;
    }// end_compare
    //////
    /////

}// end_OrderBrand