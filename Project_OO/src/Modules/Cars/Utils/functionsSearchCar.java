package Modules.Cars.Utils;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modules.Cars.Classes.*;

public class functionsSearchCar {
    //////
    public static int searchCarElectric(ArrayList<Electric> engineList) { 
        ArrayList<Integer> posList = new ArrayList<Integer>();
        ArrayList<String> modelList = new ArrayList<String>();
        int select = 0, selectFilter = 0,returnedValue = 0;
        boolean resume = false, exit = false;
		String test = "";
		String[] optionsElectric = {"Show All", "Search Car Plate", "Back"};
        //////
        do {
            selectFilter = functionsMenu.buttonMenu(optionsElectric, "Choose an option.", "Choose a filter");
            switch(selectFilter) {
                case 0:
                    for (int i = 0; i < engineList.size(); i++) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_for
                    String[] modelButtons = modelList.toArray(new String[0]);
                    select = functionsMenu.comboBoxMenu(modelButtons, "Select the car", "Select");
                    returnedValue = posList.get(select);
                    resume = true;
                    break;
                    //////
                case 1:
                    test = functionsDataCars.createCarPlate("Introduce the Plate of the Car.", "Search Car Plate");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (test.equals(Singleton.electricList.get(i).getBrand())) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                default:
                    exit = true;
                    break;
                    //////
            }// end_switch
            if (modelList.size() > 0) {
                String[] modelButtons = modelList.toArray(new String[0]);
                select = functionsMenu.comboBoxMenu(modelButtons, "Select the car", "Select");
                if (select == -1){
                    resume = false;
                    modelList.clear();
                    posList.clear();
                }else{
                    returnedValue = posList.get(select);
                    resume = true;
                }
            }else {
                if (exit == false)
                    JOptionPane.showMessageDialog(null, "No matches.", "Error", JOptionPane.ERROR_MESSAGE);
                else {
                    returnedValue = -1;
                    resume = true;
                }
            }
        }while(resume == false);
        return returnedValue;
    }// end_searchCarElectric
    //////
    /////

