package bean;

/**
 * The Class BeanSearch.
 */
public class BeanSearch {

    private String keyword, checkin, checkout;

    /**
     * Gets the checkin.
     *
     * @return the checkin
     */
    public String getCheckin() {
	return this.checkin;
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
     * Gets the keyword.
     *
     * @return the keyword
     */
    public String getKeyword() {
	return this.keyword;
    }

    /**
     * Search.
     *
     * @return the string
     */
    public String search() {
	return keyword + " " + checkin + " " + checkout;
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
     * Sets the checkout.
     *
     * @param checkout
     *            the new checkout
     */
    public void setCheckout(String checkout) {
	this.checkout = checkout;
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
}
