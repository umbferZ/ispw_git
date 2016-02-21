package entity;

/**
 * The Class ItemCart.
 */
public class ItemCart {

    private Periodo periodo;

    private Struttura struttura;

    /**
     * Instantiates a new item cart.
     *
     * @param struttura
     *            the struttura
     * @param periodo
     *            the periodo
     */
    public ItemCart(Struttura struttura, Periodo periodo) {
	this.struttura = struttura;
	this.periodo = periodo;

    }

    /**
     * Gets the price item.
     *
     * @return the price item
     */
    public Price getPriceItem() {
	return struttura.getPrice();
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
     * Sets the periodo.
     *
     * @param periodo
     *            the new periodo
     */
    public void setPeriodo(Periodo periodo) {
	this.periodo = periodo;
    }

}