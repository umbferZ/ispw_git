package dominio;

import java.util.*;

/**
 * 
 */
public class ListaPrenotazioni {

	/**
	 * Default constructor
	 */
	public ListaPrenotazioni() {
	}

	/**
	 * 
	 */
	public List<Prenotazione> listPrenotazioni;

	/**
	 * @param prenotazione
	 */
	public void addPrenotazione(Prenotazione prenotazione) {
		// TODO implement here
	}

	public ListaPagamenti generaListaPagamenti() {
		// TODO implement here
		ListaPagamenti list= new ListaPagamenti();
		for (int i=0; i<this.listPrenotazioni.size(); i++){
			listPrenotazioni.get(i);
		}
		return null;
	}

}