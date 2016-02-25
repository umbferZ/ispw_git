package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;

/**
 * The Class UserDAO.
 */
public class UserDAO extends DAO {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {
	String idUser = "1";
	User user = new UserDAO().find(idUser);
	System.out.println("nome: " + user.getNome());
	System.out.println("nome: " + user.getCognome());
    }

    /**
     * Find.
     *
     * @param idUser
     *            the id user
     * @return the user
     */
    public User find(String idUser) {
	User u = null;
	String sql = "SELECT * FROM user WHERE iduser='" + idUser + "';";
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
