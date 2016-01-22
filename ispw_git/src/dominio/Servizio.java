package dominio;

import java.util.*;

/**
 * 
 */
public class Servizio {

	/**
	 * Default constructor
	 */
	public Servizio() {
		this.costo = new Money();
		this.name = "Servizio";
	}

	private Money costo;

	private String name;

	public Money getCosto() {
		return costo;
	}

	public String getName() {
		return name;
	}

}