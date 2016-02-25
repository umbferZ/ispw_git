package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.ItemCart;
import entity.Periodo;
import entity.Struttura;

/**
 * The Class ItemCartDAO.
 */
public class ItemCartDAO extends DAO {

    /**
     * Find.
     *
     * @param idCart
     *            the id cart
     * @return the item cart
     */
    public ItemCart find(String idCart) {
	ItemCart itemCart = null;
	String sql = "SELECT * FROM itemCart WHERE cart_idCart='" + idCart + "';";
	ResultSet rs = this.query(sql);

	try {
	    String idStruttura;
	    Date checkin;
	    Date checkout;
	    idStruttura = rs.getString("nome");
	    checkin = rs.getDate("decrizione");
	    checkout = rs.getDate("checkin");
	    Struttura struttura = new StrutturaDAO().find(idStruttura);
	    itemCart = new ItemCart(struttura, new Periodo(checkin, checkout));
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return itemCart;

    }

}
