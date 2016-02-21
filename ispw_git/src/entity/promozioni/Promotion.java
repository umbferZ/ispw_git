package entity.promozioni;

import java.io.Serializable;

import entity.strutture.Struttura;

/**
 * The Class Promotion.
 */
public class Promotion implements Serializable {

    private Event evento;
    private Struttura miaStruttura;

    /**
     * Instantiates a new promotion.
     *
     * @param miaStruttura
     *            the mia struttura
     * @param evento
     *            the evento
     */
    public Promotion(Struttura miaStruttura, Event evento) {
	this.evento = evento;
	this.miaStruttura = miaStruttura;
	System.out.println("Promozione creata!");
    }

}