package interfaces.orders;

public interface InterfaceArticle {
	
	String getSKU ();
	String getName ();
	String getSize();
	String getEAN();
	Integer getAmount();
	Double getPriceBrutto();
	Double getTotalPrice();
	Double getTaxPercentage();
	Double getTaxTotal();
	Boolean isShipping (); //true wenn der Posten der Versand ist
	Boolean isPaymentfee (); //true wenn der Posten eine Gebühr für das Payment ist.

}
