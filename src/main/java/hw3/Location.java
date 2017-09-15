package hw3;

/**
 * Represents a location.
 * @author srollins
 *
 */

public class Location {

	//data memebers to hold lat and lon
	private double lat;
	private double lon;

	/**
	 * Constructor
	 * @param lat
	 * @param lon
	 */
	public Location(double lat, double lon) {
		this.lat = lat;
		this.lon = lon;		
	}

	/**
	 * Return latitude.
	 * @return
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * Update latitude.
	 * @param lat
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}

	/**
	 * Return longitude.
	 * @return
	 */
	public double getLon() {
		return lon;
	}

	/**
	 * Update longitude.
	 * @param lon
	 */
	public void setLon(double lon) {
		this.lon = lon;
	}


	/**
	 * Return the distance between this location and the location
	 * specified by other.
	 *
	 * This code is taken from: //http://introcs.cs.princeton.edu/java/44st/Location.java.html
	 * 
	 * @param other
	 * @return
	 */
	public double getDistance(Location other) {
		double STATUTE_MILES_PER_NAUTICAL_MILE = 1.15077945;
		double lat1 = Math.toRadians(this.lat);
		double lon1 = Math.toRadians(this.lon);
		double lat2 = Math.toRadians(other.lat);
		double lon2 = Math.toRadians(other.lon);

		// great circle distance in radians, using law of cosines formula
		double angle = Math.acos(Math.sin(lat1) * Math.sin(lat2)
				+ Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

		// each degree on a great circle of Earth is 60 nautical miles
		double nauticalMiles = 60 * Math.toDegrees(angle);
		double statuteMiles = STATUTE_MILES_PER_NAUTICAL_MILE * nauticalMiles;
		return statuteMiles;        
	}


	//37.74069,-122.4750291
	/**
	 * Main method to test
	 * @param args
	 */
	public static void main(String[] args) {
		Location l1 = new Location(36.9832373,-121.9496012);
		Location l2 = new Location(35.1221712,-120.6065745);
		System.out.println("Distance: " + l1.getDistance(l2));
		System.out.println("Distance: " + l2.getDistance(l1));
	}
}