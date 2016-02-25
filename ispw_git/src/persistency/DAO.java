package persistency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The Class DAO.
 */
public class DAO {
    private static DAO instance = null;

    /**
     * Gets the single instance of DAO.
     *
     * @return single instance of DAO
     */
    public static synchronized DAO getInstance() {
	if (DAO.instance == null)
	    instance = new DAO();
	return instance;
    }

    private final String DB_NAME = "jdbc:mysql://localhost:3306/JAVAcanze";
    private final String DB_PSW = "JAVAcanze";

    private final String DB_USER = "JAVAcanze";

    /**
     * Instantiates a new dao.
     */
    private DAO() {
    }

    /**
     * Array to string.
     *
     * @param array
     *            the array
     * @return string
     */
    private String arrayToString(Object[] array) {
	String str = new String();
	for (int i = 0; i < array.length - 1; i++)
	    if (array[i] instanceof String)
		str += "'" + array[i].toString() + "',";
	    else
		str += array[i].toString() + ",";
	if (array[array.length - 1] instanceof String)
	    str += "`" + array[array.length - 1].toString() + "`";
	else
	    str += array[array.length - 1].toString();
	return str;
    }

    /**
     * Array to string.
     *
     * @param array
     *            the array
     * @return string
     */
    private String arrayToString(String[] array) {
	String str = new String();
	for (int i = 0; i < array.length - 1; i++)
	    str += "`" + array[i].toString() + "`,";
	str += "`" + array[array.length - 1].toString() + "`";
	return str;
    }

    /**
     * Array to string.
     *
     * @param arrayLabel
     *            the array label
     * @param arrayValue
     *            the array value
     * @return string
     */
    private String arrayToString(String[] arrayLabel, Object[] arrayValue) {
	String str = new String();
	try {
	    if (arrayLabel.length != arrayValue.length)
		throw new Exception();
	} catch (Exception e) {
	    return "";
	}
	for (int i = 0; i < arrayLabel.length; i++) {
	    str += "`" + arrayLabel[i].toString() + "`=";
	    if (arrayValue[i] instanceof String)
		str += "'" + arrayValue[i].toString() + "'";
	    else
		str += arrayValue[i].toString();
	    if (i != arrayLabel.length - 1)
		str += " AND ";
	}
	return str;
    }

    /**
     * Db query.
     *
     * @param request
     *            the request
     * @param table
     *            the table
     * @return result set
     */
    public ResultSet dbQuery(String request, String table) {
	Statement stmt = null;
	Connection conn = null;
	ResultSet resultSet = null;
	String sql = "SELECT " + request + " FROM " + table + ";";
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    conn = DriverManager.getConnection(DB_NAME, DB_PSW, DB_USER);
	    stmt = conn.createStatement();
	    stmt.executeQuery(sql);
	    resultSet = stmt.getResultSet();
	    stmt.close();
	    conn.close();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	    return null;
	} catch (SQLException e) {
	    e.printStackTrace();
	    return null;
	} finally {
	    if (stmt != null)
		try {
		    stmt.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    if (conn != null)
		try {
		    conn.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}
	return resultSet;
    }

    /**
     * Db query.
     *
     * @param requestLabel
     *            the request label
     * @param table
     *            the table
     * @param checkLabel
     *            the check label
     * @param checkValues
     *            the check values
     * @return result set
     */
    public ResultSet dbQuery(String[] requestLabel, String table, String[] checkLabel, Object[] checkValues) {
	Statement stmt = null;
	Connection conn = null;
	ResultSet resultSet = null;
	String sql = "SELECT " + arrayToString(requestLabel) + " FROM " + table + " WHERE "
		+ arrayToString(checkLabel, checkValues) + ";";
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    conn = DriverManager.getConnection(DB_NAME, DB_PSW, DB_USER);
	    stmt = conn.createStatement();
	    stmt.executeQuery(sql);
	    resultSet = stmt.getResultSet();
	    stmt.close();
	    conn.close();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	    return null;
	} catch (SQLException e) {
	    e.printStackTrace();
	    return null;
	} finally {
	    if (stmt != null)
		try {
		    stmt.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    if (conn != null)
		try {
		    conn.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}
	return resultSet;
    }

    /**
     * Db update.
     *
     * @param sql
     *            the sql
     * @return true, if successful
     */
    public boolean dbUpdate(String sql) {
	Statement stmt = null;
	Connection conn = null;
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    conn = DriverManager.getConnection(DB_NAME, DB_PSW, DB_USER);
	    stmt = conn.createStatement();
	    stmt.executeUpdate(sql);
	    stmt.close();
	    conn.close();
	} catch (SQLException e) {
	    return false;
	} catch (Exception e) {
	    return false;
	} finally {
	    if (stmt != null)
		try {
		    stmt.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    if (conn != null)
		try {
		    conn.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}
	return true;
    }

    /**
     * Insert.
     *
     * @param table
     *            the table
     * @param label
     *            the label
     * @param value
     *            the value
     */
    public void insert(String table, String[] label, Object[] value) {
	Statement stmt = null;
	Connection conn = null;
	try {
	    String sql = "INSERT INTO " + table + "(" + arrayToString(label) + ") VALUES (" + arrayToString(value)
		    + ")";
	    Class.forName("com.mysql.jdbc.Driver");
	    conn = DriverManager.getConnection(DB_NAME, DB_PSW, DB_USER);
	    stmt = conn.createStatement();
	    stmt.executeUpdate(sql);
	    stmt.close();
	    conn.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    if (stmt != null)
		try {
		    stmt.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    if (conn != null)
		try {
		    conn.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}
    }
}
