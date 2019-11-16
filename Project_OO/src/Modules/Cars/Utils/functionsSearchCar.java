package Modules.Cars.Utils;

import java.util.ArrayList;
import Utils.*;
import Modules.Cars.Classes.*;

public class functionsSearchCar {
    //////
    private static ArrayList<Integer> posList = new ArrayList<Integer>();
    private static ArrayList<String> modelList = new ArrayList<String>();
    //////
    public static int searchCarElectric(ArrayList<Electric> engineList, String[] options) { 
        int select = 0, selectFilter = 0, seats = 0, doors = 0, batery = 0;
        boolean parkingHelp = false;
		String test = "";
		String[] optionsElectric = {"Show All", "Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Batery", "Back"};
		//////
		selectFilter = functionsMenu.buttonMenu(optionsElectric, "Choose an option.", "Choose a filter");
		switch(selectFilter) {
            case 0:
                noFilter(engineList);
                break;
                //////
            case 1:
                filterBrand(engineList);
                break;
                //////
            case 2:
                filterModel(engineList);
                break;
                //////
            case 3:
                filterSeats(engineList);
                break;
                //////
            case 4:
                filterParkingHelp(engineList);
                break;
                //////
            case 5:
                
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
                batery = functionsDataCars.createSeats("Introduce the capacity of the Battery of the car.", "Battery Filter");
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

    public static void noFilter(ArrayList<Electric> engineList) {
        //////
        modelList.clear();
        posList.clear();
			for (int i = 0; i < engineList.size(); i++) {
				modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
				posList.add(i);
			}// end_for
    }// end_noFilter
    //////
    /////

    public static void filterBrand(ArrayList<Electric> engineList) {
        //////
        String brand = "";
        modelList.clear();
        posList.clear();
        //////

        brand = functionsDataCars.createBrand("Introduce the Brand of the car.", "Brand Filter");
        for (int i = 0; i < engineList.size(); i++) {
            if (brand.equals(Menu.electricList.get(i).getBrand())) {
                modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                posList.add(i);
            }// end_if
        }// end_for
    }// end_filterBrand
    //////
    ////

    public static void filterModel(ArrayList<Electric> engineList) {
        //////
        String model = "";
        modelList.clear();
        posList.clear();
        //////
        /////

        model = functionsDataCars.createModel("Introduce the Model of the car.", "Model Filter");
        for (int i = 0; i < engineList.size(); i++) {
            if (model.equals(Menu.electricList.get(i).getModel())) {
                modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                posList.add(i);
            }// end_if
        }// end_for
    }// end_filterModel
    //////
    /////

    public static void filterSeats (ArrayList<Electric> engineList) {
        //////
        int seats = 0;
        modelList.clear();
        posList.clear();
        //////
        /////

        seats = functionsDataCars.createSeats("Introduce the quantity of Seats of the car.", "Seats Filter");
        for (int i = 0; i < engineList.size(); i++) {
            if (seats == Menu.electricList.get(i).getSeats()) {
                modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                posList.add(i);
            }// end_if
        }// end_for
    }// end_filterSeats
    //////
    /////

    public static void filterParkingHelp (ArrayList<Electric> engineList) {
        //////
        boolean parkingHelp = false;
        modelList.clear();
        posList.clear();
        //////
        /////

        parkingHelp = functionsDataCars.createParkingHelp("Choose if the car have Parking Help", "Parking Help Filter");
        for (int i = 0; i < engineList.size(); i++) {
            if (parkingHelp == Menu.electricList.get(i).getParkinghelp()) {
                modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                posList.add(i);
            }// end_if
        }// end_for
    }// end_filterParkingHelp
    //////
    /////

    public static void filterDoors(ArrayList<Electric> engineList) {
        //////
        int doors = 0;
        modelList.clear();
        posList.clear();
        //////
        /////
        
        doors = functionsDataCars.createDoors("Introduce the quantity of Doors of the car.", "Doors Filter");
        for (int i = 0; i < engineList.size(); i++) {
            if (doors == Menu.electricList.get(i).getDoors()) {
                modelList.add(engineList.get(i).getBrand() + " " + engineList.get(i).getModel() + " Plate: " + engineList.get(i).getCarPlate());
                posList.add(i);
            }// end_if
        }// end_for
    }// end_filterDoors
    //////
    /////

}// end_functionsSearchCar