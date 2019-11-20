package Modules.Cars.Utils;

import java.util.Collections;

import Modules.Cars.Classes.Singleton;
import Modules.Order.*;

public class functionsOrder {
    //////
    public static int orderElectric() {
        //////
        String[] optionsCombo = {"Brand", "Model", "Start Day", "End Day", "Number of Days", "Battery"};
        int select = 0, menuOrderSel = 0, returnedInt = 0;
        //////
        /////
    
        select = functionsMenu.comboBoxMenu(optionsCombo, "Choose the option for order.", "Order Electric Cars");
        switch (select) {
            case 0:
                menuOrderSel = OrderMenu.menuString("Order Brand");
                Collections.sort(Singleton.electricList, new OrderBrand());
                break;
                //////
            case 1:
                Collections.sort(Singleton.electricList, new OrderModel());
                break;
                //////
            case 2:
                Collections.sort(Singleton.electricList, new OrderDayStart());
                break;
                //////
            case 3:
                Collections.sort(Singleton.electricList, new OrderDayEnd());
                break;
                //////
            case 4:
                Collections.sort(Singleton.electricList, new OrderNumDays());
                break;
                //////
            case 5:
                Collections.sort(Singleton.electricList, new OrderBattery());
                break;
                //////
            default:
                returnedInt = -1;
                break;
                //////
        }// end_switch
        return returnedInt;
    }// end_orderElectric
    //////
    /////

    public static int orderHybrid() {
        //////
        String[] optionsCombo = {"Brand", "Model", "Start Day", "End Day", "Number of Days", "Type of Hybrid"};
        int select = 0, returnedInt = 0;
        //////
        /////
    
        select = functionsMenu.comboBoxMenu(optionsCombo, "Choose the option for order.", "Order Hybrid Cars");
        switch (select) {
            case 0:
                Collections.sort(Singleton.hybridList, new OrderBrand());
                break;
                //////
            case 1:
                Collections.sort(Singleton.hybridList, new OrderModel());
                break;
                //////
            case 2:
                Collections.sort(Singleton.hybridList, new OrderDayStart());
                break;
                //////
            case 3:
                Collections.sort(Singleton.hybridList, new OrderDayEnd());
                break;
                //////
            case 4:
                Collections.sort(Singleton.hybridList, new OrderNumDays());
                break;
                //////
            case 5:
                Collections.sort(Singleton.hybridList, new OrderTypeHyb());
                break;
                //////
            default:
                returnedInt = -1;
                break;
                //////
        }// end_switch
        return returnedInt;
    }// end_orderHybrid
    //////
    /////

    public static int orderCombustion() {
        //////
        String[] optionsCombo = {"Brand", "Model", "Start Day", "End Day", "Number of Days", "Type of Combustion"};
        int select = 0, returnedInt = 0;
        //////
        /////
    
        select = functionsMenu.comboBoxMenu(optionsCombo, "Choose the option for order.", "Order Combustion Cars");
        switch (select) {
            case 0:
                Collections.sort(Singleton.combustionList, new OrderBrand());
                break;
                //////
            case 1:
                Collections.sort(Singleton.combustionList, new OrderModel());
                break;
                //////
            case 2:
                Collections.sort(Singleton.combustionList, new OrderDayStart());
                break;
                //////
            case 3:
                Collections.sort(Singleton.combustionList, new OrderDayEnd());
                break;
                //////
            case 4:
                Collections.sort(Singleton.combustionList, new OrderNumDays());
                break;
                //////
            case 5:
                Collections.sort(Singleton.combustionList, new OrderBattery());
                break;
                //////
            default:
                returnedInt = -1;
                break;
                //////
        }// end_switch
        return returnedInt;
    }// end_orderHybrid
    //////
    /////
}// end_funtionsOrder