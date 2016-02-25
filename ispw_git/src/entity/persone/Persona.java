package entity.persone;

/**
 * The Class Persona.
 */
public class Persona {

    /**
     * 
     */
    private String cognome;

    /**
     * 
     */
    private String nome;

    /**
     * Instantiates a new persona.
     *
     * @param nome
     *            the nome
     * @param cognome
     *            the cognome
     */
    public Persona(String nome, String cognome) {
	this.nome = nome;
	this.cognome = cognome;
    }

    /**
     * Gets the cognome.
     *
     * @return cognome
     */
    public String getCognome() {
	return cognome;
    }

    /**
     * Gets the nome.
     *
     * @return nome
     */
    public String getNome() {
	return nome;
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
     * Sets the nome.
     *
     * @param nome
     *            the new nome
     */
    public void setNome(String nome) {
	this.nome = nome;
    }

}