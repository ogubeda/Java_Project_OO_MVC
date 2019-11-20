package Modules.Cars.Classes;

import Classes.Fecha;

public class Combustion extends Cars {
	//////
	private String typeComb;
	//////
	
	public Combustion(String brand, String model, int seats, boolean parkinghelp, int doors, String carPlate,Fecha dStart, Fecha dEnd, String typeComb) {
		super(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd);
		this.typeComb = typeComb;
	}// end_constructor_Combustion

	public Combustion() { // Constructor vacio

	}// end_Combustion_Empty

	public Combustion(String carPlate) { // Constructor Clave Primaria
		super(carPlate);
	}// end_Combustion_PK

	public String getTypeComb() {
		return typeComb;
	}

	public void setTypeComb(String typeComb) {
		this.typeComb = typeComb;
	}
	
	@Override
	public String toString() {
		return getBrand() + " " + getModel() + "\n Seats" + getSeats() + 
				"\nParking Help: " + getParkinghelp() + "\nDoors: " + getDoors() + "\nCar Plate: " + getCarPlate() +"\nStart date: " + getdStart() + 
				"\nFinish date: " + getdEnd() + "\nNumber of days: " + getNumDays() + "\nType: " + getTypeComb() + "\nPrice: " + getPrice();
	}
}// end_Combustion
