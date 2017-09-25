import java.util.Date;

public interface InterfaceAuftrag {
	InterfaceAdress invoiceAdress;
	InterfaceAdress deliveryAdress;
	String referenceNumberSystem;
	Date datum;
	Date uhrzeit;
	InterfaceArticleList articleList;
	InterfacePaymentMethod paymentMethod;
}
