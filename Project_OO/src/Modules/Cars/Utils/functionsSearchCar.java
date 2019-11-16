package Modules.Cars.Utils;

import java.util.ArrayList;
import Utils.*;
import Modules.Cars.Classes.*;

public class functionsSearchCar {
    //////
    public static int searchCarElectric(ArrayList<Electric> engineList, String[] options) { 
        ArrayList<Integer> posList = new ArrayList<Integer>();
        ArrayList<String> modelList = new ArrayList<String>();
        int select = 0, selectFilter = 0, seats = 0, doors = 0, batery = 0;
        boolean parkingHelp = false;
		String test = "";
		String[] optionsElectric = {"Show All", "Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Batery", "Back"};
		//////
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
                    if (test.equals(Menu.electricList.get(i).getModel())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 2:
                test = functionsDataCars.createModel("Introduce the Model of the car.", "Model Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (test.equals(Menu.electricList.get(i).getModel())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 3:
                seats = functionsDataCars.createSeats("Introduce the quantity of Seats of the car.", "Seats Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (seats == Menu.electricList.get(i).getSeats()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 4:
                parkingHelp = functionsDataCars.createParkingHelp("Choose if the car have Parking Help", "Parking Help Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (parkingHelp == Menu.electricList.get(i).getParkinghelp()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 5:
                doors = functionsDataCars.createDoors("Introduce the quantity of Doors of the car.", "Doors Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (doors == Menu.electricList.get(i).getDoors()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 6:
                test = functionsDataCars.createCarPlate("Introduce the Plate of the Car.", "Car Plate Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (test.equals(Menu.electricList.get(i).getCarPlate())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 7:
                batery = functionsDataCars.createBatery("Introduce the capacity of the Battery of the car.", "Battery Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (batery == Menu.electricList.get(i).getBatery()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
		}// end_switch
		String[] modelButtons = modelList.toArray(new String[0]);
		select = functionsMenu.comboBoxMenu(modelButtons, "Select the car", "Select", options);
		//////
        return posList.get(select);
    }// end_searchCarElectric
    //////
    /////

    public static int searchCarHybrid(ArrayList<Hybrid> engineList, String[] options) { 
        ArrayList<Integer> posList = new ArrayList<Integer>();
        ArrayList<String> modelList = new ArrayList<String>();
        int select = 0, selectFilter = 0, seats = 0, doors = 0;
        boolean parkingHelp = false;
		String test = "";
		String[] optionsHybrid = {"Show All", "Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Type of Hybrid", "Back"};
		//////
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
                    if (test.equals(Menu.hybridList.get(i).getModel())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 2:
                test = functionsDataCars.createModel("Introduce the Model of the car.", "Model Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (test.equals(Menu.hybridList.get(i).getModel())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 3:
                seats = functionsDataCars.createSeats("Introduce the quantity of Seats of the car.", "Seats Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (seats == Menu.hybridList.get(i).getSeats()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 4:
                parkingHelp = functionsDataCars.createParkingHelp("Choose if the car have Parking Help", "Parking Help Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (parkingHelp == Menu.hybridList.get(i).getParkinghelp()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 5:
                doors = functionsDataCars.createDoors("Introduce the quantity of Doors of the car.", "Doors Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (doors == Menu.hybridList.get(i).getDoors()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 6:
                test = functionsDataCars.createCarPlate("Introduce the Plate of the Car.", "Car Plate Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (test.equals(Menu.hybridList.get(i).getCarPlate())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 7:
                test = functionsDataCars.createTypeHybrid("Choose the Type of Hybrid of the car.", "Type of Hybrid Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (test.equals(Menu.hybridList.get(i).getTypeSecond())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
		}// end_switch
		String[] modelButtons = modelList.toArray(new String[0]);
		select = functionsMenu.comboBoxMenu(modelButtons, "Select the car", "Select", options);
		//////
        return posList.get(select);
    }// end_searchCarElectric
    //////
    /////

    public static int searchCarCombustion(ArrayList<Combustion> engineList, String[] options) { 
        ArrayList<Integer> posList = new ArrayList<Integer>();
        ArrayList<String> modelList = new ArrayList<String>();
        int select = 0, selectFilter = 0, seats = 0, doors = 0;
        boolean parkingHelp = false;
		String test = "";
		String[] optionsElectric = {"Show All", "Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Type Combustion", "Back"};
		//////
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
                    if (test.equals(Menu.combustionList.get(i).getModel())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 2:
                test = functionsDataCars.createModel("Introduce the Model of the car.", "Model Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (test.equals(Menu.combustionList.get(i).getModel())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 3:
                seats = functionsDataCars.createSeats("Introduce the quantity of Seats of the car.", "Seats Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (seats == Menu.combustionList.get(i).getSeats()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 4:
                parkingHelp = functionsDataCars.createParkingHelp("Choose if the car have Parking Help", "Parking Help Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (parkingHelp == Menu.combustionList.get(i).getParkinghelp()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 5:
                doors = functionsDataCars.createDoors("Introduce the quantity of Doors of the car.", "Doors Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (doors == Menu.combustionList.get(i).getDoors()) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 6:
                test = functionsDataCars.createCarPlate("Introduce the Plate of the Car.", "Car Plate Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (test.equals(Menu.combustionList.get(i).getCarPlate())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
            case 7:
                test = functionsDataCars.createTypeCombustion("Choose the Type of Combustion of the car.", "Type of Combustion Filter");
                for (int i = 0; i < engineList.size(); i++) {
                    if (test.equals(Menu.combustionList.get(i).getTypeComb())) {
                        modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                        posList.add(i);
                    }// end_if
                }// end_for
                break;
                //////
		}// end_switch
		String[] modelButtons = modelList.toArray(new String[0]);
		select = functionsMenu.comboBoxMenu(modelButtons, "Select the car", "Select", options);
		//////
        return posList.get(select);
    }// end_searchCarElectric
    //////
    /////

}// end_functionsSearchCar