package bean;

import control.KUC_manageCart;

/**
 * The Class BeanItemCart.
 */
public class BeanAggiungiCarrello {
    private String checkin;
    private String checkout;
    private String idStruttura;
    private String idUser;

    public boolean validate() {
	KUC_manageCart kuc = KUC_manageCart.getIstance(this.idUser);
	if (kuc.aggiungiAlCarrello(this.idUser, this.idStruttura, this.checkin, this.checkout))
	    return true;
	return false;
    }

}
