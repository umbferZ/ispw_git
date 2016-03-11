package dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.rowset.CachedRowSet;

import com.sun.rowset.CachedRowSetImpl;

/**
 * The Class DAO.
 */
public class DAO {

    private static String DB_URL = "jdbc:mysql://localhost/JAVAcanze";
    private static String PASS = "JAVAcanze";
    private static String USER = "JAVAcanze";

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {
	DAO dao = new DAO();
	ResultSet rs = dao.query("SELECT * FROM user");

	try {
	    while (rs.next()) {
		String s = "nome: " + rs.getString("nome");
		s += " cognome: " + rs.getString("cognome");
		s += " email: " + rs.getString("email");
		s += " username: " + rs.getString("username");
		s += " password: " + rs.getString("password");
		System.out.println(s);
	    }

	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    /**
     * Query.
     *
     * @param sql
     *            the sql
     * @return the result set
     */

    public final ResultSet query(String sql) {
	// STEP 1: dichiarazioni
	Statement stmt = null;
	Connection conn = null;
	ResultSet rs = null;
	CachedRowSet rowset = null;
	try {
	    Class.forName("com.mysql.jdbc.Driver");

	    conn = DriverManager.getConnection(DB_URL, USER, PASS);

	    stmt = conn.createStatement();

	    rs = stmt.executeQuery(sql);

	    rowset = new CachedRowSetImpl();
	    rowset.populate(rs);

	    if (!rs.first()) // rs not empty
		return null;
	    rs.close();
	    stmt.close();
	    conn.close();
	} catch (SQLException se) {
	    /*
	     * Errore durante l'apertura della connessione
	     */
	    se.printStackTrace();
	} catch (Exception e) {
	    /*
	     * Errore nel loading del driver
	     */
	    e.printStackTrace();
	} finally {
	    try {
		if (stmt != null)
		    stmt.close();
	    } catch (SQLException se2) {
	    }
	    try {
		if (conn != null)
		    conn.close();
	    } catch (SQLException se) {
		se.printStackTrace();
	    }
	}
	return rowset;
    }

}
