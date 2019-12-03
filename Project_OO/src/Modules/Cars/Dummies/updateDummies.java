package Modules.Cars.Dummies;

import Modules.Cars.Classes.Singleton;
import Modules.Cars.Utils.functionsMenu;
import Modules.Cars.Utils.functionsSearchCar;

public class updateDummies {
    //////
    private static String[] optionsElectric = {"Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Start Day", "End Day", "battery", "Back"};
	private static String[] optionsHybrid = {"Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Start Day", "End Day", "Type Hybrid", "Back"};
	private static String[] optionsCombustion = {"Brand", "Model", "Seats", "Parking Assistence", "Doors", "Car Plate", "Start Day", "End Day", "Type Combustion", "Back"};
    public static int updateCar(int engine) {
		//////
		int select = 0, selectButton = 0, returnedValue = 0;
		//////
		/////
		select = functionsSearchCar.search(engine);
		if (engine == 0) {
			if (select >= 0) {
				selectButton = functionsMenu.buttonMenu(optionsElectric, "Choose an option to edit.", "Edit");
				//////
				switch (selectButton) {
					case 0:
						Singleton.electricList.get(select).setBrand(generateDummies.generateBrand());
						break;
						//////
					case 1:
						Singleton.electricList.get(select).setModel(generateDummies.generateModel(Singleton.electricList.get(select).getBrand()));
						break;
						//////
					case 2:
						Singleton.electricList.get(select).setSeats(generateDummies.generateSeats());
						break;
						//////
					case 3:
						Singleton.electricList.get(select).setParkinghelp(generateDummies.generateParkingHelp());
						break;
						//////
					case 4:
						Singleton.electricList.get(select).setDoors(generateDummies.generateDoors());
						break;
						//////
					case 5:
						Singleton.electricList.get(select).setCarPlate(generateDummies.generateCarPlate());
						break;
						//////
					case 6:
						Singleton.electricList.get(select).setdStart(generateDummies.modifyDateStart(Singleton.electricList.get(select).getdEndDate()));
						break;
						//////
					case 7:
						Singleton.electricList.get(select).setdEnd(generateDummies.generateDateEnd(Singleton.electricList.get(select).getdStartDate()));
						break;
						//////
					case 8:
						Singleton.electricList.get(select).setbattery(generateDummies.generateBattery());
						break;
						//////
					default:
						returnedValue = -1;
						break;
						//////
				}// end_switch
			}else
				returnedValue = -1;
		}else if (engine == 1) {
			if (select == -1)
				returnedValue = -1;
			else {
				selectButton = functionsMenu.buttonMenu(optionsHybrid, "Choose an option to edit.", "Edit");
		//////
					switch (selectButton) {
						case 0:
							Singleton.hybridList.get(select).setBrand(generateDummies.generateBrand());
							break;
							//////
						case 1:
							Singleton.hybridList.get(select).setModel(generateDummies.generateModel(Singleton.hybridList.get(select).getBrand()));
							break;
							//////
						case 2:
							Singleton.hybridList.get(select).setSeats(generateDummies.generateSeats());
							break;
							//////
						case 3:
							Singleton.hybridList.get(select).setParkinghelp(generateDummies.generateParkingHelp());
							break;
							//////
						case 4:
							Singleton.hybridList.get(select).setDoors(generateDummies.generateDoors());
							break;
							//////
						case 5:
							Singleton.electricList.get(select).setCarPlate(generateDummies.generateCarPlate());
							break;
							//////
						case 6:
							Singleton.hybridList.get(select).setdStart(generateDummies.modifyDateStart(Singleton.hybridList.get(select).getdEndDate()));
							break;
							//////
						case 7:
							Singleton.hybridList.get(select).setdEnd(generateDummies.generateDateEnd(Singleton.hybridList.get(select).getdStartDate()));
							break;
							//////
						case 8:
							Singleton.hybridList.get(select).setTypeSecond(generateDummies.generateTypeHyb());
							break;
							//////
						default:
							returnedValue = -1;
							break;
							//////
					}// end_switch
				}// end_else
		}else if (engine == 2) {
			if (select >= 0) {
			selectButton = functionsMenu.buttonMenu(optionsCombustion, "Choose an option to edit.", "Edit");
			//////
					switch (selectButton) {
						case 0:
							Singleton.combustionList.get(select).setBrand(generateDummies.generateBrand());
							break;
							//////
						case 1:
							Singleton.combustionList.get(select).setModel(generateDummies.generateModel(Singleton.combustionList.get(select).getBrand()));
							break;
							//////
						case 2:
							Singleton.combustionList.get(select).setSeats(generateDummies.generateSeats());
							break;
							//////
						case 3:
							Singleton.combustionList.get(select).setParkinghelp(generateDummies.generateParkingHelp());
							break;
							//////
						case 4:
							Singleton.combustionList.get(select).setDoors(generateDummies.generateDoors());
							break;
							//////
						case 5:
							Singleton.electricList.get(select).setCarPlate(generateDummies.generateCarPlate());
							break;
							//////
						case 6:
							Singleton.combustionList.get(select).setdStart(generateDummies.modifyDateStart(Singleton.combustionList.get(select).getdEndDate()));
							break;
							//////
						case 7:
							Singleton.combustionList.get(select).setdEnd(generateDummies.generateDateEnd(Singleton.combustionList.get(select).getdStartDate()));
							break;
							//////
						case 8:
							Singleton.combustionList.get(select).setTypeComb(generateDummies.generateTypeComb());
							break;
							//////
						default:
							returnedValue = -1;
							break;
							//////
					}// end_switch
				}else
					returnedValue = -1;
		}// end_else
		///////
		return returnedValue;
	}// end_updateCar
}