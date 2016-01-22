package dominio;

import java.util.*;

/**
 * 
 */
public class Prenotazione {

	/**
	 * Default constructor
	 */
	public Prenotazione() {
	}

	/**
	 * 
	 */
	private Periodo periodo;
	private Struttura struttura;

	/**
	 * @param struttura
	 * @param periodo
	 */
	public Prenotazione(Struttura struttura, Periodo periodo) {
		this.struttura = struttura;
		this.periodo = periodo;

		// TODO implement here
	}

	public Money getCosto() {
		//nuovo commento
		return this.struttura.getTotal();
	}

	public Pagamento generaPagamento() {
		Locatore l = this.struttura.getLocatore();
		Money m = this.struttura.getTotal();
		Pagamento p = new Pagamento(l, m);
		return p;
	}

}