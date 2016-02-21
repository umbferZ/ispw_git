package entity.strutture;

import entity.persone.Locatore;

/**
 * The Class Appartamento.
 */
public class Appartamento extends StrutturaPrivata {

    private int numBagni;

    private int numCamere;

    private double prezzo;

    /**
     * Instantiates a new appartamento.
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
     * @param numCamere
     *            the num camere
     * @param numBagni
     *            the num bagni
     * @param prezzo
     *            the prezzo
     */
    public Appartamento(int id_struttura, String nome, String regione, String citta, String comune, String via,
	    String numCivic, String CAP, String descrizione, Locatore locatore, int numCamere, int numBagni,
	    double prezzo) {
	super(id_struttura, nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore);
	this.numCamere = numCamere;
	this.numBagni = numBagni;
	this.prezzo = prezzo;
    }

    /**
     * Gets the num bagni.
     *
     * @return the num bagni
     */
    public int getNumBagni() {
	return numBagni;
    }

    /**
     * Gets the num camere.
     *
     * @return the num camere
     */
    public int getNumCamere() {
	return numCamere;
    }

    /**
     * Gets the prezzo.
     *
     * @return the prezzo
     */
    public double getPrezzo() {
	return prezzo;
    }

    /*
     * (non-Javadoc)
     * 
     * @see entity.strutture.StrutturaPrivata#serializza()
     */
    @Override
    public boolean serializza() {
	return false;
    }

    /**
     * Sets the num bagni.
     *
     * @param numBagni
     *            the new num bagni
     */
    public void setNumBagni(int numBagni) {
	this.numBagni = numBagni;
    }

    /**
     * Sets the num camere.
     *
     * @param numCamere
     *            the new num camere
     */
    public void setNumCamere(int numCamere) {
	this.numCamere = numCamere;
    }

    /**
     * Sets the prezzo.
     *
     * @param prezzo
     *            the new prezzo
     */
    public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
    }
}