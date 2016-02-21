package entity.strutture;

import entity.persone.Locatore;

/**
 * The Class StrutturaPrivata.
 */
public abstract class StrutturaPrivata extends Struttura {

    /**
     * Instantiates a new struttura privata.
     *
     * @param id_struttura the id_struttura
     * @param nome the nome
     * @param regione the regione
     * @param citta the citta
     * @param comune the comune
     * @param via the via
     * @param numCivic the num civic
     * @param CAP the cap
     * @param descrizione the descrizione
     * @param locatore the locatore
     */
    public StrutturaPrivata(int id_struttura, String nome, String regione, String citta, String comune, String via,
	    String numCivic, String CAP, String descrizione, Locatore locatore) {
	super(id_struttura, nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore);
    }

    /* (non-Javadoc)
     * @see entity.strutture.Struttura#serializza()
     */
    @Override
    public abstract boolean serializza();

}