package entity.pagamenti;

import java.util.Date;

/**
 * The Class Fattura.
 */
public class Fattura {

    private Date date;
    private String intestatario;
    private double prezzo;

    /**
     * Instantiates a new fattura.
     *
     * @param prezzo
     *            the prezzo
     * @param intestatario
     *            the intestatario
     * @param date
     *            the date
     */
    public Fattura(double prezzo, String intestatario, Date date) {
	this.prezzo = prezzo;
	this.intestatario = intestatario;
	this.date = date;
    }

    /**
     * Gets the date.
     *
     * @return the date
     */
    public Date getDate() {
	return date;
    }

    /**
     * Gets the intestatario.
     *
     * @return the intestatario
     */
    public String getIntestatario() {
	return intestatario;
    }

    /**
     * Gets the prezzo.
     *
     * @return the prezzo
     */
    public double getPrezzo() {
	return prezzo;
    }

    /**
     * Sets the date.
     *
     * @param date
     *            the new date
     */
    public void setDate(Date date) {
	this.date = date;
    }

    /**
     * Sets the intestatario.
     *
     * @param intestatario
     *            the new intestatario
     */
    public void setIntestatario(String intestatario) {
	this.intestatario = intestatario;
    }

    /**
     * Sets the prezzo.
     *
     * @param prezzo
     *            the new prezzo
     */
    public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
    }
}