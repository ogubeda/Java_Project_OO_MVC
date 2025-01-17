package Modules.Cars.Utils;

import Modules.Cars.Classes.*;
import Utils.*;
import Classes.*;

public class functionsCars_crud {
	//////
	private static String[] optionsElectric = {"Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Start Day", "End Day", "battery", "Back"};
	private static String[] optionsHybrid = {"Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Start Day", "End Day", "Type Hybrid", "Back"};
	private static String[] optionsCombustion = {"Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Start Day", "End Day", "Type Combustion", "Back"};
	//////
	public static void createCar(int engine) {
		Electric carElectric = null;
		Hybrid carHybrid = null;
		Combustion carCombustion = null;
		Fecha dStart = null, dEnd = null;
		//////
		String brand = "", model = "", typeHybrid = "", typeComb = "", carPlate = "";
		int seats = 0, doors = 0, battery = 0;
		boolean parkinghelp = false;
		//////
		/////
		
		brand = functionsDataCars.createBrand("Introduce the Brand of the car.", "Introduce the Brand");
		model = functionsDataCars.createModel("Introduce the Model of the car.", "Introduce the Model");
		seats = functionsDataCars.createSeats("Introduce the quantity of Seats of the car.", "Introduce the Seats");
		parkinghelp = functionsDataCars.createParkingHelp("Does the car have Parking Help?", "Select the Parking Help");
		doors = functionsDataCars.createDoors("Introduce the quantity of Doors of the car.", "Introduce the Doors");
		carPlate = functionsDataCars.createCarPlate("Introduce the Plate of the Car", "Introduce the Car Plate");
		dStart = functionsDate_crud.createSDate("What day you want to start the rent?\nFormat: yyyy/mm/dd", "Introduce the Start Day");
		dEnd = functionsDate_crud.createEDate("What day you want to return the car?\nFormat: yyyy/mm/dd", "Introduce the End Day", dStart);
		///////
		if (engine == 0) {
			battery = functionsDataCars.createbattery("Introduce the capacity of the battery of the car.", "Introduce the battery");
			carElectric = new Electric(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd, battery);
			Singleton.electricList.add(carElectric);
		}else if (engine == 1) {
			typeHybrid = functionsDataCars.createTypeHybrid("Choose the type for the Hybrid Engine.", "Select the Hybrid Engine");
			carHybrid = new Hybrid(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd, typeHybrid);
			Singleton.hybridList.add(carHybrid);
		}else if (engine == 2) {
			typeComb = functionsDataCars.createTypeCombustion("Choose the type for the Combustion Engine.", "Select the Combustion Engine");
			carCombustion = new Combustion(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd, typeComb);
			Singleton.combustionList.add(carCombustion);
		}// end_if
		///////
	}// end_createCar
	//////
	/////
	
	public static String readCar(int engine) {
		//////
		int select = 0;
		//////
		/////

		select = functionsSearchCar.search(engine);
		//////
		if (engine == 0) {
			if (select != -1)
				return Singleton.electricList.get(select).toString();
			//////
		}else if (engine == 1) {
			if (select != -1)
				return Singleton.hybridList.get(select).toString();
			//////
		}else if (engine == 2) {
			if (select != -1)
				return Singleton.combustionList.get(select).toString();
		}// end_else
		//////
		return null;
	}// end_readCar
	//////
	/////
	