    public static int searchCarHybrid(ArrayList<Hybrid> engineList) { 
        ArrayList<Integer> posList = new ArrayList<Integer>();
        ArrayList<String> modelList = new ArrayList<String>();
        int select = 0, selectFilter = 0, seats = 0, doors = 0, returnedValue = 0;
        boolean parkingHelp = false, resume = false, exit = false;
		String test = "";
		String[] optionsHybrid = {"Show All", "Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Type of Hybrid", "Back"};
        //////
        do {
            selectFilter = functionsMenu.buttonMenu(optionsHybrid, "Choose an option.", "Choose a filter");
            switch(selectFilter) {
                case 0:
                    for (int i = 0; i < engineList.size(); i++) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_for
                    break;
                    //////
                case 1:
                    test = functionsDataCars.createBrand("Introduce the Brand of the car.", "Brand Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (test.equals(Singleton.hybridList.get(i).getBrand())) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 2:
                    test = functionsDataCars.createModel("Introduce the Model of the car.", "Model Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (test.equals(Singleton.hybridList.get(i).getModel())) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 3:
                    seats = functionsDataCars.createSeats("Introduce the quantity of Seats of the car.", "Seats Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (seats == Singleton.hybridList.get(i).getSeats()) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 4:
                    parkingHelp = functionsDataCars.createParkingHelp("Choose if the car have Parking Help", "Parking Help Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (parkingHelp == Singleton.hybridList.get(i).getParkinghelp()) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 5:
                    doors = functionsDataCars.createDoors("Introduce the quantity of Doors of the car.", "Doors Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (doors == Singleton.hybridList.get(i).getDoors()) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 6:
                    test = functionsDataCars.createCarPlate("Introduce the Plate of the Car.", "Car Plate Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (test.equals(Singleton.hybridList.get(i).getCarPlate())) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 7:
                    test = functionsDataCars.createTypeHybrid("Choose the Type of Hybrid of the car.", "Type of Hybrid Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (test.equals(Singleton.hybridList.get(i).getTypeSecond())) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                default:
                    exit = true;
                    break;
                    //////
            }// end_switch
            if (modelList.size() > 0) {
                String[] modelButtons = modelList.toArray(new String[0]);
                select = functionsMenu.comboBoxMenu(modelButtons, "Select the car", "Select");
                if (select == -1){
                    resume = false;
                    modelList.clear();
                    posList.clear();
                }else{
                    returnedValue = posList.get(select);
                    resume = true;
                }
            }else {
                if (exit == false)
                    JOptionPane.showMessageDialog(null, "No matches.", "Error", JOptionPane.ERROR_MESSAGE);
                else {
                    returnedValue = -1;
                    resume = true;
                }
            }
            //////
        }while (resume == false);
        //////
        return returnedValue;
    }// end_searchCarElectric
    //////
    /////

    public static int searchCarCombustion(ArrayList<Combustion> engineList) { 
        ArrayList<Integer> posList = new ArrayList<Integer>();
        ArrayList<String> modelList = new ArrayList<String>();
        int select = 0, selectFilter = 0, seats = 0, doors = 0, returnedValue = 0;
        boolean parkingHelp = false, resume = false, exit = false;
		String test = "";
		String[] optionsElectric = {"Show All", "Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Type Combustion", "Back"};
        //////
        do {
            selectFilter = functionsMenu.buttonMenu(optionsElectric, "Choose an option.", "Choose a filter");
            switch(selectFilter) {
                case 0:
                    for (int i = 0; i < engineList.size(); i++) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_for
                    break;
                    //////
                case 1:
                    test = functionsDataCars.createBrand("Introduce the Brand of the car.", "Brand Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (test.equals(Singleton.combustionList.get(i).getBrand())) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 2:
                    test = functionsDataCars.createModel("Introduce the Model of the car.", "Model Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (test.equals(Singleton.combustionList.get(i).getModel())) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 3:
                    seats = functionsDataCars.createSeats("Introduce the quantity of Seats of the car.", "Seats Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (seats == Singleton.combustionList.get(i).getSeats()) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 4:
                    parkingHelp = functionsDataCars.createParkingHelp("Choose if the car have Parking Help", "Parking Help Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (parkingHelp == Singleton.combustionList.get(i).getParkinghelp()) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 5:
                    doors = functionsDataCars.createDoors("Introduce the quantity of Doors of the car.", "Doors Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (doors == Singleton.combustionList.get(i).getDoors()) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 6:
                    test = functionsDataCars.createCarPlate("Introduce the Plate of the Car.", "Car Plate Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (test.equals(Singleton.combustionList.get(i).getCarPlate())) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                case 7:
                    test = functionsDataCars.createTypeCombustion("Choose the Type of Combustion of the car.", "Type of Combustion Filter");
                    for (int i = 0; i < engineList.size(); i++) {
                        if (test.equals(Singleton.combustionList.get(i).getTypeComb())) {
                            modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                            posList.add(i);
                        }// end_if
                    }// end_for
                    break;
                    //////
                default:
                    exit = true;
                    break;
                    //////
            }// end_switch
            if (modelList.size() > 0) {
                String[] modelButtons = modelList.toArray(new String[0]);
                select = functionsMenu.comboBoxMenu(modelButtons, "Select the car", "Select");
                if (select == -1){
                        resume = false;
                        modelList.clear();
                        posList.clear();
                }else{
                        returnedValue = posList.get(select);
                        resume = true;
                    }
            }else {
                if (exit == false)
                    JOptionPane.showMessageDialog(null, "No matches.", "Error", JOptionPane.ERROR_MESSAGE);
                else {
                    returnedValue = -1;
                    resume = true;
                }
            }
            //////
        }while (resume == false);
        //////
        return returnedValue;
    }// end_searchCarElectric
    //////
    /////

}// end_functionsSearchCar