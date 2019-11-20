package Modules.Cars.Classes;
import Classes.Fecha;

public class Electric extends Cars {
	//////
	private int battery;
	//////
	
	public Electric (String brand, String model, int seats, boolean parkinghelp, int doors, String carPlate,Fecha dStart, Fecha dEnd, int battery) {
		super(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd);
		this.battery = battery;
	}// end_construct_Electric

	public Electric() { // Contructor vacio 

	}// end_Electric_Empty

	public Electric (String carPlate) { // Constructor Clave Primaria
		super(carPlate);
	}// end_Electric_PK

	public int getbattery() {
		return battery;
	}

	public void setbattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return getBrand() + " " + getModel() + "\nSeats: " + getSeats() + 
				"\nParking Help: " + getParkinghelp() + "\nDoors: " + getDoors() + "\nCar Plate: " + getCarPlate() + "\nStart date: " + getdStart() + 
				"\nFinish date: " + getdEnd() + "\nNumber of days: " + getNumDays() + "\nBattery: " + getbattery() + "\nPrice: " + getPrice();
	}

	
}// end_Electric
