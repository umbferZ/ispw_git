package entity;

import java.util.ArrayList;

/**
 * The Class Cart.
 */
public class Cart {

	private ArrayList<ItemCart> itemList;

	private Price total;

	/**
	 * Instantiates a new cart.
	 */
	public Cart() {
		itemList = new ArrayList<>();
	}

	/**
	 * Adds the item.
	 *
	 * @param itemCart
	 *            the item cart
	 */
	public void addItem(ItemCart itemCart) {
		itemList.add(itemCart);
		increasesTotal(itemCart.getPriceItem());
	}

	/**
	 * Decreases total.
	 *
	 * @param price
	 *            the price
	 */
	public void decreasesTotal(Price price) {
		total.sot(price);
	}

	/**
	 * Gets the item.
	 *
	 * @param index
	 *            the index
	 * @return item
	 */
	public ItemCart getItem(int index) {
		return itemList.get(index);
	}

	/**
	 * Increases total.
	 *
	 * @param price
	 *            the price
	 */
	public void increasesTotal(Price price) {
		total.sum(price);
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		if (itemList.size() == 0)
			return true;
		return false;

	}

	/**
	 * Removes the item.
	 *
	 * @param index
	 *            the index
	 */
	public void removeItem(int index) {
		decreasesTotal(itemList.get(index).getPriceItem());
		itemList.remove(index);

	}

	/**
	 * Size.
	 *
	 * @return int
	 */
	public int size() {
		return itemList.size();
	}

}