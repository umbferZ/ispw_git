package dominio;

import java.util.*;

/**
 * 
 */
public class Struttura {

	/**
	 * Default constructor
	 */
	public Struttura(int code) {
		this.costo = new Money();
		this.listaServizi = new ArrayList<Servizio>();
		this.locatore = new Locatore();
		for (int i = 0; i < 10; i++) {
			Servizio s = new Servizio();
			listaServizi.add(s);
		}
		this.name = String.format("Struttura_%d", code);
				
	}

	private Money costo;

	private ArrayList<Servizio> listaServizi;

	private String name;

	private Locatore locatore;

	/**
	 * @param code
	 */
	public Struttura() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Locatore getLocatore() {
		return locatore;
	}

	/**
	 * @return
	 */
	public Money getTotal() {
		Money m = new Money();
		m.addMoney(costo);
		for (int i = 0; i < listaServizi.size(); i++) {
			m.addMoney(listaServizi.get(i).getCosto());
		}
		return m;
	}

	public String getName() {
		return name;
	}

}