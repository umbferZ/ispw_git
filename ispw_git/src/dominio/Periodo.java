package dominio;

import java.util.*;

/**
 * 
 */
public class Periodo {

	/**
	 * Default constructor
	 */
	public Periodo() {
	}

	/**
	 * 
	 */
	private Date start;

	/**
	 * 
	 */
	private Date end;

	/**
	 * @param start
	 * @param end
	 */
	public Periodo(Date start, Date end) {
		this.start = start;
		this.end = end;
	}

}