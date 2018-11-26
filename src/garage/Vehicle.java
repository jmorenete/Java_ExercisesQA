package garage;

import java.util.ArrayList;

public class Vehicle {
	private int wheelnum;
	private int id;
	private int passengers;
	private String colour;
	
	public static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void drive(){
		
	}
	
//	public void fix(){
//		
//	}

	public Vehicle(int wheelnum, int passengers, int id, String colour) {
		this.wheelnum = wheelnum;
		this.passengers = passengers;
		this.id = id;
		this.colour = colour;
		
	}
	
	public int getWheelnum() {
		return wheelnum;
	}
	
	public int getId() {
		return id;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public String getColour() {
		return colour;
	}
	
	
//	
//	public String toString() {
//		return in
}
