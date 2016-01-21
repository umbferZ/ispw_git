package controllo;

import java.util.*;

import UC_09.dominio.ListaPagamenti;
import dominio.*;

/**
 * 
 */
public class KUC_09 {
	private User user;

	/**
	 * Default constructor
	 */
	public KUC_09(User user) {
		this.user = user;
	}

	/**
	 * 
	 */
	public void addCarrello(Date start, Date end, int code) {
		Periodo periodo = new Periodo(start, end);
		Struttura struttura = new Struttura(code);
		Prenotazione prenotazione = new Prenotazione(struttura, periodo);
		this.user.getCarrello().addPrenotazione(prenotazione);
		System.out.println("COMPLIMENTI!\nhai aggiunto una nuova struttura al tuo carrello");
	}
	
	/**
	 * 
	 */
	public ListaPagamenti getListaPagamenti() {
		return null;
		// TODO implement here
	}

}