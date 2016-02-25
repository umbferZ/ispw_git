package bean;

/**
 * The Class BeanGestioneStrutture.
 */
public class BeanGestioneStrutture {

    private int camere;

    private String CAP;

    private String checkin, checkout;

    private String citta;

    private String comune;

    private String descrizione;

    private String nome;

    private String numCivic;

    private double prezzo;

    private String regione;

    private String servizi;

    private String via;

    /**
     * Instantiates a new bean gestione strutture.
     *
     * @param via
     *            the via
     * @param nome
     *            the nome
     * @param checkin
     *            the checkin
     * @param checkout
     *            the checkout
     * @param servizi
     *            the servizi
     * @param prezzo
     *            the prezzo
     * @param camere
     *            the camere
     */
    public BeanGestioneStrutture(String via, String nome, String checkin, String checkout, String servizi,
	    double prezzo, int camere) {
	this.setVia(via);
	this.setNome(nome);
	this.camere = camere;
	this.prezzo = prezzo;
	this.servizi = servizi;
	this.checkout = checkout;
	this.checkin = checkin;
    }

    /**
     * Gets the camere.
     *
     * @return the camere
     */
    public int getCamere() {
	return camere;
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
     * Gets the checkin.
     *
     * @return the checkin
     */
    public String getCheckin() {
	return checkin;
    }

    /**
     * Gets the checkout.
     *
     * @return the checkout
     */
    public String getCheckout() {
	return checkout;
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
     * Gets the descrizione.
     *
     * @return the descrizione
     */
    public String getDescrizione() {
	return descrizione;
    }

    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome() {
	return nome;
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
     * Gets the prezzo.
     *
     * @return the prezzo
     */
    public double getPrezzo() {
	return prezzo;
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
     * Gets the servizi.
     *
     * @return the servizi
     */
    public String getServizi() {
	return servizi;
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
     * Sets the camere.
     *
     * @param camere
     *            the new camere
     */
    public void setCamere(int camere) {
	this.camere = camere;
    }

    /**
     * Sets the cap.
     *
     * @param CAP
     *            the new cap
     */
    public void setCAP(String CAP) {
	this.CAP = CAP;
    }

    /**
     * Sets the checkin.
     *
     * @param checkin
     *            the new checkin
     */
    public void setCheckin(String checkin) {
	this.checkin = checkin;
    }

    /**
     * Sets the checkout.
     *
     * @param checkout
     *            the new checkout
     */
    public void setCheckout(String checkout) {
	this.checkout = checkout;
    }

    /**
     * Sets the citta.
     *
     * @param citta
     *            the new citta
     */
    public void setCitta(String citta) {
	this.citta = citta;
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
     * Sets the descrizione.
     *
     * @param descrizione
     *            the new descrizione
     */
    public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
    }

    /**
     * Sets the nome.
     *
     * @param nome
     *            the new nome
     */
    public void setNome(String nome) {
	this.nome = nome;
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
     * Sets the prezzo.
     *
     * @param prezzo
     *            the new prezzo
     */
    public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
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
     * Sets the servizi.
     *
     * @param servizi
     *            the new servizi
     */
    public void setServizi(String servizi) {
	this.servizi = servizi;
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