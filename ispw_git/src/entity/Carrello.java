package entity;

import java.util.ArrayList;

import entity.strutture.Struttura;

/**
 * The Class Carrello.
 */
public class Carrello {

	private int idUtente;
	private ArrayList<Struttura> listaCarrello;

	/**
	 * Instantiates a new carrello.
	 *
	 * @param idUtente
	 *            the id utente
	 */
	public Carrello(int idUtente) {
		this.idUtente = idUtente;
		listaCarrello = new ArrayList<>();
	}

	/**
	 * Adds the item.
	 *
	 * @param cartItem
	 *            the cart item
	 */
	public void addItem(CartItem cartItem) {
		// listaCarrello.add(cartItem);
	}

}