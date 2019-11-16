package carRenting;

public class Hybrid extends Cars {
	//////
	private String typeSecond;
	//////
	
	public Hybrid(String brand, String model, int seats, boolean parkinghelp, int doors, Fecha dStart, Fecha dEnd, String typeSecond) {
		super(brand, model, seats, parkinghelp, doors, dStart, dEnd);
		this.typeSecond = typeSecond;
	}// end_constructor_Hybrid

	public String getTypeSecond() {
		return typeSecond;
	}

	public void setTypeSecond(String typeSecond) {
		this.typeSecond = typeSecond;
	}

	@Override
	public String toString() {
		return "Brand: " + getBrand() + "\nModel: " + getModel() + "\nSeats: " + getSeats() + 
				"\nParking Help: " + getParkinghelp() + "\nDoors: " + getDoors() + "\nStart date: " + getdStart() + 
				"\nFinish date: " + getdEnd() + "\nNumber of days: " + getNumDays() + "\nType: " + getTypeSecond() + "\nPrice: " + getPrice();
	}
	
}// end_Hybrid
