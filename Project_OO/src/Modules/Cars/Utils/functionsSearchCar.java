package Modules.Cars.Utils;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modules.Cars.Classes.*;

public class functionsSearchCar {
    //////
    public static int search(int typeEngine) {
        //////
        int select = 0, selectFilter = 0,returnedValue = 0;
        boolean resume = false, finded = false;
		String test = "";
        String[] optionsElectric = {"Show All", "Search Car Plate", "Back"};
        ArrayList<Cars> engineList = new ArrayList<Cars>();
        //////

        if (typeEngine == 0)
            engineList.addAll(Singleton.electricList);
        if (typeEngine == 1)
            engineList.addAll(Singleton.hybridList);
        if (typeEngine == 2)
            engineList.addAll(Singleton.combustionList);
        do {
            selectFilter = functionsMenu.buttonMenu(optionsElectric, "Choose an option.", "Choose a filter");
            switch(selectFilter) {
                case 0:
                    select = filterCars.filter(typeEngine);
                    break;
                    //////
                case 1:
                    test = functions.verString("Introduce the Plate of the Car.", "Search Car Plate");
                    //checkCarPlate = new Electric(test);
                    if (functions.verCarPlate(test) == 0) {
                        for (int i = 0; i < engineList.size(); i++) {
                            if (test.equals(engineList.get(i).getCarPlate())) {
                                select = i;
                                finded = true;
                            }// end_if
                        }//end_for
                    }
                    //////
                    if (finded == false)
                        select = -2;
                    break;
                    //////
                default:
                    select = -1;
                    break;
                    //////
            }// end_switch
            if (select >= 0) {
                returnedValue = select;
                resume = true;
            }
            else if (select == -1) {
                resume = true;
                returnedValue = -1;
            }else if (select == -2){
                JOptionPane.showMessageDialog(null, "You haven't choosen any Car", "Error", JOptionPane.ERROR_MESSAGE);
                resume = false;
            }
        }while(resume == false);
        return returnedValue;
    }// end_searchCarElectric
    //////
    /////

}// end_functionsSearchCar