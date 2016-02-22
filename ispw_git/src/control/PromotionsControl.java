package control;

import bean.PromotionsBean;
import entity.promozioni.Promotion;
import entity.promozioni.PromotionsList;
import persistency.LoadAndStoreObjectsOnFile;

/**
 * The Class PromotionsControl.
 */
public class PromotionsControl {

	private static PromotionsControl instance = null;

	/**
	 * Gets the single instance of PromotionsControl.
	 *
	 * @return single instance of PromotionsControl
	 */
	public static synchronized PromotionsControl getInstance() {
		if (PromotionsControl.instance == null)
			instance = new PromotionsControl();
		return instance;
	}

	/**
	 * Instantiates a new promotions control.
	 */
	public PromotionsControl() {
	}

	/**
	 * Creates the promotion.
	 *
	 * @param promotionsBean
	 *            the promotions bean
	 * @return true, if successful
	 */
	public boolean createPromotion(PromotionsBean promotionsBean) {

		// <<create>> Promotion

		Promotion promotion = new Promotion(promotionsBean.getStruttura(), promotionsBean.getEvent());
		PromotionsList promotionsList = new PromotionsList();
		LoadAndStoreObjectsOnFile promListStream = new LoadAndStoreObjectsOnFile("./promotionsList.txt");
		promotionsList = (PromotionsList) promListStream.loadObject();

		// addPromotion(Promotion: promotion) on PromotionsList

		promotionsList.addPromotion(promotion);
		LoadAndStoreObjectsOnFile outStream = new LoadAndStoreObjectsOnFile("./promotionsList.txt");
		outStream.storeObject(promotionsList);

		// oggetto Promotion serializzato su file promotionsList.txt che viene
		// aggiornato

		return true;
	}

	/**
	 * Delete promotion.
	 *
	 * @param promotionsBean
	 *            the promotions bean
	 * @return true, if successful
	 */
	public boolean deletePromotion(PromotionsBean promotionsBean) {

		// <<create>> Promotion

		Promotion promotion = new Promotion(promotionsBean.getStruttura(), promotionsBean.getEvent());

		// load PromotionsList

		PromotionsList promotionsList = new PromotionsList();
		LoadAndStoreObjectsOnFile promListStream = new LoadAndStoreObjectsOnFile("./promotionsList.txt");
		promotionsList = (PromotionsList) promListStream.loadObject();

		// removePromotion(Promotion: promotion) on PromotionsList

		promotionsList.deletePromotion(promotion);
		LoadAndStoreObjectsOnFile outStream = new LoadAndStoreObjectsOnFile("./promotionsList.txt");
		outStream.storeObject(promotionsList);

		// oggetto Promotion serializzato su file promotionsList.txt che viene
		// aggiornato

		return true;
	}

	/*
	 * public static void main(String args[]) {
	 * 
	 * //Deve esistere il file promotionsList.txt
	 * 
	 * Promotion promotion = new Promotion("test", "test"); PromotionsList
	 * promotionsList = new PromotionsList(); LoadAndStoreObjectsOnFile
	 * promListStream = new
	 * LoadAndStoreObjectsOnFile("./file/promotionsList.txt"); promotionsList =
	 * (PromotionsList) promListStream.loadObject();
	 * promotionsList.addPromotion(promotion); LoadAndStoreObjectsOnFile
	 * outStream = new LoadAndStoreObjectsOnFile("./promotionsList.txt");
	 * outStream.storeObject(promotionsList); }
	 */

}