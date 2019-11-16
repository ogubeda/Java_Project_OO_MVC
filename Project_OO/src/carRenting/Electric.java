package carRenting;

public class Electric extends Cars {
	//////
	private int batery;
	//////
	
	public Electric (String brand, String model, int seats, boolean parkinghelp, int doors, Fecha dStart, Fecha dEnd, int batery) {
		super(brand, model, seats, parkinghelp, doors, dStart, dEnd);
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
		return "Brand: " + getBrand() + "\nModel: " + getModel() + "\nSeats: " + getSeats() + 
				"\nParking Help: " + getParkinghelp() + "\nDoors: " + getDoors() + "\nStart date: " + getdStart() + 
				"\nFinish date: " + getdEnd() + "\nNumber of days: " + getNumDays() + "\nBatery: " + getBatery() + "\nPrice: " + getPrice();
	}

	
}// end_Electric
