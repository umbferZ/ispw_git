package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;

/**
 * The Class UserDAO.
 */
public class UserDAO extends DAO {

    /**
     * Find.
     *
     * @param idUser
     *            the id user
     * @return the user
     */
    public User find(String idUser) {
	User u = null;
	String sql = "SELECT * FROM user where idUser='" + idUser + "';";
	ResultSet rs = this.query(sql);
	String nome;
	String cognome;
	try {
	    nome = rs.getString("nome");
	    cognome = rs.getString("cognome");
	    u = new User(nome, cognome);
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return u;

    }
}
