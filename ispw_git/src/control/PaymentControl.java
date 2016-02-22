package control;

import bean.PaymentBean;

/**
 * The Class PaymentControl.
 */
public class PaymentControl {

	private static PaymentControl instance = null;

	/**
	 * Gets the single instance of PaymentControl.
	 *
	 * @return single instance of PaymentControl
	 */
	public static synchronized PaymentControl getInstance() {
		if (PaymentControl.instance == null)
			instance = new PaymentControl();
		return instance;
	}

	/**
	 * Instantiates a new payment control.
	 */
	private PaymentControl() {

	}

	/*
	 * public boolean premiumAccountActivation() throws SQLException,
	 * ClassNotFoundException {
	 * 
	 * boolean x = DAO.getInstance().dbQuery("SQL REQUEST").isFirst();
	 * 
	 * try {
	 * 
	 * if (!x) {
	 * 
	 * throw new Exception("eccezione");
	 * 
	 * } else {
	 * 
	 * 
	 * //Transaction t = new Transaction(//Double price ...); //appendi
	 * transazione a listatransazioni return true; }
	 * 
	 * } catch (Exception e) { e.printStackTrace();
	 * 
	 * return false; } }
	 */

	/**
	 * Pay.
	 *
	 * @param paymentBean
	 *            the payment bean
	 * @return true, if successful
	 */
	public boolean pay(PaymentBean paymentBean) {

		boolean x = true;

		// TODO: controlla su database
		// TODO: aggiungi Eccezioni

		if (!x)
			return false;
		else
			return true;

	}

	/*
	 * public static void main(String args[]) {
	 * 
	 * //Deve esistere il file promotionsList.txt
	 * 
	 * Transaction transaction = new Transaction(100d,111,3222);
	 * TransactionsList transactionsList = new TransactionsList();
	 * LoadAndStoreObjectsOnFile transListStream = new
	 * LoadAndStoreObjectsOnFile("./transactionsList.txt"); transactionsList =
	 * (TransactionsList) transListStream.loadObject();
	 * transactionsList.addTransaction(transaction); LoadAndStoreObjectsOnFile
	 * outStream = new LoadAndStoreObjectsOnFile("./transactionsList.txt");
	 * outStream.storeObject(transactionsList); LoadAndStoreObjectsOnFile
	 * newtransListStream = new
	 * LoadAndStoreObjectsOnFile("./transactionsList.txt"); transactionsList =
	 * (TransactionsList) newtransListStream.loadObject(); for (int i=0;
	 * i<transactionsList.getTransactionsList().size();i++){
	 * System.out.println(transactionsList.getTransactionsList().get(i)); } }
	 */

	// controlla dati carte di credito

	// boolean x = controllaDati(paymentBean.getNumber(), paymentBean.getCcv());

	/*
	 * try {
	 * 
	 * if (!x) { throw new Exception("eccezione"); } else {
	 * 
	 * TransactionsList transactionsList = new TransactionsList();
	 * 
	 * //Utente utente = new Utente(); ExecutorService executor =
	 * Executors.newCachedThreadPool(); for (BeanGestioneStrutture struttura :
	 * paymentBean.getList()) { double price = struttura.getPrezzo();
	 * Transaction t = new Transaction(price, paymentBean.getNumber(), new
	 * Locatore(null, null, null, 0, null, null, 2347621).getCcNumber());
	 * 
	 * //transactionsList.serializza();
	 * 
	 * return true; } } } catch (Exception e) { System.out.println(
	 * "inserisci dati corretti"); return false; } return false; }
	 */

	/*
	 * private boolean controllaDati(int number, int ccv) { ResultSet resultSet
	 * = DAO.getInstance().dbQuery(
	 * "SELECT * FROM JAVAcanze.creditCardCheck WHERE 'ccNumber' = '" +
	 * number+"';"); try { if (resultSet.first()){ if
	 * (ccv==resultSet.getInt("ccv")){ return true; } } } catch (SQLException e)
	 * { e.printStackTrace(); return false; } finally { if (resultSet!=null){
	 * try { resultSet.close(); } catch (SQLException e) { e.printStackTrace();
	 * } } } return false; }
	 */
}