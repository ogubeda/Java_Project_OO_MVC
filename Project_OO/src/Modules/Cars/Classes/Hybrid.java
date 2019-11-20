package Modules.Cars.Classes;

import Classes.Fecha;

public class Hybrid extends Cars {
	//////
	private String typeSecond;
	//////
	
	public Hybrid(String brand, String model, int seats, boolean parkinghelp, int doors, String carPlate,Fecha dStart, Fecha dEnd, String typeSecond) {
		super(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd);
		this.typeSecond = typeSecond;
	}// end_constructor_Hybrid

	public Hybrid() { // Constructor vacio
	}// end_Hybrid_Empty

	public Hybrid(String carPlate) { // Constructor Clave Primaria
		super(carPlate);
	}// end_Hybrid_PK

	public String getTypeSecond() {
		return typeSecond;
	}

	public void setTypeSecond(String typeSecond) {
		this.typeSecond = typeSecond;
	}

	@Override
	public String toString() {
		return getBrand() + " " + getModel() + "\nSeats: " + getSeats() + 
				"\nParking Help: " + getParkinghelp() + "\nDoors: " + getDoors() + "\nCar Plate: " + getCarPlate() + "\nStart date: " + getdStart() + 
				"\nFinish date: " + getdEnd() + "\nNumber of days: " + getNumDays() + "\nType: " + getTypeSecond() + "\nPrice: " + getPrice();
	}
	
}// end_Hybrid
