package dominio;

import java.util.*;

/**
 * 
 */
public class Money {

	/**
	 * Default constructor
	 */
	public Money() {
		valore = 0;
		valuta="euro";
	}

	private int valore;
	private String valuta;

	public int getValore() {
		return this.valore;
	}

	public String getValuta() {
		return this.valuta;
	}

	public void addMoney(Money m) {
		// this.valore = this.valore + m.getValore();
	}

}