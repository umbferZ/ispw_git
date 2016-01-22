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
		listPrenotazioni= new ArrayList<>();
	}
	
	private ArrayList<Prenotazione> listPrenotazioni;

	public void addPrenotazione(Prenotazione prenotazione) {
		listPrenotazioni.add(prenotazione);
	}

	public ArrayList<Prenotazione> getListPrenotazioni() {
		return listPrenotazioni;
	}



}