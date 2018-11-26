package garage;

public class Motorcycle extends Vehicle{
	private String luggagecarrier;
	
	public Motorcycle(int wheels, int passengers, int id, String colour, String luggagecarrier) {
		super(wheels, passengers, id, colour);
		this.luggagecarrier = luggagecarrier;
		vehicles.add(this);
	}

	public String getLuggagecarrier() {
		return luggagecarrier;
	}
	

}
