package hw3;

/**
 * Represents the person who took the trip.
 * @author srollins
 *
 */
public class Rider {
	
	//data members
	private String first;
	private String last;
	private String ccnum;

	/**
	 * Constructor
	 * 
	 * Do not care about validity of original cc number.
	 * @param first
	 * @param last
	 * @param ccnum
	 */
	public Rider(String first, String last, String ccnum) {

		this.first = first;
		this.last = last;
		this.ccnum = ccnum;		
	}

	/**
	 * Return first name.
	 * @return
	 */
	public String getFirst() {
		return first;
	}

	/**
	 * Update first name.
	 * @param first
	 */
	public void setFirst(String first) {
		this.first = first;
	}

	/**
	 * Return last name.
	 * @return
	 */
	public String getLast() {
		return last;
	}

	/**
	 * Update last name.
	 * @param last
	 */
	public void setLast(String last) {
		this.last = last;
	}

	/**
	 * Update the credit card number.
	 * 
	 * Return true if successful (new number is valid)
	 * and false otherwise.
	 * @param ccnum
	 * @return
	 */
	public boolean setCC(String ccnum) {
		if(!validCC(ccnum)) { 
			return false;
		}
		
		this.ccnum = ccnum;
		return true;
	}
	
	/**
	 * Helper method to determine whether a cc num is valid.
	 * Used lots of online references here.
	 * @param ccnum
	 * @return
	 */
	//https://en.wikipedia.org/wiki/Luhn_algorithm
	//http://datagenetics.com/blog/july42013/index.html
	//http://gizmodo.com/how-credit-card-numbers-work-1493331190
	public boolean validCC(String ccnum) {

		if(ccnum.length() != 16) { 
			return false;
		}

		try {
			//TODO: kind of messy -- could improve coding style here.
			int n1 = Integer.parseInt(Character.toString(ccnum.charAt(15)));
			int n2 = calcDoubleDigit(2 * Integer.parseInt(Character.toString(ccnum.charAt(14))));
			int n3 = Integer.parseInt(Character.toString(ccnum.charAt(13)));
			int n4 = calcDoubleDigit(2 * Integer.parseInt(Character.toString(ccnum.charAt(12))));
			int n5 = Integer.parseInt(Character.toString(ccnum.charAt(11)));
			int n6 = calcDoubleDigit(2 * Integer.parseInt(Character.toString(ccnum.charAt(10))));
			int n7 = Integer.parseInt(Character.toString(ccnum.charAt(9)));
			int n8 = calcDoubleDigit(2 * Integer.parseInt(Character.toString(ccnum.charAt(8))));
			int n9 = Integer.parseInt(Character.toString(ccnum.charAt(7)));
			int n10 = calcDoubleDigit(2 * Integer.parseInt(Character.toString(ccnum.charAt(6))));
			int n11 = Integer.parseInt(Character.toString(ccnum.charAt(5)));
			int n12 = calcDoubleDigit(2 * Integer.parseInt(Character.toString(ccnum.charAt(4))));
			int n13 = Integer.parseInt(Character.toString(ccnum.charAt(3)));
			int n14 = calcDoubleDigit(2 * Integer.parseInt(Character.toString(ccnum.charAt(2))));
			int n15 = Integer.parseInt(Character.toString(ccnum.charAt(1)));
			int n16 = calcDoubleDigit(2 * Integer.parseInt(Character.toString(ccnum.charAt(0))));
			
			
			int total = n1 + n2 + n3 + n4 + n5 +
					n6 + n7 + n8 + n9 + n10 +
					n11 + n12 + n13 + n14 + n15 + n16;
					
			
			if(total % 10 == 0) {
				return true;
			}
			
			
		} catch(NumberFormatException nfe) {
			//found a character that was not a digit
			return false;
		}
		
		return false;
	}

	/**
	 * For a number > 10, calculate the value.
	 * Assumes no two digit number > 19.
	 * @param i
	 * @return
	 */
	private int calcDoubleDigit(int i) {
		if(i >= 10) {
			return 1 + (i % 10);
		}
		return i;
	
	}
	
}
