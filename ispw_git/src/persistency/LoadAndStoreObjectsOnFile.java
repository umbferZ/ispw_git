package persistency;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * The Class LoadAndStoreObjectsOnFile.
 */
public class LoadAndStoreObjectsOnFile implements Serializable {

    private String path;

    /**
     * Instantiates a new load and store objects on file.
     *
     * @param path
     *            the path
     */
    public LoadAndStoreObjectsOnFile(String path) {
	this.path = path;
    }

    /**
     * Load object.
     *
     * @return object
     */
    public Object loadObject() {
	try {
	    ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File(path)));
	    Object object = stream.readObject();
	    stream.close();
	    return object;
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
	return null;
    }

    /**
     * Store object.
     *
     * @param obj
     *            the obj
     */
    public void storeObject(Object obj) {

	try {
	    ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(new File(path)));
	    s.writeObject(obj);
	    s.flush();
	    s.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    /*
     * public static void main(String args[]) { ArrayList<String> l = new
     * ArrayList<String>(); l.add("primo"); l.add("secondo"); l.add("terzo");
     * 
     * LoadAndStoreObjectsOnFile s = new LoadAndStoreObjectsOnFile("./ser.txt");
     * s.storeObject(l);
     * 
     * LoadAndStoreObjectsOnFile s1 = new
     * LoadAndStoreObjectsOnFile("./ser.txt"); ArrayList<String> l1 =
     * (ArrayList<String>) s1.loadObject(); for (int i=0; i<l1.size();i++){
     * System.out.println(l1.get(i)); }
     * 
     * Transaction t= new Transaction(192834d, 10000,1000 ); TransactionsList
     * transactionsList = new TransactionsList();
     * transactionsList.addTransaction(t); LoadAndStoreObjectsOnFile s2= new
     * LoadAndStoreObjectsOnFile("./transaction.txt");
     * s2.storeObject(transactionsList); }
     */

}
