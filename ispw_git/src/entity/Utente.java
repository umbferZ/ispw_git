package entity;

/**
 * The Class Utente.
 */
public class Utente {
    private Carrello carrello;
    private int ccNumber;
    private int ccv;
    private String cognome;
    private String emailAddress;
    private Object lock = new Object();
    private String nome;

    private String username;

    /**
     * Instantiates a new utente.
     *
     * @param nome
     *            the nome
     * @param cognome
     *            the cognome
     * @param username
     *            the username
     * @param emailAddress
     *            the email address
     * @param carrello
     *            the carrello
     * @param ccNumber
     *            the cc number
     * @param ccv
     *            the ccv
     */
    public Utente(String nome, String cognome, String username, String emailAddress, Carrello carrello, int ccNumber,
	    int ccv) {
	this.nome = nome;
	this.cognome = cognome;
	this.username = username;
	this.emailAddress = emailAddress;
	this.carrello = carrello;
	this.ccNumber = ccNumber;
	this.ccv = ccv;
    }

    /**
     * Gets the carrello.
     *
     * @return the carrello
     */
    public Carrello getCarrello() {
	return carrello;
    }

    /**
     * Gets the cc number.
     *
     * @return the cc number
     */
    public int getCcNumber() {
	synchronized (lock) {
	    return ccNumber;
	}
    }

    /**
     * Gets the ccv.
     *
     * @return the ccv
     */
    public int getCcv() {
	return ccv;
    }

    /**
     * Gets the cognome.
     *
     * @return the cognome
     */
    public String getCognome() {
	return cognome;
    }

    /**
     * Gets the email address.
     *
     * @return the email address
     */
    public String getEmailAddress() {
	return emailAddress;
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
     * Gets the username.
     *
     * @return the username
     */
    public String getUsername() {
	return username;
    }

    /**
     * Sets the carrello.
     *
     * @param carrello
     *            the new carrello
     */
    public void setCarrello(Carrello carrello) {
	this.carrello = carrello;
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
     * Sets the ccv.
     *
     * @param ccv
     *            the new ccv
     */
    public void setCcv(int ccv) {
	this.ccv = ccv;
    }

    /**
     * Sets the cognome.
     *
     * @param cognome
     *            the new cognome
     */
    public void setCognome(String cognome) {
	this.cognome = cognome;
    }

    /**
     * Sets the email address.
     *
     * @param emailAddress
     *            the new email address
     */
    public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
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
     * Sets the username.
     *
     * @param username
     *            the new username
     */
    public void setUsername(String username) {
	this.username = username;
    }
}
