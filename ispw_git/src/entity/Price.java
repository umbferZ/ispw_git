package entity;

/**
 * The Class Price.
 */
public class Price {

    private char currency;

    private double value;

    /**
     * Instantiates a new price.
     */
    public Price() {
    }

    /**
     * Sot.
     *
     * @param price
     *            the price
     */
    public void sot(Price price) {
	value -= price.value;
    }

    /**
     * Sum.
     *
     * @param price
     *            the price
     */
    public void sum(Price price) {
	value += price.value;
    }
}