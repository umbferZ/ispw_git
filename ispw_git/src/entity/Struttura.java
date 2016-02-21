package entity;

import java.util.ArrayList;

/**
 * The Class Struttura.
 */
public class Struttura {

    private ArrayList<Periodo> bookingList;

    private Price price;

    /**
     * Instantiates a new struttura.
     */
    public Struttura() {
	bookingList = new ArrayList<>();
    }

    /**
     * Gets the price.
     *
     * @return the price
     */
    public Price getPrice() {
	return price;
    }

    /**
     * Checks if is available.
     *
     * @param periodo
     *            the periodo
     * @return true, if is available
     */
    public boolean isAvailable(Periodo periodo) {
	for (Periodo booking : bookingList) {
	    if (periodo.isIn(booking)) {
		return false;
	    }
	}
	return true;
    }

}