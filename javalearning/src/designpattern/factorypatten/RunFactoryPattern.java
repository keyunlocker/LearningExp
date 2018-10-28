package designpattern.factorypatten;

import designpattern.Bike;

public class RunFactoryPattern {
	
	public static void main(String args[]) {
		BikeFactory bikeFactory= new BikeFactory();
		Bike bike= bikeFactory.makeBike("ducati");
		bike.model();
		bike=bikeFactory.makeBike("kawasaki");
		bike.model();
		
		
		Bike bike2= BikeFactory.manufactureBike("ducati");
		bike2.model();
		bike2=BikeFactory.manufactureBike("kawasaki");
		bike2.model();
		
	}

}
