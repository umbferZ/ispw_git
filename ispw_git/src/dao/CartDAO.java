package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Cart;
import entity.ItemCart;

/**
 * The Class CartDAO.
 */
public class CartDAO extends DAO {

    /**
     * Find.
     *
     * @param idUser
     *            the id user
     * @return the cart
     */
    public Cart find(String idUser) {
	Cart cart = null;
	String sql = "SELECT * FROM carrello where user_idUser='" + idUser + "';";
	ResultSet rs = this.query(sql);
	try {
	    while (rs.next()) {
		String idCart = rs.getString("idCart");
		ItemCart itemCart = new ItemCartDAO().find(idCart);
		cart = new Cart();
		cart.addItem(itemCart);
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return cart;

    }
}
