package entity;

import java.util.ArrayList;

/**
 * The Class Struttura.
 */
public class Struttura {
    private ArrayList<Periodo> bookingList;
    private String descrizione;
    private String nome;

    private Price price;

    /**
     * Instantiates a new struttura. private ArrayList<Periodo> bookingList;
     */
    public Struttura(String nome, String descrizione) {
	this.nome = nome;
	this.descrizione = descrizione;
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
	for (Periodo booking : bookingList)
	    if (periodo.isIn(booking))
		return false;
	return true;
    }

}