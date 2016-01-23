package controllo;

import java.util.*;

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
	}

	/**
	 * 
	 */
	// public ListaPagamenti getListaPagamenti() {
	// return null;
	// // TODO implement here
	// }

	public ListaPagamenti generaListaPagamenti() {
		ArrayList<Prenotazione> l = this.user.getCarrello().getListPrenotazioni();
		ListaPagamenti list = new ListaPagamenti();
		for (int i = 0; i < l.size(); i++) {
			Pagamento total = l.get(i).generaPagamento();
			list.addPagamento(total);
		}
		return list;
	}

	public static void main(String[] args) {
		int code = (int) 2;
		Date start = new Date("01/14/2016");
		Date end = new Date("14/02/2016");
		User user = new User();
		KUC_09 controller = new KUC_09(user);
		System.out.println("Aggiungo struttura nel carrello...");
		controller.addCarrello(start, end, code);
		System.out.println("\tfatto!");
		System.out.println("Generazione lista pagamenti...");
		controller.generaListaPagamenti();
		System.out.println("\tfatto!");
	}
}