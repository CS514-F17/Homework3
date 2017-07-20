package hw3;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * A class that maintains information about a single Lyft/Uber cab ride.
 * @author srollins
 *
 */
public class Trip {

	/**
	 * TODO: Declare data members
	 * At minimum, data members should include:
	 *  - rider
	 *  - start location
	 *  - end location
	 * 	- start time
	 *  - end time
	 *  see https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
	 */
	
	/**
	 * Create a new Trip for a given Rider.
	 * @param rider
	 * @param startLocation
	 * @param endLocation
	 * @param startTime
	 * @param endTime
	 */
	public Trip(Rider rider, Location startLocation, Location endLocation, LocalDateTime startTime, LocalDateTime endTime) {
		//TODO: Replace with your code.
	}

	/**
	 * Create a new Trip for the rider defined by the first, last, and ccnum.
	 * Constructor must create a new Rider object.
	 * @param first
	 * @param last
	 * @param ccnum
	 * @param startLocation
	 * @param endLocation
	 * @param startTime
	 * @param endTime
	 */
	public Trip(String first, String last, String ccnum, Location startLocation, Location endLocation, LocalDateTime startTime, LocalDateTime endTime) {
		//TODO: Replace with your code.
	}	

	/**
	 * Return the first name of the rider.
	 * @return
	 */
	public String getFirstName() {
		//TODO: Replace with your code.
		return null;
	}
	
	/**
	 * Return the last name of the rider.
	 * @return
	 */
	public String getLastName() {
		//TODO: Replace with your code.
		return null;
	}
	
	/**
	 * Return the distance traveled between the startLocation and endLocation.
	 * It is acceptable to use the approach at the following URL for calculating 
	 * the distance (however this may not be the specific method where that
	 * code should be implemented!)
	 * //http://introcs.cs.princeton.edu/java/44st/Location.java.html
	 * @return
	 */
	public double getDistanceTraveled() {
		//TODO: Replace with your code.
		return 0;
	}

	/**
	 * Return the duration of the trip in minutes.
	 * See https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html
	 * @return
	 */
	public int getDuration() {
		//TODO: Replace with your code.
		return 0;
	}
	
	/**
	 * Update the credit card number of the rider. 
	 * Return true if the newCC is valid and false otherwise.
	 * Use the Luhn algorithm to determine whether the number is valid.
	 * Use the following resources to understand how to implement
	 * the algorithm correctly.
	 * 
	 * https://en.wikipedia.org/wiki/Luhn_algorithm
	 * http://datagenetics.com/blog/july42013/index.html
	 * http://gizmodo.com/how-credit-card-numbers-work-1493331190
	 * @param newCC
	 * @return
	 */
	public boolean updateCCNumber(String newCC) {
		//TODO: Replace with your code.
		return false;
	}	
}
