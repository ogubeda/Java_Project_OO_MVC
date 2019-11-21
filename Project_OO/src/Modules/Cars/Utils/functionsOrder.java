package Modules.Cars.Utils;

import java.util.Collections;

import Modules.Cars.Classes.Singleton;
import Modules.Order.*;

public class functionsOrder {
    //////
    public static void orderElectric() {
        //////
        String[] optionsCombo = {"Brand", "Model", "Start Day", "End Day", "Number of Days", "Battery"};
        int select = 0, menuOrderSel = 0;
        //////
        /////
    
        select = functionsMenu.comboBoxMenu(optionsCombo, "Choose the option for order.", "Order Electric Cars");
        switch (select) {
            case 0:
                menuOrderSel = OrderMenu.menuString("A-Z", "Z-A", "Order Brand");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.electricList, new OrderBrand());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.electricList, Collections.reverseOrder(new OrderBrand()));
                break;
                //////
            case 1:
                menuOrderSel = OrderMenu.menuString("A-Z", "Z-A", "Order Model");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.electricList, new OrderModel());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.electricList, Collections.reverseOrder(new OrderModel()));
                break;
                //////
            case 2:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order Start Day");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.electricList, Collections.reverseOrder(new OrderDayStart()));
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.electricList, new OrderDayStart());
                break;
                //////
            case 3:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order End Day");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.electricList, new OrderDayEnd());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.electricList, Collections.reverseOrder(new OrderDayEnd()));
                break;
                //////
            case 4:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order End Day");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.electricList, new OrderNumDays());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.electricList, Collections.reverseOrder(new OrderNumDays()));
                break;
                //////
            case 5:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order Battery");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.electricList, new OrderBattery());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.electricList, Collections.reverseOrder(new OrderBattery()));
                break;
                //////
            default:
                break;
                //////
        }// end_switch
    }// end_orderElectric
    //////
    /////

    public static void orderHybrid() {
        //////
        String[] optionsCombo = {"Brand", "Model", "Start Day", "End Day", "Number of Days", "Type of Hybrid"};
        int select = 0, menuOrderSel = 0;
        //////
        /////
    
        select = functionsMenu.comboBoxMenu(optionsCombo, "Choose the option for order.", "Order Hybrid Cars");
        switch (select) {
            case 0:
                menuOrderSel = OrderMenu.menuString("A-Z", "Z-A", "Order Brand");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.hybridList, new OrderBrand());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.hybridList, Collections.reverseOrder(new OrderBrand()));
                break;
                //////
            case 1:
                menuOrderSel = OrderMenu.menuString("A-Z", "Z-A", "Order Model");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.hybridList, new OrderModel());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.hybridList, Collections.reverseOrder(new OrderModel()));
                break;
                //////
            case 2:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order Start Day");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.hybridList, Collections.reverseOrder(new OrderDayStart()));
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.hybridList, new OrderDayStart());
                break;
                //////
            case 3:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order End Day");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.hybridList, new OrderDayEnd());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.hybridList, Collections.reverseOrder(new OrderDayEnd()));
                break;
                //////
            case 4:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order End Day");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.hybridList, new OrderNumDays());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.hybridList, Collections.reverseOrder(new OrderNumDays()));
                break;
                //////
            case 5:
                menuOrderSel = OrderMenu.menuString("A-Z", "Z-A", "Order Type of Hybrid");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.hybridList, new OrderTypeHyb());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.hybridList, Collections.reverseOrder(new OrderTypeHyb()));
                break;
                //////
            default:
                break;
                //////
        }// end_switch
    }// end_orderHybrid
    //////
    /////

    public static void orderCombustion() {
        //////
        String[] optionsCombo = {"Brand", "Model", "Start Day", "End Day", "Number of Days", "Type of Combustion"};
        int select = 0, menuOrderSel = 0;
        //////
        /////
    
        select = functionsMenu.comboBoxMenu(optionsCombo, "Choose the option for order.", "Order Combustion Cars");
        switch (select) {
            case 0:
                menuOrderSel = OrderMenu.menuString("A-Z", "Z-A", "Order Brand");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.combustionList, new OrderBrand());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.combustionList, Collections.reverseOrder(new OrderBrand()));
                break;
                //////
            case 1:
                menuOrderSel = OrderMenu.menuString("A-Z", "Z-A", "Order Model");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.combustionList, new OrderModel());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.combustionList, Collections.reverseOrder(new OrderModel()));
                break;
                //////
            case 2:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order Start Day");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.combustionList, Collections.reverseOrder(new OrderDayStart()));
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.combustionList, new OrderDayStart());
                break;
                //////
            case 3:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order End Day");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.combustionList, new OrderDayEnd());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.combustionList, Collections.reverseOrder(new OrderDayEnd()));
                break;
                //////
            case 4:
                menuOrderSel = OrderMenu.menuString("Higher to lower", "Lower to higher", "Order End Day");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.combustionList, new OrderNumDays());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.combustionList, Collections.reverseOrder(new OrderNumDays()));
                break;
                //////
            case 5:
                menuOrderSel = OrderMenu.menuString("A-Z", "Z-A", "Order Type of Combustion");
                if (menuOrderSel == 0)
                    Collections.sort(Singleton.combustionList, new OrderTypeComb());
                if (menuOrderSel == 1)
                    Collections.sort(Singleton.combustionList, Collections.reverseOrder(new OrderTypeComb()));
                break;
                //////
            default:
                break;
                //////
        }// end_switch
    }// end_orderHybrid
    //////
    /////
}// end_funtionsOrder