package paintwizard;

import java.util.ArrayList;
import java.util.Collections;

public class Room {
	private double size;
	
	public static ArrayList <Double> leftovers = new ArrayList <Double>(); //change to non static
	public static ArrayList <Double> pricemix = new ArrayList <Double>(); //change to non static

	
	public Room(double size) {
		this.size = size;
	}
	
	
	public String leastWaste() {//Need to redo without another array
		
		for(Paint paint:Paint.paints) {
		double area = paint.getVolume()*paint.getYield();
		
		double leftover = Math.abs(this.getSize()-area);
		leftovers.add(leftover);
		}
		
	int minIndex = leftovers.indexOf(Collections.min(leftovers));
	
	String nameWasteless = Paint.paints.get(minIndex).getName();
	return "The least wasteful paint for a room of size " + size + "m2 is: " + nameWasteless;//adjust code so that if cheapon and avgjoe both as wasteless return both

	}
//below is done as above but without involving an arraylist - could shorten code by creating method in paint that calcs pricetubs. how would i change this.getSize tho?
	public String leastPriceInd() {
		double leastPrice=0;
		
		for(int i=0; i<Paint.paints.size();i++) {
			if(i == 0){
				
				double area = Paint.paints.get(i).getVolume()*Paint.paints.get(i).getYield();
				double tubs = Math.ceil(this.getSize()/area);// rounding up as cannot get 
				double priceTubs = tubs*Paint.paints.get(i).getPrice();

				leastPrice = priceTubs;
			}
			else {
				double area = Paint.paints.get(i).getVolume()*Paint.paints.get(i).getYield();
				double tubs = Math.ceil(this.getSize()/area);// rounding up as cannot get 
				double priceTubs = tubs*Paint.paints.get(i).getPrice();

				
				if(leastPrice>priceTubs) {
					leastPrice = priceTubs;
					return "The cheapest paint for this room is: " + Paint.paints.get(i).getName();
					
				}
				else {
					return "The cheapest paint for this room is: " + Paint.paints.get(0).getName();
				}
			}
		}
		return "";
	}
		
			
	public String leastPriceMix() {
		//Calculate how many tubs are needed for the cheapest individual paint
		
		if(this.leastPriceInd().contains("cheapomax")) {
			
			double leastprice=0;
			double priceMin;
			double area = Paint.paints.get(0).getVolume()*Paint.paints.get(0).getYield();
			int tubs = (int) Math.ceil(this.getSize()/area);// rounding up as cannot get 
			System.out.println(tubs);
			
			for(int j =(tubs-1);j> 0;j--) {
				for(int t=1;t < tubs-1;t++) {
			
					if((j==(tubs-1))&&(t==1)) {
						priceMin = Paint.paints.get(0).getPrice()*(j) + Paint.paints.get(1).getPrice()*(t);
						leastprice = priceMin;
					}
					else {
						priceMin = Paint.paints.get(0).getPrice()*(j) + Paint.paints.get(1).getPrice()*(t);
		
						if(leastprice > priceMin) {
							leastprice = priceMin;
							
							return "Cheapest combo is: cheapo "+j+ " tubs and average joes: "+t+" tubs";
						}
						else {
							return "Cheapest is sad ol cheapo alone";
						}
					}
				
				}
	
			}
		}
		
		else {
			double leastprice=0;
			double priceMin;
			double area = Paint.paints.get(1).getVolume()*Paint.paints.get(1).getYield();
			int tubs = (int) Math.ceil(this.getSize()/area);// rounding up as cannot get 
			
			for(int j =(tubs-1);j> 0;j--) {
				for(int t=1;t<tubs-1;t++) {
			
					if((j==(tubs-1))&&(t==1)) {
						priceMin = Paint.paints.get(0).getPrice()*(t) + Paint.paints.get(1).getPrice()*(j);
						leastprice = priceMin;
					}
					else {
						priceMin = Paint.paints.get(0).getPrice()*(t) + Paint.paints.get(1).getPrice()*(j);
		
						if(leastprice > priceMin) {
							leastprice = priceMin;
							
							return "Cheapest combo is: cheapo "+t+ " tubs and average joes: "+j+" tubs";
						}
						else {
							return "Cheapest is sad ol averagejoe alone";
						}
					}
				
				}
	
			}
		}
		
		return " ";
	}
	
	public double getSize() {
		return size;
	}
}
