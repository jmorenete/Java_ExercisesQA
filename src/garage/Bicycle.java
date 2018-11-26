package garage;

public class Bicycle extends Vehicle{
	private String mudguard;


	public Bicycle(int wheelnum, int passengers, int id, String colour, String mudguard) {
		super(wheelnum, passengers, id, colour);
		this.mudguard = mudguard;
		vehicles.add(this);
	}

}
