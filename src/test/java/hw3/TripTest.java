package hw3;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class TripTest {

	private static double latUSF = 37.7753657;
	private static double lonUSF = -122.4500313;

	private static double latSARA = 36.9832373;
	private static double lonSARA = -121.9496012;

	
	@Test	
	public void testGetFirst1() {
		Rider rider = new Rider("Sally", "Jones", "5457623898234113");
		Trip trip = new Trip(rider, 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 18, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 30, 0))
				;
		assertEquals("getFirst failing for Sally Jones", "Sally", trip.getFirstName());

	}

	@Test
	public void testGetFirst2() {
		Trip trip = new Trip("Bob", "Smith", "5457623898234113", 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 18, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 30, 0)
				);
		assertEquals("getFirst failing for Bob Smith", "Bob", trip.getFirstName());

	}

	@Test	
	public void testGetLast1() {
		Rider rider = new Rider("Sally", "Jones", "5457623898234113");
		Trip trip = new Trip(rider, 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 18, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 30, 0)
				);
		assertEquals("getLast failing for Sally Jones", "Jones", trip.getLastName());

	}

	@Test
	public void testGetLast2() {
		Trip trip = new Trip("Bob", "Smith", "5457623898234113", 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 18, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 30, 0)
				);
		assertEquals("getLast failing for Bob Smith", "Smith", trip.getLastName());

	}

	@Test
	public void testGetDistance1() {
		Trip trip = new Trip("Bob", "Smith", "5457623898234113", 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 18, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 30, 0)
				);
		assertEquals("getDistanceTraveled failing", 61.1987, trip.getDistanceTraveled(),.001);

	}

	@Test
	public void testGetDuration1() {
		Trip trip = new Trip("Bob", "Smith", "5457623898234113", 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 19, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 30, 0)
				);
		assertEquals("getDuration failing for 20 minutes", 20, trip.getDuration());

	}
	
	@Test
	public void testGetDuration2() {
		Rider rider = new Rider("Sally", "Jones", "5457623898234113");
		Trip trip = new Trip(rider, 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 18, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 12, 0)
				);
		assertEquals("getDuration failing for 1442 minutes", 1442, trip.getDuration());

	}

	@Test
	public void testUpdateCCNum1() {
		Trip trip = new Trip("Bob", "Smith", "123456789321654", 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 19, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 30, 0)
				);
		assertEquals("updateCCNumber failing for valid number", true, trip.updateCCNumber("5457623898234113"));

	}

	@Test
	public void testUpdateCCNum2() {
		Trip trip = new Trip("Bob", "Smith", "5457623898234113", 
				new Location(latUSF, lonUSF), new Location(latSARA, lonSARA),
				LocalDateTime.of(2017, 07, 19, 16, 10, 0), LocalDateTime.of(2017, 07, 19, 16, 30, 0)
				);
		assertEquals("updateCCNumber failing for invalid number", false, trip.updateCCNumber("5457623898234133"));

	}
	
}
