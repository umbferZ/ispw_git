package bean;

/**
 * The Class BeanUser.
 */
public class BeanUser {
    private String cognome = "";
    private String id = "";
    private String nome = "";

    /**
     * Gets the cognome.
     *
     * @return the cognome
     */
    public String getCognome() {
	return this.cognome;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
	return this.id;
    }

    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome() {
	return this.nome;
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
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setId(String id) {
	this.id = id;
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

}
