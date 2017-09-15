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
	 * Minimum
	 *  - rider
	 *  - start location
	 *  - end location
	 * 	- start time
	 *  - end time
	 *  //see https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
	 */
	private Rider rider; 
	private Location startLocation;
	private Location endLocation;
	private LocalDateTime startTime;
	private LocalDateTime endTime;

	/**
	 * Create a new Trip for a given Rider.
	 * @param rider
	 * @param startLocation
	 * @param endLocation
	 * @param startTime
	 * @param endTime
	 */
	public Trip(Rider rider, Location startLocation, Location endLocation, LocalDateTime startTime, LocalDateTime endTime) {
		this.rider = rider;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.startTime = startTime;
		this.endTime = endTime;
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
		this.rider = new Rider(first, last, ccnum);
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.startTime = startTime;
		this.endTime = endTime;
	}	

	/**
	 * Return the first name of the rider.
	 * @return
	 */
	public String getFirstName() {
		return rider.getFirst();
	}
	
	/**
	 * Return the last name of the rider.
	 * @return
	 */
	public String getLastName() {
		return rider.getLast();
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
		return startLocation.getDistance(endLocation);
	}

	/**
	 * Return the duration of the trip in minutes.
	 * See https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html
	 * @return
	 */
	public int getDuration() {
		return (int)((Duration.between(startTime, endTime)).getSeconds()/60);
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
		return rider.setCC(newCC);
	}

	//helper variables for testing
	private static double latUSF = 37.7753657;
	private static double lonUSF = -122.4500313;

	private static double latSARA = 36.9832373;
	private static double lonSARA = -121.9496012;

	public static void main(String[] args) {
		Trip t1 = new Trip("bob", "smith", "1234567891212", 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 18, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 30, 0));
		System.out.println(t1.getDistanceTraveled());
	}
	
}