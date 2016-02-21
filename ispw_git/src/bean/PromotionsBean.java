package bean;

import control.PromotionsControl;
import entity.promozioni.Event;
import entity.strutture.Struttura;

/**
 * The Class PromotionsBean.
 */
public class PromotionsBean {

    private Event event;
    private Struttura struttura;

    /**
     * Instantiates a new promotions bean.
     */
    public PromotionsBean() {
    }

    /**
     * Cancella promozione.
     *
     * @return true, if successful
     */
    public boolean cancellaPromozione() {
	return PromotionsControl.getInstance().deletePromotion(this);
    }

    /**
     * Crea promozione.
     *
     * @return true, if successful
     */
    public boolean creaPromozione() {
	return PromotionsControl.getInstance().createPromotion(this);
    }

    /**
     * Gets the event.
     *
     * @return the event
     */
    public Event getEvent() {
	return event;
    }

    /**
     * Gets the struttura.
     *
     * @return the struttura
     */
    public Struttura getStruttura() {
	return struttura;
    }

    /**
     * Sets the event.
     *
     * @param event the new event
     */
    public void setEvent(Event event) {
	this.event = event;
    }

    /**
     * Sets the struttura.
     *
     * @param struttura the new struttura
     */
    public void setStruttura(Struttura struttura) {
	this.struttura = struttura;
    }
}
