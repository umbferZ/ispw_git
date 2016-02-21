package entity.promozioni;

import java.io.Serializable;
import java.util.*;

/**
 * The Class PromotionsList.
 */

public class PromotionsList implements Serializable {

    private List<Promotion> promotionsList;

    /**
     * Instantiates a new promotions list.
     */
    public PromotionsList() {
	this.promotionsList = new ArrayList<>();
    }

    /**
     * Adds the promotion.
     *
     * @param promotion the promotion
     */
    public void addPromotion(Promotion promotion) {
	this.promotionsList.add(promotion);
    }

    /**
     * Delete promotion.
     *
     * @param promotion the promotion
     */
    public void deletePromotion(Promotion promotion) {
	this.promotionsList.remove(promotion);
    }

    /**
     * Gets the promotions list.
     *
     * @return the promotions list
     */
    public List<Promotion> getPromotionsList() {
	return promotionsList;
    }

    /**
     * Sets the promotions list.
     *
     * @param promotionsList the new promotions list
     */
    public void setPromotionsList(List<Promotion> promotionsList) {
	this.promotionsList = promotionsList;
    }

}