package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Struttura;

/**
 * The Class StrutturaDAO.
 */
public class StrutturaDAO extends DAO {

    /**
     * Find.
     *
     * @param idStruttura
     *            the id struttura
     * @return the struttura
     */
    public Struttura find(String idStruttura) {
	Struttura struttura = null;
	String sql = "SELECT * FROM strutture where idStruttura='" + idStruttura + "';";
	ResultSet rs = this.query(sql);
	String nome;
	String descrizione;
	try {
	    nome = rs.getString("nome");
	    descrizione = rs.getString("decrizione");
	    struttura = new Struttura(nome, descrizione);
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return struttura;

    }

}
