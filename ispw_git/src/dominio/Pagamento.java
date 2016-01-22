package dominio;

import java.util.*;

/**
 * 
 */
public class Pagamento {

	/**
	 * Default constructor
	 */
	public Pagamento() {
	}

	private Money costo;

	private String causale;

	private Locatore locatore;

	/**
	 * @param ricevente
	 * @param costo
	 * @param causale
	 */
	public Pagamento(Locatore ricevente, Money costo, String causale) {
		this.costo = costo;
		this.causale = causale;
		this.locatore = locatore;
	}

	/**
	 * @param ricevente
	 * @param costo
	 */
	public Pagamento(Locatore ricevente, Money costo) {
		this(ricevente, costo, "");
	}

}