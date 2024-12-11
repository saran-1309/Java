 package AllProgram;

import java.util.Scanner;

class Vehicle{
	enum brands{Volkswagan,BMW,Honda,Toyota,Mahindra,Tata,Yamaha,KTM,Triumph}
	void display(){
		System.out.println("Car or Truck");
		Scanner scan = new Scanner(System.in);
		String Inp=scan.nextLine();
		if(Inp.contentEquals("Car")) {
			Car c = new Car();
			c.cars();
		}
		if(Inp.contentEquals("Truck")) {
			Truck t = new Truck();
			t.truck();
		}	
		if(Inp.contentEquals("Truck")) {
			Motorcycle b = new Motorcycle();
			b.bike();
		}	
	}
}
c  lass Car extends Vehicle{
	enum carbrands{}
	void cars() {
		System.out.println("Enter a Brand on the list : Volkswagan,BMW,Honda");
		Scanner Cbrand = new Scanner(System.in);
		String cbrand= Cbrand.nextLine();
		brands var = brands.valueOf(cbrand);
		switch(var) {
		case Volkswagan:
			System.out.println("volkswagan Polo GT TSI");
			System.out.println("Model: 2022 Volkswagen Polo\r\n"
					+ "Cargo volume: 280 L\r\n"
					+ "Engine cylinder configuration: Straight engine\r\n"
					+ "Dimensions: 3,971 mm L x 1,682 mm W x 1,469 mm H\r\n"
					+ "Number of doors: 5\r\n"
					+ "Driveline: Front-wheel drive\r\n"
					+ "Engine: 1.0 L 3-cylinder\r\n"
					+ "Fuel economy: 17 km/l combined");
			break;
		case BMW:
			System.out.println("BMW M3");
			System.out.println("Fuel Type Petrol\r\n"
			+"Engine Displacement 2998 cc\n"
			+ "No. of Cylinders6Max Power502.88BhpMax Torque850Nm\n"
			+ "Seating Capacity5\n"
			+ "Transmission TypeAutomatic\n"
			+ "Body TypeCoupe");
			break;
		case Honda:
			System.out.println("Honda Civic");
			System.out.println("Body style: Sedan\r\n"
					+ "Cargo volume: 430 L\r\n"
					+ "Engine cylinder configuration: Straight engine\r\n"
					+ "Dimensions: 4,656 mm L x 1,799 mm W x 1,433 mm H\r\n"
					+ "Number of doors: 4\r\n"
					+ "Driveline: Front-wheel drive");
			break;
		}
		
	}
}
	class Truck extends Vehicle{
		void truck() {
			System.out.println("Enter a Brand on the list : Toyota,Mahindra,Tata");
			Scanner Tbrand = new Scanner(System.in);
			String tbrand= Tbrand.nextLine();
			brands tvar = brands.valueOf(tbrand);
			switch(tvar) {
			case Toyota:
				System.out.println("Toyota Hilux");
				System.out.println("Toyota Hilux specs & features\n"
				+"Engine, 2755 cc.\n"
				+"Power, 201.15 bhp.\n "
				+ "Transmission, Manual / Automatic.\n "
				+ "Mileage, 10 kmpl. Fuel, Diesel.\n "
				+ "Seating Capacity, 5\n");
				break;
			case Mahindra:
				System.out.println(" Mahindra Bolero Neo+");
				System.out.println("Body style: Sport Utility Vehicle\r\n"
						+ "Engine cylinder configuration: Straight engine\r\n"
						+ "Dimensions: 4,400 mm L x 1,795 mm W x 1,812 mm H\r\n"
						+ "Number of doors: 5\r\n"
						+ "Driveline: Rear-wheel drive\r\n" 
						+ "Engine: 2.2 L 4-cylinder diesel");
				break;
			case Tata:
				System.out.println("Tata ACE Gold");
				System.out.println("Key Specifications of Tata Ace gold\n "
						+"Power, 24 hp \n; "
						+ "GVW, 1510 kg ;\n "
						+ "Mileage, 15 kmpl ;\n "
						+ "Engine, 694 cc ;\n "
						+ "Fuel Tank, 26 Ltr.\n");
				break;
		}		
	}
}
	class Motorcycle extends Vehicle{
		void bike() {
			System.out.println("Enter a Brand on the list : Yamaha,KTM,Triumph");
			Scanner Bbrand = new Scanner(System.in);
			String bbrand= Bbrand.nextLine();
			brands tvar = brands.valueOf(bbrand);
			switch(tvar) {
			case Yamaha:
				System.out.println("MT-15");
				System.out.println("MT-15 specs & features\n"
				+"Engine, 2755 cc.\n"
				+"Power, 201.15 bhp.\n "
				+ "Transmission, Manual / Automatic.\n "
				+ "Mileage, 10 kmpl. Fuel, Diesel.\n "
				+ "Seating Capacity, 5\n");
				break;
			case KTM:
				System.out.println("Duke 200");
				System.out.println("Body style: Sport Utility Vehicle\r\n"
						+ "Engine cylinder configuration: Straight engine\r\n"
						+ "Dimensions: 4,400 mm L x 1,795 mm W x 1,812 mm H\r\n"
						+ "Number of doors: 5\r\n"
						+ "Driveline: Rear-wheel drive\r\n"
						+ "Engine: 2.2 L 4-cylinder diesel");
				break;
			case Triumph:
				System.out.println("Scrambler 400x");
				System.out.println("Key Specifications of Scrambler 400x\n "
						+"Power, 24 hp \n; "
						+ "GVW, 1510 kg ;\n "
						+ "Mileage, 15 kmpl ;\n "
						+ "Engine, 694 cc ;\n "
						+ "Fuel Tank, 26 Ltr.\n");
				break;
		}		
	}
}
public class VehicleTask {
	public static void main(String[] args) {
		Vehicle vh = new Vehicle();
		vh.display();
	}
}