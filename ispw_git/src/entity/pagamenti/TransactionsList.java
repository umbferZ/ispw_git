package entity.pagamenti;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class TransactionsList.
 */
public class TransactionsList implements Serializable {

    private List<Transaction> transactionsList;

    /**
     * Instantiates a new transactions list.
     */
    public TransactionsList() {
	this.transactionsList = new ArrayList<>();
    }

    /**
     * Adds the transaction.
     *
     * @param transaction
     *            the transaction
     */
    public void addTransaction(Transaction transaction) {
	this.transactionsList.add(transaction);
    }

    /**
     * Gets the transactions list.
     *
     * @return transactions list
     */
    public List<Transaction> getTransactionsList() {
	return transactionsList;
    }

    /**
     * Sets the transactions list.
     *
     * @param transactionsList
     *            the new transactions list
     */
    public void setTransactionsList(List<Transaction> transactionsList) {
	this.transactionsList = transactionsList;
    }

}