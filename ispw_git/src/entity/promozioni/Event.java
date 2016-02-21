package entity.promozioni;

import java.util.Date;

/**
 * The Class Event.
 */
public class Event {

    private Date date;
    private String nome, descrizione, citta, luogo, orario;

    /**
     * Instantiates a new event.
     *
     * @param nome
     *            the nome
     * @param descrizione
     *            the descrizione
     * @param citta
     *            the citta
     * @param luogo
     *            the luogo
     * @param orario
     *            the orario
     * @param date
     *            the date
     */
    public Event(String nome, String descrizione, String citta, String luogo, String orario, Date date) {
	this.nome = nome;
	this.descrizione = descrizione;
	this.citta = citta;
	this.luogo = luogo;
	this.orario = orario;
	this.date = date;
    }
}