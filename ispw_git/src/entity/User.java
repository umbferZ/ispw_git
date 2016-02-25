package entity;

/**
 * The Class User.
 */
public class User {
    private String nome;
    private String cognome;
    private Cart cart;

    /**
     * Instantiates a new user.
     */
    public User(String nome, String cognome) {
	this.nome = nome;
	this.cognome = cognome;
	cart = new Cart();
    }

}