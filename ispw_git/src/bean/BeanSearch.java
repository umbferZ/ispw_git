package bean;

/**
 * The Class beanSearch.
 */
public class BeanSearch {

    private String keyword, checkin, checkout;

    /**
     * Gets the keyword.
     *
     * @return the keyword
     */
    public String getKeyword() {
	return this.keyword;
    }

    /**
     * Sets the keyword.
     *
     * @param keyword
     *            the new keyword
     */
    public void setKeyword(String keyword) {
	this.keyword = keyword;
    }

    /**
     * Gets the checkin.
     *
     * @return the checkin
     */
    public String getCheckin() {
	return this.checkin;
    }

    /**
     * Sets the checkin.
     *
     * @param checkin
     *            the new checkin
     */
    public void setCheckin(String checkin) {
	this.checkin = checkin;
    }

    /**
     * Gets the checkout.
     *
     * @return the checkout
     */
    public String getCheckout() {
	return this.checkout;
    }

    /**
     * Sets the checkout.
     *
     * @param checkout
     *            the new checkout
     */
    public void setCheckout(String checkout) {
	this.checkout = checkout;
    }

    public String search() {
	return "";
    }
}
