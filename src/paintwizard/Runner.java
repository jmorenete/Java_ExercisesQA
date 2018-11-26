package paintwizard;

public class Runner {

	public static void main(String[] args) {

		Paint cheapo = new Paint("cheapomax",19.99,10,20);
		Paint joe = new Paint("averagejoes",17.99,11,15);
		Paint dulux = new Paint("duluxouruspaints",25,20,10);
		Room room = new Room(500);
		System.out.println(room.leastWaste());
		System.out.println(room.leastPriceInd());
		System.out.println(room.leastPriceMix());

	}

		
	{

	}

}
