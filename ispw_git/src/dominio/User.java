package dominio;

import java.util.*;

/**
 * 
 */
public class User {

	/**
	 * Default constructor
	 */
	public User() {
	}

	/**
	 * 
	 */
	private Carrello carrello;

	/**
	 * 
	 */
	private ListaDesideri listaDesideri;

	public void setCarrello(Carrello carrello) {
		this.carrello = carrello;
	}

	public Carrello getCarrello() {
		return this.carrello;
	}

}