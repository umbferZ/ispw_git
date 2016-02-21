package entity.pagamenti;

import java.io.Serializable;

/**
 * The Class Transaction.
 */
public class Transaction implements Serializable {

    private int locatoreCCNumber;
    private Double price;
    private int userCCNumber;

    /**
     * Instantiates a new transaction.
     *
     * @param price the price
     * @param locatoreCCNumber the locatore cc number
     * @param userCCNumber the user cc number
     */
    public Transaction(double price, int locatoreCCNumber, int userCCNumber) {
	this.price = price;
	this.locatoreCCNumber = locatoreCCNumber;
	this.userCCNumber = userCCNumber;
	System.out.println("OK");
    }

    /**
     * Gets the locatore cc number.
     *
     * @return the locatore cc number
     */
    public int getLocatoreCCNumber() {
	return locatoreCCNumber;
    }

    /**
     * Gets the price.
     *
     * @return the price
     */
    public double getPrice() {
	return price;
    }

    /**
     * Gets the user cc number.
     *
     * @return the user cc number
     */
    public int getUserCCNumber() {
	return userCCNumber;
    }

    /**
     * Sets the locatore cc number.
     *
     * @param locatoreCCNumber the new locatore cc number
     */
    public void setLocatoreCCNumber(int locatoreCCNumber) {
	this.locatoreCCNumber = locatoreCCNumber;
    }

    /**
     * Sets the price.
     *
     * @param price the new price
     */
    public void setPrice(double price) {
	this.price = price;
    }

    /**
     * Sets the user cc number.
     *
     * @param userCCNumber the new user cc number
     */
    public void setUserCCNumber(int userCCNumber) {
	this.userCCNumber = userCCNumber;
    }
}