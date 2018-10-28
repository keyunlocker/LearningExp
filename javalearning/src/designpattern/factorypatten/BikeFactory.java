package designpattern.factorypatten;

import designpattern.Bike;
import designpattern.Ducati;
import designpattern.Kawasaki;

/**
 * @author key
 *
 */
public class BikeFactory {
	
	/**
	 * @param instanceName
	 * @return shape Instance
	 */
	public Bike makeBike(String instanceName) {
		if("Ducati".equalsIgnoreCase(instanceName)) {
			return new Ducati();
		}else if("Kawasaki".equalsIgnoreCase(instanceName)) {
			return new Kawasaki();
		}else {
			return null;
		}
	}
	
	
	/**
	 * @param instanceName
	 * @return shape Instance
	 */
	public static Bike manufactureBike(String instanceName) {
		if("Ducati".equalsIgnoreCase(instanceName)) {
			return new Ducati();
		}else if("Kawasaki".equalsIgnoreCase(instanceName)) {
			return new Kawasaki();
		}else {
			return null;
		}
	}
}
