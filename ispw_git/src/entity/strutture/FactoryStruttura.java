package entity.strutture;

import entity.persone.Locatore;

/**
 * The Class FactoryStruttura.
 */
public class FactoryStruttura {

    /**
     * 
     */
    private static FactoryStruttura istanzaFactoryStruttura = new FactoryStruttura();

    /**
     * Gets the istanza factory struttura.
     *
     * @return the istanza factory struttura
     */
    public static FactoryStruttura getIstanzaFactoryStruttura() {
	return istanzaFactoryStruttura;
    }

    /**
     * Sets the istanza factory struttura.
     *
     * @param istanzaFactoryStruttura
     *            the new istanza factory struttura
     */
    public static void setIstanzaFactoryStruttura(FactoryStruttura istanzaFactoryStruttura) {
	FactoryStruttura.istanzaFactoryStruttura = istanzaFactoryStruttura;
    }

    /**
     * Instantiates a new factory struttura.
     */
    private FactoryStruttura() {
    }

    /**
     * Crea albergo.
     *
     * @param nome
     *            the nome
     * @param regione
     *            the regione
     * @param citta
     *            the citta
     * @param comune
     *            the comune
     * @param via
     *            the via
     * @param numCivic
     *            the num civic
     * @param CAP
     *            the cap
     * @param descrizione
     *            the descrizione
     * @param locatore
     *            the locatore
     * @param stelle
     *            the stelle
     * @param camereTotali
     *            the camere totali
     * @param numSingole
     *            the num singole
     * @param numMatrimoniali
     *            the num matrimoniali
     * @param numTriple
     *            the num triple
     * @param prezzoSingole
     *            the prezzo singole
     * @param prezzoMatrimoniali
     *            the prezzo matrimoniali
     * @param prezzoTriple
     *            the prezzo triple
     * @return albergo
     */
    public Albergo creaAlbergo(String nome, String regione, String citta, String comune, String via, String numCivic,
	    String CAP, String descrizione, Locatore locatore, String stelle, int camereTotali, int numSingole,
	    int numMatrimoniali, int numTriple, double prezzoSingole, double prezzoMatrimoniali, double prezzoTriple) {
	return new Albergo(0, nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore, stelle,
		camereTotali, numSingole, numMatrimoniali, numTriple, prezzoSingole, prezzoMatrimoniali, prezzoTriple);
    }

    /**
     * Crea appartamento.
     *
     * @param nome
     *            the nome
     * @param regione
     *            the regione
     * @param citta
     *            the citta
     * @param comune
     *            the comune
     * @param via
     *            the via
     * @param numCivic
     *            the num civic
     * @param CAP
     *            the cap
     * @param descrizione
     *            the descrizione
     * @param locatore
     *            the locatore
     * @param numCamere
     *            the num camere
     * @param numBagni
     *            the num bagni
     * @param prezzo
     *            the prezzo
     * @return appartamento
     */
    public Appartamento creaAppartamento(String nome, String regione, String citta, String comune, String via,
	    String numCivic, String CAP, String descrizione, Locatore locatore, int numCamere, int numBagni,
	    double prezzo) {
	return new Appartamento(0, nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore, numCamere,
		numBagni, prezzo);
    }

    /**
     * Crea residence.
     *
     * @param nome
     *            the nome
     * @param regione
     *            the regione
     * @param citta
     *            the citta
     * @param comune
     *            the comune
     * @param via
     *            the via
     * @param numCivic
     *            the num civic
     * @param CAP
     *            the cap
     * @param descrizione
     *            the descrizione
     * @param locatore
     *            the locatore
     * @param prezzo
     *            the prezzo
     * @param appartamentiTotali
     *            the appartamenti totali
     * @param appartamentiDisponibili
     *            the appartamenti disponibili
     * @return residence
     */
    public Residence creaResidence(String nome, String regione, String citta, String comune, String via,
	    String numCivic, String CAP, String descrizione, Locatore locatore, double prezzo, int appartamentiTotali,
	    int appartamentiDisponibili) {
	return new Residence(0, nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore, prezzo,
		appartamentiTotali, appartamentiDisponibili);
    }

    /**
     * Crea struttura.
     *
     * @param tipoStruttura
     *            the tipo struttura
     * @param nome
     *            the nome
     * @param regione
     *            the regione
     * @param citta
     *            the citta
     * @param comune
     *            the comune
     * @param via
     *            the via
     * @param numCivic
     *            the num civic
     * @param CAP
     *            the cap
     * @param descrizione
     *            the descrizione
     * @param locatore
     *            the locatore
     * @param stelle
     *            the stelle
     * @param camereTotali
     *            the camere totali
     * @param numSingole
     *            the num singole
     * @param numMatrimoniali
     *            the num matrimoniali
     * @param numTriple
     *            the num triple
     * @param prezzoSingole
     *            the prezzo singole
     * @param prezzoMatrimoniali
     *            the prezzo matrimoniali
     * @param prezzoTriple
     *            the prezzo triple
     * @param numCamere
     *            the num camere
     * @param numBagni
     *            the num bagni
     * @param prezzo
     *            the prezzo
     * @param appartamentiTotali
     *            the appartamenti totali
     * @param appartamentiDisponibili
     *            the appartamenti disponibili
     * @return struttura
     */
    public Struttura creaStruttura(TipoStruttura tipoStruttura, String nome, String regione, String citta,
	    String comune, String via, String numCivic, String CAP, String descrizione, Locatore locatore,
	    String stelle, int camereTotali, int numSingole, int numMatrimoniali, int numTriple, double prezzoSingole,
	    double prezzoMatrimoniali, double prezzoTriple, int numCamere, int numBagni, double prezzo,
	    int appartamentiTotali, int appartamentiDisponibili) {
	switch (tipoStruttura) {
	case APPARTAMENTO:
	    return creaAppartamento(nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore, numCamere,
		    numBagni, prezzo);
	case HOTEL:
	    return creaAlbergo(nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore, stelle,
		    camereTotali, numSingole, numMatrimoniali, numTriple, prezzoSingole, prezzoMatrimoniali,
		    prezzoTriple);
	case RESIDENCE:
	    return creaResidence(nome, regione, citta, comune, via, numCivic, CAP, descrizione, locatore, prezzo,
		    appartamentiTotali, appartamentiDisponibili);
	}

	return null;
    }

}