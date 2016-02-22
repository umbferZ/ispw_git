package entity.persone;

import java.util.ArrayList;
import java.util.List;

import entity.strutture.Struttura;

/**
 * The Class Locatore.
 */
public class Locatore extends UtenteRegistrato {

	private int ccNumber;

	/**
	 * 
	 */
	private List<Struttura> listaStrutture;

	/**
	 * Instantiates a new locatore.
	 *
	 * @param nome
	 *            the nome
	 * @param cognome
	 *            the cognome
	 * @param email
	 *            the email
	 * @param id_utenteRegistrato
	 *            the id_utente registrato
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 */
	public Locatore(String nome, String cognome, String email, int id_utenteRegistrato, String username,
			String password) {
		super(nome, cognome, email, id_utenteRegistrato, username, password);
		this.listaStrutture = new ArrayList<>();
	}

	/**
	 * Instantiates a new locatore.
	 *
	 * @param nome
	 *            the nome
	 * @param cognome
	 *            the cognome
	 * @param email
	 *            the email
	 * @param id_utenteRegistrato
	 *            the id_utente registrato
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 * @param ccNumber
	 *            the cc number
	 */
	public Locatore(String nome, String cognome, String email, int id_utenteRegistrato, String username,
			String password, int ccNumber) {
		super(nome, cognome, email, id_utenteRegistrato, username, password);
		this.ccNumber = ccNumber;
	}

	/**
	 * Instantiates a new locatore.
	 *
	 * @param nome
	 *            the nome
	 * @param cognome
	 *            the cognome
	 * @param email
	 *            the email
	 * @param id_utenteRegistrato
	 *            the id_utente registrato
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 * @param listaStrutture
	 *            the lista strutture
	 */
	public Locatore(String nome, String cognome, String email, int id_utenteRegistrato, String username,
			String password, List<Struttura> listaStrutture) {
		super(nome, cognome, email, id_utenteRegistrato, username, password);
		this.listaStrutture = listaStrutture;
	}

	/**
	 * Aggrega struttura.
	 *
	 * @param struttura
	 *            the struttura
	 */
	public void aggregaStruttura(Struttura struttura) {
		listaStrutture.add(struttura);
	}

	/**
	 * Gets the cc number.
	 *
	 * @return cc number
	 */
	public int getCcNumber() {
		return ccNumber;
	}

	/**
	 * Gets the lista strutture.
	 *
	 * @return lista strutture
	 */
	public List<Struttura> getListaStrutture() {
		return listaStrutture;
	}

	/**
	 * Sets the cc number.
	 *
	 * @param ccNumber
	 *            the new cc number
	 */
	public void setCcNumber(int ccNumber) {
		this.ccNumber = ccNumber;
	}

	/**
	 * Sets the lista strutture.
	 *
	 * @param listaStrutture
	 *            the new lista strutture
	 */
	public void setListaStrutture(List<Struttura> listaStrutture) {
		this.listaStrutture = listaStrutture;
	}
}