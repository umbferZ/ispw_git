package entity;

/**
 * The Class User.
 */
public class User {
    private Cart cart;
    private String cognome;
    private String nome;

    /**
     * Instantiates a new user.
     */
    public User(String nome, String cognome) {
	this.nome = nome;
	this.cognome = cognome;
	cart = new Cart();
    }

    public Cart getCart() {
	return cart;
    }

    public String getCognome() {
	return cognome;
    }

    public String getNome() {
	return nome;
    }

    public void setCart(Cart cart) {
	this.cart = cart;
    }

    public void setCognome(String cognome) {
	this.cognome = cognome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

}