package bean;

import control.PaymentControl;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * The Class PaymentBean.
 */
public class PaymentBean implements Serializable {

    private int ccv;

    private ArrayList<BeanGestioneStrutture> list;

    private String name;
    private int number;

    /**
     * Instantiates a new payment bean.
     */
    public PaymentBean() {
	this.list = new ArrayList<BeanGestioneStrutture>();
	list.add(new BeanGestioneStrutture("Viale Carducci, 76, 47841 Cattolica, Italia, Cattolica RN",
		"Hotel Carducci 76, Cattolica (RN) &#x2605; &#x2605; &#x2605; &#x2605;", "Wi-Fi; Colazione",
		"20/06/2016", "22/06/2016", 128.00, 2));
	list.add(new BeanGestioneStrutture("Via Della Vite 14, Spagna, 00187 Roma",
		"Infinity Hotel &#x2605; &#x2605; &#x2605;", "Pensione completa", "22/06/2016", "27/06/2016", 173.50,
		2));
	list.add(new BeanGestioneStrutture("Calle Priuli Dei Cavalletti, 73-74, Cannaregio, 30121 Venezia, Italia",
		"Hotel Dolomiti &#x2605; &#x2605;", "servizi no", "27/06/2016", "29/06/2016", 141.00, 2));
    }

    /**
     * Gets the ccv.
     *
     * @return the ccv
     */
    public int getCcv() {
	return ccv;
    }

    /**
     * Gets the list.
     *
     * @return the list
     */
    public ArrayList<BeanGestioneStrutture> getList() {
	return list;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * Gets the number.
     *
     * @return the number
     */
    public int getNumber() {
	return number;
    }

    /**
     * Paga.
     *
     * @return true, if successful
     */
    public boolean paga() {
	return PaymentControl.getInstance().pay(this);
    }

    /**
     * Sets the ccv.
     *
     * @param ccv the new ccv
     */
    public void setCcv(int ccv) {
	this.ccv = ccv;
    }

    /**
     * Sets the list.
     *
     * @param list the new list
     */
    public void setList(ArrayList<BeanGestioneStrutture> list) {
	this.list = list;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * Sets the number.
     *
     * @param number the new number
     */
    public void setNumber(int number) {
	this.number = number;
    }

    // get e set price

}
