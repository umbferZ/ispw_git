package control;

import java.util.Date;

import entity.Cart;
import entity.ItemCart;
import entity.Periodo;
import entity.Struttura;

/**
 * The Class KUC_manageCart.
 */
public class KUC_manageCart {

    private Cart cart; // TODO capire come ottenere il carrello... dall'utente
    // attraverso la sessione? se si come lo passo

    /**
     * Instantiates a new KUC_manage cart.
     */
    public KUC_manageCart(Cart cart) {
	this.cart = cart;
    }

    /**
     * Aggiungi al carrello.
     */
    public void aggiungiAlCarrello() {
	// TODO prendere una struttura attraverso un bean
	// TODO prendere la data di checkin e checkout
	// TODO prendere anche il carrello
	Struttura struttura = new Struttura();
	Date checkin = new Date();
	Date checkout = new Date();
	//
	Periodo periodo = new Periodo(checkin, checkout);
	if (struttura.isAvailable(periodo)) {
	    ItemCart itemCart = new ItemCart(struttura, periodo);
	    cart.addItem(itemCart);
	}

    }

    /**
     * Delete item.
     *
     * @param index
     *            the index
     */
    public void deleteItem(int index) {
	Cart cart = new Cart();
	cart.removeItem(index);
    }

    /**
     * Modifica item.
     *
     * @param index
     *            the index
     */
    public void modificaItem(int index) {
	// TODO prendere il carrello, il nuovo periodo e tutto quello che posso
	// prendere attraverso i bean
	Date checkin = new Date();
	Date checkout = new Date();
	Periodo periodo = new Periodo(checkin, checkout);
	ItemCart itemCart = cart.getItem(index);
	if (itemCart.getStruttura().isAvailable(periodo)) {
	    itemCart.setPeriodo(periodo);
	} else {
	    // TODO data non disponibile per la struttura
	}
    }

    /**
     * Mostra carrello.
     */
    public void mostraCarrello() {
	if (cart.isEmpty()) {
	    // TODO carrello vuoto
	} else {
	    for (int index = 0; index < cart.size(); index++) {
		cart.getItem(index);
	    }
	}

    }

    /**
     * Svuota carrello.
     */
    public void svuotaCarrello() {
	if (!cart.isEmpty()) {
	    for (int index = 0; index < cart.size(); index++) {
		deleteItem(index);
	    }
	}
	mostraCarrello();
    }

}