package Modules.Cars.Classes;

import Classes.Fecha;

public class Combustion extends Cars {
	//////
	private String typeComb;
	//////
	
	public Combustion(String brand, String model, int seats, boolean parkinghelp, int doors, Fecha dStart, Fecha dEnd, String typeComb) {
		super(brand, model, seats, parkinghelp, doors, dStart, dEnd);
		this.typeComb = typeComb;
	}// end_constructor_Combustion

	public String getTypeComb() {
		return typeComb;
	}

	public void setTypeComb(String typeComb) {
		this.typeComb = typeComb;
	}
	
	@Override
	public String toString() {
		return "Brand: " + getBrand() + "\nModel: " + getModel() + "\n Seats" + getSeats() + 
				"\nParking Help: " + getParkinghelp() + "\nDoors: " + getDoors() + "\nStart date: " + getdStart() + 
				"\nFinish date: " + getdEnd() + "\nNumber of days: " + getNumDays() + "\nType: " + getTypeComb() + "\nPrice: " + getPrice();
	}
}// end_Combustion
