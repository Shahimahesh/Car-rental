package RentalCar;

public class RentalCar {
	String Cartype;
	int rentalDays;
	double rentalRate;

	public String getCartype() {
		return Cartype;
	}

	public void setCartype(String cartype) {
		Cartype = cartype;
	}

	public int getRentalDays() {
		return rentalDays;
	}

	public void setRentalDays(int rentalDays) {
		this.rentalDays = rentalDays;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

}