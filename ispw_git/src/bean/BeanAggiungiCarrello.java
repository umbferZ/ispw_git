package bean;

import control.GestioneCarrelloControl;

/**
 * The Class BeanItemCart.
 */
public class BeanAggiungiCarrello {
    private String checkin;
    private String checkout;
    private String idStruttura;
    private String idUser;

    public boolean validate() {
	GestioneCarrelloControl controller = GestioneCarrelloControl.getIstance(this.idUser);
	if (controller.aggiungiAlCarrello(this.idStruttura, this.checkin, this.checkout))
	    return true;
	return false;
    }

}
