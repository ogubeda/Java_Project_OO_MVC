package Modules.Cars.Classes;
import Classes.Fecha;

public class Electric extends Cars {
	//////
	private int batery;
	//////
	
	public Electric (String brand, String model, int seats, boolean parkinghelp, int doors, String carPlate,Fecha dStart, Fecha dEnd, int batery) {
		super(brand, model, seats, parkinghelp, doors, carPlate,dStart, dEnd);
		this.batery = batery;
	}// end_construct_Electric

	public int getBatery() {
		return batery;
	}

	public void setBatery(int batery) {
		this.batery = batery;
	}

	@Override
	public String toString() {
		return "Brand: " + getBrand() + " Model: " + getModel() + "\nSeats: " + getSeats() + 
				"\nParking Help: " + getParkinghelp() + "\nDoors: " + getDoors() + "\nCar Plate: " + getCarPlate() + "\nStart date: " + getdStart() + 
				"\nFinish date: " + getdEnd() + "\nNumber of days: " + getNumDays() + "\nBatery: " + getBatery() + "\nPrice: " + getPrice();
	}

	
}// end_Electric
