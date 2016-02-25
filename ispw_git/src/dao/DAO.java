package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The Class DAO.
 */
public class DAO {

    private static String PASS = "JAVAcanze";
    private static String USER = "JAVAcanze";
    private static String DB_URL = "jdbc:mysql://localhost/JAVAcanze";

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
	try {
	    // STEP 2: loading dinamico del driver mysql
	    Class.forName("com.mysql.jdbc.Driver");

	    // STEP 3: apertura connessione
	    conn = DriverManager.getConnection(DB_URL, USER, PASS);

	    // STEP 4: creazione ed esecuzione della query
	    stmt = conn.createStatement();

	    rs = stmt.executeQuery(sql);

	    if (!rs.first()) // rs not empty
		return null;

	    rs.close();
	    stmt.close();
	    conn.close();
	} catch (SQLException se) {
	    // Errore durante l'apertura della connessione
	    se.printStackTrace();
	} catch (Exception e) {
	    // Errore nel loading del driver
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
	return rs;

    }

}