	public static int updateCar(int engine) {
		//////
		int select = 0, selectButton = 0, returnedValue = 0;
		//////
		/////

		select = functionsSearchCar.search(engine);
		if (engine == 0) {
			if (select == -1)
				returnedValue = -1;
			else {
				selectButton = functionsMenu.buttonMenu(optionsElectric, "Choose an option to edit.", "Edit");
				//////
				switch (selectButton) {
					case 0:
						Singleton.electricList.get(select).setBrand(functionsDataCars.createBrand("Introduce the new Brand of the car.", "Introduce the Brand"));
						break;
						//////
					case 1:
						Singleton.electricList.get(select).setModel(functionsDataCars.createModel("Introduce the new Model of the car.", "Introduce the Model"));
						break;
						//////
					case 2:
						Singleton.electricList.get(select).setSeats(functionsDataCars.createSeats("Introduce  the new quantity of Seats of the car.", "Introduce the Seats"));
						break;
						//////
					case 3:
						Singleton.electricList.get(select).setParkinghelp(functionsDataCars.createParkingHelp("Choose the new option", "Choose the Parking Help"));
						break;
						//////
					case 4:
						Singleton.electricList.get(select).setDoors(functionsDataCars.createDoors("Introduce the new quantity of Doors of the car.", "Introduce the Doors"));
						break;
						//////
					case 5:
						Singleton.electricList.get(select).setCarPlate(functionsDataCars.createCarPlate("Introduce the new Plate of the Car.", "Introduce the Car Plate"));
						break;
						//////
					case 6:
						Singleton.electricList.get(select).setdStart(functionsDate_crud.modifySDate("Introduce the new Start Day for the renting.\nFormat: yyyy/mm/dd", "Introduce the Start Day", Singleton.electricList.get(select).getdEndDate()));
						break;
						//////
					case 7:
						Singleton.electricList.get(select).setdEnd(functionsDate_crud.createEDate("Introduce the new End Day for the renting.\nFormat: yyyy/mm/dd", "Introduce the End Day", Singleton.electricList.get(select).getdStartDate()));
						break;
						//////
					case 8:
						Singleton.electricList.get(select).setbattery(functionsDataCars.createbattery("Introduce the new capacity for the battery.", "Introduce the battery"));
						break;
						//////
					default:
						returnedValue = -1;
						break;
						//////
				}// end_switch
			}
		}else if (engine == 1) {
			if (select == -1)
				returnedValue = -1;
			else {
			selectButton = functionsMenu.buttonMenu(optionsHybrid, "Choose an option to edit.", "Edit");
		//////
					switch (selectButton) {
						case 0:
							Singleton.hybridList.get(select).setBrand(functionsDataCars.createBrand("Introduce the new Brand of the car.", "Introduce the Brand"));
							break;
							//////
						case 1:
							Singleton.hybridList.get(select).setModel(functionsDataCars.createModel("Introduce the new Model of the car.", "Introduce the Model"));
							break;
							//////
						case 2:
							Singleton.hybridList.get(select).setSeats(functionsDataCars.createSeats("Introduce  the new quantity of Seats of the car.", "Introduce the Seats"));
							break;
							//////
						case 3:
							Singleton.hybridList.get(select).setParkinghelp(functionsDataCars.createParkingHelp("Choose the new option", "Choose the Parking Help"));
							break;
							//////
						case 4:
							Singleton.hybridList.get(select).setDoors(functionsDataCars.createDoors("Introduce the new quantity of Doors of the car.", "Introduce the Doors"));
							break;
							//////
						case 5:
							Singleton.electricList.get(select).setCarPlate(functionsDataCars.createCarPlate("Introduce the new Plate of the Car.", "Introduce the Car Plate"));
							break;
							//////
						case 6:
							Singleton.hybridList.get(select).setdStart(functionsDate_crud.modifySDate("Introduce the new Start Day for the renting.\nFormat: yyyy/mm/dd", "Introduce the Start Day", Singleton.hybridList.get(select).getdEndDate()));
							break;
							//////
						case 7:
							Singleton.hybridList.get(select).setdEnd(functionsDate_crud.createEDate("Introduce the new End Day for the renting.\nFormat: yyyy/mm/dd", "Introduce the End Day", Singleton.hybridList.get(select).getdStartDate()));
							break;
							//////
						case 8:
							Singleton.hybridList.get(select).setTypeSecond(functionsDataCars.createTypeHybrid("Choose the new type of the Hybrid Engine.", "Choose the Hybrid Engine"));
							break;
							//////
						default:
							returnedValue = -1;
							break;
							//////
					}// end_switch
				}// end_else
		}else if (engine == 2) {
			if (select == -1)
				returnedValue = -1;
			else {
				selectButton = functionsMenu.buttonMenu(optionsCombustion, "Choose an option to edit.", "Edit");
				//////
					switch (selectButton) {
						case 0:
							Singleton.combustionList.get(select).setBrand(functionsDataCars.createBrand("Introduce the new Brand of the car.", "Introduce the Brand"));
							break;
							//////
						case 1:
							Singleton.combustionList.get(select).setModel(functionsDataCars.createModel("Introduce the new Model of the car.", "Introduce the Model"));
							break;
							//////
						case 2:
							Singleton.combustionList.get(select).setSeats(functionsDataCars.createSeats("Introduce  the new quantity of Seats of the car.", "Introduce the Seats"));
							break;
							//////
						case 3:
							Singleton.combustionList.get(select).setParkinghelp(functionsDataCars.createParkingHelp("Choose the new option", "Choose the Parking Help"));
							break;
							//////
						case 4:
							Singleton.combustionList.get(select).setDoors(functionsDataCars.createDoors("Introduce the new quantity of Doors of the car.", "Introduce the Doors"));
							break;
							//////
						case 5:
							Singleton.electricList.get(select).setCarPlate(functionsDataCars.createCarPlate("Introduce the new Plate of the Car.", "Introduce the Car Plate"));
							break;
							//////
						case 6:
							Singleton.combustionList.get(select).setdStart(
									functionsDate_crud.modifySDate("Introduce the new Start Day for the renting.\nFormat: yyyy/mm/dd", 
											"Introduce the Start Day", Singleton.combustionList.get(select).getdEndDate()));
							break;
							//////
						case 7:
							Singleton.combustionList.get(select).setdEnd(
									functionsDate_crud.createEDate("Introduce the new End Day for the renting.\nFormat: yyyy/mm/dd", 
											"Introduce the End Day", Singleton.combustionList.get(select).getdStartDate()));
							break;
							//////
						case 8:
							Singleton.combustionList.get(select).setTypeComb(functionsDataCars.createTypeCombustion("Choose the new Type of the Combustion Engine", "Choose the Type of Combustion"));
							break;
							//////
						default:
							returnedValue = -1;
							break;
							//////
					}// end_switch
				}
		}// end_else
		///////
		return returnedValue;
	}// end_updateCar
	//////
	/////
	
	public static int deleteCar(int engine) {
		//////
		int select = 0;
		//////
		/////

		select = functionsSearchCar.search(engine);
		if (engine == 0) {
			if (select != -1)
				Singleton.electricList.remove(select).toString();
			//////
		}else if (engine == 1) {
			if (select != -1)
				Singleton.hybridList.remove(select).toString();
			//////
		}else if (engine == 2) {
			if (select != -1)
				Singleton.combustionList.remove(select).toString();
		}else
			select = -1;
		return select;
	}// end_deleteCar
	//////
	/////
	
}// end_functionsCars_crud