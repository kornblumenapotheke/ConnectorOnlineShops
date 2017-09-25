package interfaces.orders;
import java.util.Date;

public interface InterfaceAuftrag {
	// GET
	InterfaceAdress getInvoiceAdress();
	InterfaceAdress getDeliveryAdress();
	String getReferenceNumberSystem();
	Date getDatum();
	Date getUhrzeit();
	InterfaceArticleList getArticleList();
	InterfacePaymentMethod getPaymentMethod();
	//SET
	void setInvoiceAdress (InterfaceAdress inInvoiceAdress);
	void setDeliveryAdress(InterfaceAdress inDeliveryAdress);
	void setReferenceNumberSystem(String inReferenceNumberSystem);
	void setDatum(Date inDatum);
	void setUhrzeit(Date inUhrzeit);
	void setArticleList(InterfaceArticleList inArticleList);
	void setPaymentMethod(InterfacePaymentMethod setPaymentMethod);
}
