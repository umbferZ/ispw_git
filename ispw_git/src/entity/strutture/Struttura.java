package entity.strutture;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.persone.Locatore;
import persistency.DAO;

/**
 * The Class Struttura.
 */
public abstract class Struttura {

	private String descrizione;
	private int id_struttura;

	private Indirizzo indirizzo;

	private Locatore locatore;

	private String nome;

	/**
	 * Instantiates a new struttura.
	 *
	 * @param id_struttura
	 *            the id_struttura
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
	 */
	public Struttura(int id_struttura, String nome, String regione, String citta, String comune, String via,
			String numCivic, String CAP, String descrizione, Locatore locatore) {
		this.id_struttura = id_struttura;
		this.nome = nome;
		this.indirizzo = new Indirizzo(regione, citta, comune, via, numCivic, CAP);
		this.descrizione = descrizione;
		this.locatore = locatore;
	}

	/**
	 * Gets the descrizione.
	 *
	 * @return descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * Gets the id_struttura.
	 *
	 * @return id_struttura
	 */
	public int getId_struttura() {
		return id_struttura;
	}

	/**
	 * Gets the indirizzo.
	 *
	 * @return indirizzo
	 */
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	/**
	 * Gets the locatore.
	 *
	 * @return locatore
	 */
	public Locatore getLocatore() {
		return locatore;
	}

	/**
	 * Gets the nome.
	 *
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Reperisci id struttura.
	 *
	 * @return int
	 */
	public int reperisciIDStruttura() {
		ResultSet rs = DAO.getInstance().dbQuery("", ""); // reperisci l'id
		// della
		// struttura appena
		// inserita
		try {
			if (rs.first())
				try {
					rs.getInt("idstrutture");
				} catch (SQLException e) {
					e.printStackTrace();
					return 0;

				} finally {
					try {
						if (rs != null)
							rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		return 0;
	}

	/**
	 * Serializza.
	 *
	 * @return true, if successful
	 */
	public abstract boolean serializza();

	/**
	 * Serializza struttura.
	 *
	 * @return true, if successful
	 */
	public boolean serializzaStruttura() {
		this.getNome();
		this.getIndirizzo().getRegione();
		this.getIndirizzo().getCitta();
		this.getIndirizzo().getComune();
		this.getIndirizzo().getVia();
		this.getIndirizzo().getNumCivic();
		this.getIndirizzo().getCAP();
		this.getDescrizione();
		this.getLocatore().getId_utenteRegistrato();
		// DB.getInstance().insert("hotel", label, value);
		return true;
	}

	/**
	 * Sets the descrizione.
	 *
	 * @param descrizione
	 *            the new descrizione
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * Sets the id_struttura.
	 *
	 * @param id_struttura
	 *            the new id_struttura
	 */
	public void setId_struttura(int id_struttura) {
		this.id_struttura = id_struttura;
	}

	/**
	 * Sets the indirizzo.
	 *
	 * @param indirizzo
	 *            the new indirizzo
	 */
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	/**
	 * Sets the locatore.
	 *
	 * @param locatore
	 *            the new locatore
	 */
	public void setLocatore(Locatore locatore) {
		this.locatore = locatore;
	}

	/**
	 * Sets the nome.
	 *
	 * @param nome
	 *            the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}