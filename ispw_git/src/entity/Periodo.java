package entity;

import java.util.Date;

/**
 * The Class Periodo.
 */
public class Periodo {

    private Date checkin;

    private Date checkout;

    /**
     * Instantiates a new periodo.
     *
     * @param checkin
     *            the checkin
     * @param checkout
     *            the checkout
     */
    public Periodo(Date checkin, Date checkout) {
	this.checkin = checkin;
	this.checkout = checkout;
    }

    /**
     * Checks if is in.
     *
     * @param anotherPeriod
     *            the another period
     * @return true, if is in
     */
    public boolean isIn(Periodo anotherPeriod) {
	if (this.checkin.compareTo(anotherPeriod.checkin) <= 0 && this.checkout.compareTo(anotherPeriod.checkin) <= 0) {
	    return true;
	}
	if (this.checkin.compareTo(anotherPeriod.checkout) >= 0
		&& this.checkout.compareTo(anotherPeriod.checkout) >= 0) {
	    return true;
	}
	return false;
    }

}