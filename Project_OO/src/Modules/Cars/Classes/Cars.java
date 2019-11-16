package Modules.Cars.Classes;

import Classes.Fecha;

public abstract class Cars {
	//////
	private String brand;
	private String model;
	private int seats;
	private boolean parkinghelp;
	private int doors;
	private String carPlate;
	private Fecha dStart;
	private Fecha dEnd;
	private int numDays;
	private double price;
	private double disc;
	//////
	
	public Cars(String brand, String model, int seats, boolean parkinghelp, int doors, String carPlate,Fecha dStart, Fecha dEnd) {
		super();
		this.brand = brand;
		this.model = model;
		this.seats = seats;
		this.parkinghelp = parkinghelp;
		this.doors = doors;
		this.carPlate = carPlate;
		this.dStart = dStart;
		this.dEnd = dEnd;
		this.setNumDays();
		this.setPrice();
		this.setDisc();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
		this.setPrice();
	}

	public boolean getParkinghelp() {
		return parkinghelp;
	}

	public void setParkinghelp(boolean parkinghelp) {
		this.parkinghelp = parkinghelp;
		this.setPrice();
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
		this.setPrice();
	}

	public String getCarPlate() {
		return this.carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public String getdStart() {
		return dStart.dateToString();
	}
	
	public Fecha getdStartDate() {
		return dStart;
	}
	
	public Fecha getdEndDate() {
		return dEnd;
	}
	
	public void setdStart(Fecha dStart) {
		this.dStart = dStart;
		this.setNumDays();
		this.setPrice();
	}

	public String getdEnd() {
		return dEnd.dateToString();
	}

	public void setdEnd(Fecha dEnd) {
		this.dEnd = dEnd;
		this.setNumDays();
		this.setPrice();
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays() {
		this.numDays = this.dEnd.subtractDates(this.dStart);
		this.setDisc();
		this.setPrice();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice() {
		if (this.parkinghelp == true)
			this.price = (this.doors + this.seats + 50 * this.numDays / 2) * this.disc;
		else
			this.price = (this.doors + this.seats * this.numDays / 2) * this.disc;
	}

	public double getDisc() {
		return disc;
	}

	public void setDisc() {
		if (this.numDays >= 7)
			this.disc = 0.25;
		else
			this.disc = 0.1;
	}

	@Override
	public abstract String toString() ;
	
}// end_class_Cars
