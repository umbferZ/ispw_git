package dominio;

import java.awt.List;
import java.util.*;

/**
 * 
 */
public class User {

	/**
	 * Default constructor
	 */
	public User() {
		this.carrello=new Carrello();
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