package Modules.Cars.Utils;

import Modules.Cars.Classes.*;
import Utils.*;
import Classes.*;
import javax.swing.JOptionPane;

public class functionsCars_crud {
	//////
	private String[] optionsElectric = {"Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Start Day", "End Day", "Batery", "Back"};
	private String[] optionsHybrid = {"Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Start Day", "End Day", "Type Hybrid", "Back"};
	private String[] optionsCombustion = {"Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Start Day", "End Day", "Type Combustion", "Back"};
	private String[] options = {"Continue", "Back"};
	//////
	public void createCar(int engine) {
		Electric carElectric = null;
		Hybrid carHybrid = null;
		Combustion carCombustion = null;
		Fecha dStart = null, dEnd = null;
		//////
		String brand = "", model = "", typeHybrid = "", typeComb = "", carPlate = "";
		int seats = 0, doors = 0, batery = 0;
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
			batery = functionsDataCars.createBatery("Introduce the capacity of the Batery of the car.", "Introduce the Batery");
			carElectric = new Electric(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd, batery);
			Menu.electricList.add(carElectric);
		}else if (engine == 1) {
			typeHybrid = functionsDataCars.createTypeHybrid("Choose the type for the Hybrid Engine.", "Select the Hybrid Engine");
			carHybrid = new Hybrid(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd, typeHybrid);
			Menu.hybridList.add(carHybrid);
		}else if (engine == 2) {
			typeComb = functionsDataCars.createTypeCombustion("Choose the type for the Combustion Engine.", "Select the Combustion Engine");
			carCombustion = new Combustion(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd, typeComb);
			Menu.combustionList.add(carCombustion);
		}// end_if
		///////
	}// end_createCar
	//////
	/////
	
	public String readCar(int engine) {
		//////
		String cad = "";
		String[] options = {"Continue"};
		//////
		/////
		
		if (engine == 0) {
			cad = Menu.electricList.get(functionsSearchCar.searchCarElectric(Menu.electricList, options)).toString();
			//////
		}else if (engine == 1) {
			cad = Menu.hybridList.get(functionsSearchCar.searchCarHybrid(Menu.hybridList, options)).toString();
			//////
		}else if (engine == 2) {
			cad = Menu.combustionList.get(functionsSearchCar.searchCarCombustion(Menu.combustionList, options)).toString();
		}// end_else
		//////
		return cad;
	}// end_readCar
	//////
	/////
	
	public void updateCar(int engine) {
		//////
		int select = 0, selectButton = 0;
		//////
		/////
		
		if (engine == 0) {
			select = functionsSearchCar.searchCarElectric(Menu.electricList, options);
			selectButton = functionsMenu.buttonMenu(optionsElectric, "Choose an option to edit.", "Edit");
			//////
			switch (selectButton) {
				case 0:
					Menu.electricList.get(select).setBrand(functionsDataCars.createBrand("Introduce the new Brand of the car.", "Introduce the Brand"));
					break;
					//////
				case 1:
					Menu.electricList.get(select).setModel(functionsDataCars.createModel("Introduce the new Model of the car.", "Introduce the Model"));
					break;
					//////
				case 2:
					Menu.electricList.get(select).setSeats(functionsDataCars.createSeats("Introduce  the new quantity of Seats of the car.", "Introduce the Seats"));
					break;
					//////
				case 3:
					Menu.electricList.get(select).setParkinghelp(functionsDataCars.createParkingHelp("Choose the new option", "Choose the Parking Help"));
					break;
					//////
				case 4:
					Menu.electricList.get(select).setDoors(functionsDataCars.createDoors("Introduce the new quantity of Doors of the car.", "Introduce the Doors"));
					break;
					//////
				case 5:
					Menu.electricList.get(select).setCarPlate(functionsDataCars.createCarPlate("Introduce the new Plate of the Car.", "Introduce the Car Plate"));
					break;
					//////
				case 6:
					Menu.electricList.get(select).setdStart(functionsDate_crud.modifySDate("Introduce the new Start Day for the renting.\nFormat: yyyy/mm/dd", "Introduce the Start Day", Menu.electricList.get(select).getdEndDate()));
					break;
					//////
				case 7:
					Menu.electricList.get(select).setdEnd(functionsDate_crud.createEDate("Introduce the new End Day for the renting.\nFormat: yyyy/mm/dd", "Introduce the End Day", Menu.electricList.get(select).getdStartDate()));
					break;
					//////
				case 8:
					Menu.electricList.get(select).setBatery(functionsDataCars.createBatery("Introduce the new capacity for the Batery.", "Introduce the Batery"));
					break;
					//////
				default:
					break;
					//////
			}// end_switch
		}else if (engine == 1) {
			select = functionsSearchCar.searchCarHybrid(Menu.hybridList, options);
			selectButton = functionsMenu.buttonMenu(optionsHybrid, "Choose an option to edit.", "Edit");
		//////
					switch (selectButton) {
						case 0:
							Menu.hybridList.get(select).setBrand(functionsDataCars.createBrand("Introduce the new Brand of the car.", "Introduce the Brand"));
							break;
							//////
						case 1:
							Menu.hybridList.get(select).setModel(functionsDataCars.createModel("Introduce the new Model of the car.", "Introduce the Model"));
							break;
							//////
						case 2:
							Menu.hybridList.get(select).setSeats(functionsDataCars.createSeats("Introduce  the new quantity of Seats of the car.", "Introduce the Seats"));
							break;
							//////
						case 3:
							Menu.hybridList.get(select).setParkinghelp(functionsDataCars.createParkingHelp("Choose the new option", "Choose the Parking Help"));
							break;
							//////
						case 4:
							Menu.hybridList.get(select).setDoors(functionsDataCars.createDoors("Introduce the new quantity of Doors of the car.", "Introduce the Doors"));
							break;
							//////
						case 5:
							Menu.electricList.get(select).setCarPlate(functionsDataCars.createCarPlate("Introduce the new Plate of the Car.", "Introduce the Car Plate"));
							break;
							//////
						case 6:
							Menu.hybridList.get(select).setdStart(functionsDate_crud.modifySDate("Introduce the new Start Day for the renting.\nFormat: yyyy/mm/dd", "Introduce the Start Day", Menu.hybridList.get(select).getdEndDate()));
							break;
							//////
						case 7:
							Menu.hybridList.get(select).setdEnd(functionsDate_crud.createEDate("Introduce the new End Day for the renting.\nFormat: yyyy/mm/dd", "Introduce the End Day", Menu.hybridList.get(select).getdStartDate()));
							break;
							//////
						case 8:
							Menu.hybridList.get(select).setTypeSecond(functionsDataCars.createTypeHybrid("Choose the new type of the Hybrid Engine.", "Choose the Hybrid Engine"));
							break;
							//////
						default:
							break;
							//////
					}// end_switch
		}else if (engine == 2) {
			select = functionsSearchCar.searchCarCombustion(Menu.combustionList, options);
			selectButton = functionsMenu.buttonMenu(optionsCombustion, "Choose an option to edit.", "Edit");
		//////
					switch (selectButton) {
						case 0:
							Menu.combustionList.get(select).setBrand(functionsDataCars.createBrand("Introduce the new Brand of the car.", "Introduce the Brand"));
							break;
							//////
						case 1:
							Menu.combustionList.get(select).setModel(functionsDataCars.createModel("Introduce the new Model of the car.", "Introduce the Model"));
							break;
							//////
						case 2:
							Menu.combustionList.get(select).setSeats(functionsDataCars.createSeats("Introduce  the new quantity of Seats of the car.", "Introduce the Seats"));
							break;
							//////
						case 3:
							Menu.combustionList.get(select).setParkinghelp(functionsDataCars.createParkingHelp("Choose the new option", "Choose the Parking Help"));
							break;
							//////
						case 4:
							Menu.combustionList.get(select).setDoors(functionsDataCars.createDoors("Introduce the new quantity of Doors of the car.", "Introduce the Doors"));
							break;
							//////
						case 5:
							Menu.electricList.get(select).setCarPlate(functionsDataCars.createCarPlate("Introduce the new Plate of the Car.", "Introduce the Car Plate"));
							break;
							//////
						case 6:
							Menu.combustionList.get(select).setdStart(
									functionsDate_crud.modifySDate("Introduce the new Start Day for the renting.\nFormat: yyyy/mm/dd", 
											"Introduce the Start Day", Menu.combustionList.get(select).getdEndDate()));
							break;
							//////
						case 7:
							Menu.combustionList.get(select).setdEnd(
									functionsDate_crud.createEDate("Introduce the new End Day for the renting.\nFormat: yyyy/mm/dd", 
											"Introduce the End Day", Menu.combustionList.get(select).getdStartDate()));
							break;
							//////
						case 8:
							Menu.combustionList.get(select).setTypeComb(functionsDataCars.createTypeCombustion("Choose the new Type of the Combustion Engine", "Choose the Type of Combustion"));
							break;
							//////
						default:
							break;
							//////
					}// end_switch
		}// end_else
		///////
	}// end_updateCar
	//////
	/////
	
	public void deleteCar(int engine) {
		String[] options = {"Continue", "Back"};
		int select = 0;
		//////
		/////
		
		if (engine == 0) {
			select = functionsSearchCar.searchCarElectric(Menu.electricList, options);
			if (select == -2)
				JOptionPane.showMessageDialog(null, "Going back.", "Back", JOptionPane.INFORMATION_MESSAGE);
			else
				Menu.electricList.remove(select).toString();
			//////
		}else if (engine == 1) {
			select = functionsSearchCar.searchCarHybrid(Menu.hybridList, options);
			if (select == -2)
				JOptionPane.showMessageDialog(null, "Going back.", "Back", JOptionPane.INFORMATION_MESSAGE);
			else
				Menu.hybridList.remove(select).toString();
			//////
		}else if (engine == 2) {
			select = functionsSearchCar.searchCarCombustion(Menu.combustionList, options);
			if (select == -2)
				JOptionPane.showMessageDialog(null, "Going back", "Back", JOptionPane.INFORMATION_MESSAGE);
			else
				Menu.combustionList.remove(select).toString();
		}// end_else
	}// end_deleteCar
	//////
	/////
	
}// end_functionsCars_crud