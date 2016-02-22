package entity.strutture;

import java.io.Serializable;

import entity.persone.Locatore;
import persistency.DAO;

/**
 * The Class Albergo.
 */
public class Albergo extends StrutturaAlberghiera implements Serializable {

	private int camereTotali, numSingole, numMatrimoniali, numTriple;

	private double prezzoSingole, prezzoMatrimoniali, prezzoTriple;

	private String stelle;

	/**
	 * Instantiates a new albergo.
	 *
	 * @param id_struttura
	 *            the id_struttura
	 * @param nome
	 *            the nome
	 * @param regione
	 *            the regione
	 * @param citta
	 *            the citta
	 * @param comune
	 *            the comune
	 * @param via
	 *            the via
	 * @param numCivic
	 *            the num civic
	 * @param CAP
	 *            the cap
	 * @param descrizione
	 *            the descrizione
	 * @param locatore
	 *            the locatore
	 * @param stelle
	 *            the stelle
	 * @param camereTotali
	 *            the camere totali
	 * @param numSingole
	 *            the num singole
	 * @param numMatrimoniali
	 *            the num matrimoniali
	 * @param numTriple
	 *            the num triple
	 * @param prezzoSingole
	 *            the prezzo singole
	 * @param prezzoMatrimoniali
	 *            the prezzo matrimoniali
	 * @param prezzoTriple
	 *            the prezzo triple
	 */
	public Albergo(int id_struttura, String nome, String regione, String citta, String comune, String via,
			String numCivic, String CAP, String descrizione, Locatore locatore, String stelle, int camereTotali,
			int numSingole, int numMatrimoniali, int numTriple, double prezzoSingole, double prezzoMatrimoniali,
			double prezzoTriple) {
		super(id_struttura, nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore);
		this.stelle = stelle;
		this.camereTotali = camereTotali;
		this.numSingole = numSingole;
		this.numMatrimoniali = numMatrimoniali;
		this.numTriple = numTriple;
		this.prezzoSingole = prezzoSingole;
		this.prezzoMatrimoniali = prezzoMatrimoniali;
		this.prezzoTriple = prezzoTriple;
	}

	/**
	 * Gets the camere totali.
	 *
	 * @return camere totali
	 */
	public int getCamereTotali() {
		return camereTotali;
	}

	/**
	 * Gets the num matrimoniali.
	 *
	 * @return num matrimoniali
	 */
	public int getNumMatrimoniali() {
		return numMatrimoniali;
	}

	/**
	 * Gets the num singole.
	 *
	 * @return num singole
	 */
	public int getNumSingole() {
		return numSingole;
	}

	/**
	 * Gets the num triple.
	 *
	 * @return num triple
	 */
	public int getNumTriple() {
		return numTriple;
	}

	/**
	 * Gets the prezzo matrimoniali.
	 *
	 * @return prezzo matrimoniali
	 */
	public double getPrezzoMatrimoniali() {
		return prezzoMatrimoniali;
	}

	/**
	 * Gets the prezzo singole.
	 *
	 * @return prezzo singole
	 */
	public double getPrezzoSingole() {
		return prezzoSingole;
	}

	/**
	 * Gets the prezzo triple.
	 *
	 * @return prezzo triple
	 */
	public double getPrezzoTriple() {
		return prezzoTriple;
	}

	/**
	 * Gets the stelle.
	 *
	 * @return stelle
	 */
	public String getStelle() {
		return stelle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see entity.strutture.StrutturaAlberghiera#serializza()
	 */
	@Override
	public boolean serializza() {
		boolean check = this.serializzaStruttura();
		if (check) {
			this.setId_struttura(this.reperisciIDStruttura());
			if (this.getId_struttura() == 0)
				return false;

			check = this.serializzaAlbergo();
			if (check) {
				this.getLocatore().aggregaStruttura(this);
				return true;
			}
		}
		return false;
	}

	/**
	 * Serializza albergo.
	 *
	 * @return true, if successful
	 */
	public boolean serializzaAlbergo() {
		String[] label = { "stelle", "camereTotali", "numSingole", "prezzoSingole", "numMatrimoniali",
				"prezzoMatrimoniali", "numTriple", "prezzoTriple", "strutture_idstrutture" };
		Object[] value = { this.getStelle(), this.getCamereTotali(), this.getNumSingole(), this.getPrezzoSingole(),
				this.getNumMatrimoniali(), this.getPrezzoMatrimoniali(), this.getNumTriple(), this.getPrezzoTriple(),
				this.getId_struttura() };
		DAO.getInstance().insert("hotel", label, value);
		return true;
	}

	/**
	 * Serializza su file.
	 *
	 * @return true, if successful
	 */
	public boolean serializzaSuFile() {
		// TODO implements here
		return false;
	}

	/**
	 * Sets the camere totali.
	 *
	 * @param camereTotali
	 *            the new camere totali
	 */
	public void setCamereTotali(int camereTotali) {
		this.camereTotali = camereTotali;
	}

	/**
	 * Sets the num matrimoniali.
	 *
	 * @param numMatrimoniali
	 *            the new num matrimoniali
	 */
	public void setNumMatrimoniali(int numMatrimoniali) {
		this.numMatrimoniali = numMatrimoniali;
	}

	/**
	 * Sets the num singole.
	 *
	 * @param numSingole
	 *            the new num singole
	 */
	public void setNumSingole(int numSingole) {
		this.numSingole = numSingole;
	}

	/**
	 * Sets the num triple.
	 *
	 * @param numTriple
	 *            the new num triple
	 */
	public void setNumTriple(int numTriple) {
		this.numTriple = numTriple;
	}

	/**
	 * Sets the prezzo matrimoniali.
	 *
	 * @param prezzoMatrimoniali
	 *            the new prezzo matrimoniali
	 */
	public void setPrezzoMatrimoniali(double prezzoMatrimoniali) {
		this.prezzoMatrimoniali = prezzoMatrimoniali;
	}

	/**
	 * Sets the prezzo singole.
	 *
	 * @param prezzoSingole
	 *            the new prezzo singole
	 */
	public void setPrezzoSingole(double prezzoSingole) {
		this.prezzoSingole = prezzoSingole;
	}

	/**
	 * Sets the prezzo triple.
	 *
	 * @param prezzoTriple
	 *            the new prezzo triple
	 */
	public void setPrezzoTriple(double prezzoTriple) {
		this.prezzoTriple = prezzoTriple;
	}

	/**
	 * Sets the stelle.
	 *
	 * @param stelle
	 *            the new stelle
	 */
	public void setStelle(String stelle) {
		this.stelle = stelle;
	}
}