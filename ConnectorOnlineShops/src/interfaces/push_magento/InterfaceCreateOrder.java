package interfaces.push_magento;

import interfaces.orders.InterfaceAdress;
import interfaces.orders.InterfaceArticle;
import interfaces.orders.InterfaceArticleList;
import interfaces.orders.InterfacePaymentMethod;

/**
 * Creates a new Order in Magento
 * @author gunther
 *
 */
public interface InterfaceCreateOrder {
	boolean isValid ();
	void addArticle(InterfaceArticle inArticle);
	void addArticleList (InterfaceArticleList inArticleList);
	void addAdresses(InterfaceAdress inAdress);
	void addPaymentMethod (InterfacePaymentMethod inPaymentMethod);
	void insertNow();
}
