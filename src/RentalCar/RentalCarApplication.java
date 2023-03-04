package RentalCar;

import java.util.Scanner;

public class RentalCarApplication {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the rental car home page");

		System.out.println("Car types:");
		System.out.println("1. Toyata (250/day)");
		System.out.println("2. Honda (300/day)");
		System.out.println("3. Lexus (400/day)");
		System.out.println("4. BMW (500/day)");
		System.out.println("5. Charvlet (600/day)");

		System.out.print("Enter car type(1-5):");
		

		int carType = input.nextInt();

		System.out.print("Enter rental period (in days): ");
		int rentalPeriod = input.nextInt();

		double rentalRate;
		switch (carType) {
		case 1:
			rentalRate = 250.0;
			break;
		case 2:
			rentalRate = 300.0;
			break;
		case 3:
			rentalRate = 350.0;
			break;
		case 4:
			rentalRate = 400.0;
			break;
		case 5:
			rentalRate = 100.0;
			break;
		default:
			rentalRate = 0.0;
			break;
		}
		double totalCost = rentalRate * rentalPeriod;

		System.out.println("Rental Details:");
		System.out.println("Car Type: " + carType);
		System.out.println("Rental Period: " + rentalPeriod + " days");
		System.out.println("Rental Rate: $" + rentalRate + " per day");
		System.out.println("Total Cost: $" + "totalCost" );

	}
}
