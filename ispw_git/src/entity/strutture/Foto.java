package entity.strutture;

import java.io.*;

/**
 * The Class Foto.
 */
public class Foto {

    private String contenutoFile;
    private String nomeFile;

    /**
     * Instantiates a new foto.
     *
     * @param nomeFile the nome file
     */
    public Foto(String nomeFile) {
	System.out.println(nomeFile);
	this.nomeFile = nomeFile;
	try {
	    this.contenutoFile = readFile();
	} catch (IOException io) {
	    io.printStackTrace();
	}
    }

    /**
     * Chk in.
     *
     * @return true, if successful
     */
    private boolean chkIn() {
	File f = new File(this.getNomeFile());
	return (f.exists() && f.canRead());
    }

    /**
     * Gets the contenuto file.
     *
     * @return the contenuto file
     */
    public String getContenutoFile() {
	return contenutoFile;
    }

    /**
     * Gets the nome file.
     *
     * @return the nome file
     */
    public String getNomeFile() {
	return nomeFile;
    }

    /**
     * Read file.
     *
     * @return the string
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public String readFile() throws IOException {
	if (chkIn()) {
	    BufferedReader in = new BufferedReader(new FileReader(this.getNomeFile()));
	    String s = new String();
	    String s2 = new String();
	    while ((s = in.readLine()) != null)
		s2 += s + "\n";
	    in.close();
	    return s2;
	}
	return "file non trovato";
    }

    /**
     * Sets the contenuto file.
     *
     * @param contenutoFile the new contenuto file
     */
    public void setContenutoFile(String contenutoFile) {
	this.contenutoFile = contenutoFile;
    }

    /**
     * Sets the nome file.
     *
     * @param nomeFile the new nome file
     */
    public void setNomeFile(String nomeFile) {
	this.nomeFile = nomeFile;
    }
}