package entity.strutture;

import entity.persone.Locatore;

/**
 * The Class Residence.
 */
public class Residence extends StrutturaAlberghiera {

    private int appartamentiTotali, appartamentiDisponibili;

    private double prezzo;

    /**
     * Instantiates a new residence.
     *
     * @param id_struttura the id_struttura
     * @param nome the nome
     * @param regione the regione
     * @param citta the citta
     * @param comune the comune
     * @param via the via
     * @param numCivic the num civic
     * @param CAP the cap
     * @param descrizione the descrizione
     * @param locatore the locatore
     * @param prezzo the prezzo
     * @param appartamentiTotali the appartamenti totali
     * @param appartamentiDisponibili the appartamenti disponibili
     */
    public Residence(int id_struttura, String nome, String regione, String citta, String comune, String via,
	    String numCivic, String CAP, String descrizione, Locatore locatore, double prezzo, int appartamentiTotali,
	    int appartamentiDisponibili) {
	super(id_struttura, nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore);
	this.prezzo = prezzo;
	this.appartamentiTotali = appartamentiTotali;
	this.appartamentiDisponibili = appartamentiDisponibili;
    }

    /**
     * Gets the appartamenti disponibili.
     *
     * @return the appartamenti disponibili
     */
    public int getAppartamentiDisponibili() {
	return appartamentiDisponibili;
    }

    /**
     * Gets the appartamenti totali.
     *
     * @return the appartamenti totali
     */
    public int getAppartamentiTotali() {
	return appartamentiTotali;
    }

    /**
     * Gets the prezzo.
     *
     * @return the prezzo
     */
    public double getPrezzo() {
	return prezzo;
    }

    /* (non-Javadoc)
     * @see entity.strutture.StrutturaAlberghiera#serializza()
     */
    @Override
    public boolean serializza() {
	return false;
    }

    /**
     * Sets the appartamenti disponibili.
     *
     * @param appartamentiDisponibili the new appartamenti disponibili
     */
    public void setAppartamentiDisponibili(int appartamentiDisponibili) {
	this.appartamentiDisponibili = appartamentiDisponibili;
    }

    /**
     * Sets the appartamenti totali.
     *
     * @param appartamentiTotali the new appartamenti totali
     */
    public void setAppartamentiTotali(int appartamentiTotali) {
	this.appartamentiTotali = appartamentiTotali;
    }

    /**
     * Sets the prezzo.
     *
     * @param prezzo the new prezzo
     */
    public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
    }
}