package garage;

public class Garage {

	public static void main(String[] args) {

		Vehicle ford = new Car(4,5,101, "yellow","4x4");
		Vehicle smart = new Car(4,2,102, "green","city");

		Vehicle vespa = new Motorcycle(2,2,201, "red","yes");
		
		Vehicle scott = new Bicycle(2,1,301, "Yellow","no");
		

		Garage l = new Garage(); // create instance of garage with a default method that does nothing 
		// just so that we can get bill inside the main coz its outside main otherwise and we dont wanna
		// make it static. bill is outside garage(main) but inside garage(object), so need a garage object to access bill
		// Adding a vehicle
		l.addVehicle(4,5,103,"Yellow","city","Car");
		
		
		// Deleting vehicles according to id
		l.deleteVehicle(101);
		
		
		//printing again
		for(Vehicle vehicle:Vehicle.vehicles) {
			System.out.println(l.bill(vehicle));
		}
		// Printing the results in the vehicle array
		for(Vehicle vehicle:Vehicle.vehicles) {
			System.out.println(vehicle.getId());
		}
		
	}
	

	public String bill(Vehicle vehicle) {
		if(vehicle instanceof Car) {
			Car car1 = (Car)vehicle;
		
			if(car1.getCartype().equals("4x4")) {
				return "Bill for a sports car is: 500£";
			}
			if(car1.getCartype().equals("city")) {
				return "Bill for a city car is: 450£";
			}
			return "";
		}
		else if(vehicle instanceof Motorcycle) {
			return "Bill for a motorcycle is: 200£";
		}
		else {
			return "Bill for a bicycle is: 50£";
		}	
	}
	
	public void addVehicle(int wheels, int passengers, int id, String colour, String individual, String type) {
		
		if(type.equals("Car")) {
			new Car(wheels, passengers, id, colour, individual);
		}
		if(type.equals("Motorcycle")) {
			new Motorcycle(wheels, passengers, id, colour, individual);			
		}
		if(type.equals("Bicycle")) {
			new Bicycle(wheels, passengers, id, colour, individual);			
		}
	}
	
//	public void deleteVehicle(int id, String type) {
//		if(type.equals("Car")) {
//			Vehicle.vehicles.remove()
//	}
	public int deleteVehicle(int id) {
		for(int i =0; i<Vehicle.vehicles.size();i++) {
//			return Vehicle.vehicles.get(i).getId();
			if(Vehicle.vehicles.get(i).getId() == id) {
				Vehicle.vehicles.remove(i);
				}
		}
		return 0;
	}
	
	public void clearGarage() {
		
	}
	
}
