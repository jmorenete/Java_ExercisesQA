package paintwizard;

import java.util.ArrayList;

public class Paint {
	
	private String name;
	private double price;
	private int yield;
	private int volume;
	
	public static ArrayList<Paint> paints = new ArrayList<Paint>();
	
	public Paint(String name,double price, int yield, int volume) {
		this.name = name;
		this.price = price;
		this.yield = yield;
		this.volume = volume;
		paints.add(this);
		
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getYield() {
		return yield;
	}
	public int getVolume() {
		return volume;
	}
//	public int calcPrice(int i) {
//		double area = Paint.paints.get(i).getVolume()*Paint.paints.get(i).getYield();
//		double tubs = Math.ceil(Room.getSize()/area);// rounding up as cannot get 
//		double priceTubs = tubs*Paint.paints.get(i).getPrice();
//	}

}
