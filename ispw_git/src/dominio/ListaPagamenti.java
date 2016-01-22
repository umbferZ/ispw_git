package dominio;

import java.util.*;

/**
 * 
 */
public class ListaPagamenti {

	/**
	 * Default constructor
	 */
	public ListaPagamenti() {
		this.listaPagamenti= new ArrayList<Pagamento>();
	}

	/**
	 * 
	 */
	private ArrayList<Pagamento> listaPagamenti;


	/**
	 * @param pagamento
	 */
	public void addPagamento(Pagamento pagamento) {
		listaPagamenti.add(pagamento);
	}

}