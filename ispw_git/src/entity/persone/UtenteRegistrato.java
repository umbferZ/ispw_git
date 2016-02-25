package entity.persone;

/**
 * The Class UtenteRegistrato.
 */
public class UtenteRegistrato extends Persona {

    private String email;

    /**
     * 
     */
    private int id_utenteRegistrato;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String username;

    /**
     * Instantiates a new utente registrato.
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
    public UtenteRegistrato(String nome, String cognome, String email, int id_utenteRegistrato, String username,
	    String password) {
	super(nome, cognome);
	this.id_utenteRegistrato = id_utenteRegistrato;
	this.username = username;
	this.password = password;
	this.email = email;
    }

    /**
     * Gets the email.
     *
     * @return email
     */
    public String getEmail() {
	return email;
    }

    /**
     * Gets the id_utente registrato.
     *
     * @return id_utente registrato
     */
    public int getId_utenteRegistrato() {
	return id_utenteRegistrato;
    }

    /**
     * Gets the password.
     *
     * @return password
     */
    public String getPassword() {
	return password;
    }

    /**
     * Gets the username.
     *
     * @return username
     */
    public String getUsername() {
	return username;
    }

    /**
     * Sets the email.
     *
     * @param email
     *            the new email
     */
    public void setEmail(String email) {
	this.email = email;
    }

    /**
     * Sets the id_utente registrato.
     *
     * @param id_utenteRegistrato
     *            the new id_utente registrato
     */
    public void setId_utenteRegistrato(int id_utenteRegistrato) {
	this.id_utenteRegistrato = id_utenteRegistrato;
    }

    /**
     * Sets the password.
     *
     * @param password
     *            the new password
     */
    public void setPassword(String password) {
	this.password = password;
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