package control;

import java.util.Date;

import dao.CartDAO;
import dao.StrutturaDAO;
import entity.Cart;
import entity.ItemCart;
import entity.Periodo;
import entity.Struttura;

/**
 * The Class KUC_manageCart.
 */
public class GestioneCarrelloControl {
    private static GestioneCarrelloControl istance;

    /**
     * Gets the istance.
     *
     * @return the istance
     */
    public static GestioneCarrelloControl getIstance(String idUser) {
	if (istance == null)
	    istance = new GestioneCarrelloControl(idUser);
	return istance;
    }

    private Cart cart;

    /**
     * Instantiates a new KU c_manage cart.
     */
    private GestioneCarrelloControl(String idUser) {
	cart = new CartDAO().find(idUser);
    }

    /**
     * Aggiungi al carrello.
     */
    public boolean aggiungiAlCarrello(String idStruttura, String checkin, String checkout) {

	Struttura struttura = new StrutturaDAO().find(idStruttura);
	@SuppressWarnings("deprecation")
	Date checkinDate = new Date(checkin);
	@SuppressWarnings("deprecation")
	Date checkoutDate = new Date(checkout);
	Periodo periodo = new Periodo(checkinDate, checkoutDate);
	if (struttura.isAvailable(periodo)) {
	    ItemCart itemCart = new ItemCart(struttura, periodo);
	    cart.addItem(itemCart);
	    return true;
	}
	return false;

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
    public void modificaItem(int index, String checkin, String checkout) {
	@SuppressWarnings("deprecation")
	Date checkinDate = new Date(checkin);
	@SuppressWarnings("deprecation")
	Date checkoutDate = new Date(checkout);
	Periodo periodo = new Periodo(checkinDate, checkoutDate);
	ItemCart itemCart = cart.getItem(index);
	if (itemCart.getStruttura().isAvailable(periodo))
	    itemCart.setPeriodo(periodo);
	else {
	    // TODO data non disponibile per la struttura
	}
    }

    /**
     * Mostra carrello.
     */
    public void mostraCarrello() {
	if (cart.isEmpty()) {
	    // TODO carrello vuoto
	} else
	    for (int index = 0; index < cart.size(); index++)
		cart.getItem(index);

    }

    /**
     * Svuota carrello.
     */
    public void svuotaCarrello() {
	if (!cart.isEmpty())
	    for (int index = 0; index < cart.size(); index++)
		deleteItem(index);
	mostraCarrello();
    }

}