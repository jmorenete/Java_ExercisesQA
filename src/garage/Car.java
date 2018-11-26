package garage;

public class Car extends Vehicle{
	private String cartype;

	public Car(int wheelnum, int passengers, int id, String colour,String cartype ) {
		super(wheelnum, passengers, id,colour);
		this.cartype = cartype;
		vehicles.add(this);
		
		
	}
	
	public String getCartype() {
		return cartype;
	}

}
