package bean;

import control.EventsControl;
import java.util.Date;

/**
 * The Class EventsBean.
 */
public class EventsBean {

    private Date date;
    private String nome, descrizione, citta, luogo, orario;

    /**
     * Cancella evento.
     *
     * @return true, if successful
     */
    public boolean cancellaEvento() {
	return EventsControl.getInstance().eliminaEvento(this);
    }

    /**
     * Crea evento.
     *
     * @return true, if successful
     */
    public boolean creaEvento() {
	return EventsControl.getInstance().creaEvento(this);
    }

    /**
     * Gets the citta.
     *
     * @return the citta
     */
    public String getCitta() {
	return citta;
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
     * Gets the descrizione.
     *
     * @return the descrizione
     */
    public String getDescrizione() {
	return descrizione;
    }

    /**
     * Gets the luogo.
     *
     * @return the luogo
     */
    public String getLuogo() {
	return luogo;
    }

    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome() {
	return nome;
    }

    /**
     * Gets the orario.
     *
     * @return the orario
     */
    public String getOrario() {
	return orario;
    }

    /**
     * Sets the citta.
     *
     * @param citta the new citta
     */
    public void setCitta(String citta) {
	this.citta = citta;
    }

    /**
     * Sets the date.
     *
     * @param date the new date
     */
    public void setDate(Date date) {
	this.date = date;
    }

    /**
     * Sets the descrizione.
     *
     * @param descrizione the new descrizione
     */
    public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
    }

    /**
     * Sets the luogo.
     *
     * @param luogo the new luogo
     */
    public void setLuogo(String luogo) {
	this.luogo = luogo;
    }

    /**
     * Sets the nome.
     *
     * @param nome the new nome
     */
    public void setNome(String nome) {
	this.nome = nome;
    }

    /**
     * Sets the orario.
     *
     * @param orario the new orario
     */
    public void setOrario(String orario) {
	this.orario = orario;
    }
}
