package entity.strutture;

/**
 * The Class Indirizzo.
 */
public class Indirizzo {

    /**
     * 
     */
    private String CAP;

    /**
     * 
     */
    private String citta;

    /**
     * 
     */
    private String comune;

    /**
     * 
     */
    private String numCivic;

    /**
     * 
     */
    private String regione;

    /**
     * 
     */
    private String via;

    /**
     * Instantiates a new indirizzo.
     *
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
     */
    public Indirizzo(String regione, String citta, String comune, String via, String numCivic, String CAP) {
	super();
	this.regione = regione;
	this.citta = citta;
	this.comune = comune;
	this.via = via;
	this.numCivic = numCivic;
	this.CAP = CAP;
    }

    /**
     * Gets the cap.
     *
     * @return the cap
     */
    public String getCAP() {
	return CAP;
    }

    /**
     * Gets the citta.
     *
     * @return the citta
     */
    public String getCitta() {
	return citta;
    }

    /**
     * Gets the comune.
     *
     * @return the comune
     */
    public String getComune() {
	return comune;
    }

    /**
     * Gets the num civic.
     *
     * @return the num civic
     */
    public String getNumCivic() {
	return numCivic;
    }

    /**
     * Gets the regione.
     *
     * @return the regione
     */
    public String getRegione() {
	return regione;
    }

    /**
     * Gets the via.
     *
     * @return the via
     */
    public String getVia() {
	return via;
    }

    /**
     * Sets the cap.
     *
     * @param cAP
     *            the new cap
     */
    public void setCAP(String cAP) {
	CAP = cAP;
    }

    /**
     * Sets the città.
     *
     * @param città
     *            the new città
     */
    public void setCittà(String città) {
	this.citta = città;
    }

    /**
     * Sets the comune.
     *
     * @param comune
     *            the new comune
     */
    public void setComune(String comune) {
	this.comune = comune;
    }

    /**
     * Sets the num civic.
     *
     * @param numCivic
     *            the new num civic
     */
    public void setNumCivic(String numCivic) {
	this.numCivic = numCivic;
    }

    /**
     * Sets the regione.
     *
     * @param regione
     *            the new regione
     */
    public void setRegione(String regione) {
	this.regione = regione;
    }

    /**
     * Sets the via.
     *
     * @param via
     *            the new via
     */
    public void setVia(String via) {
	this.via = via;
    }

}