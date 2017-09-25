package interfaces.orders;

import java.util.Date;

public interface InterfacePaymentMethod {
	
	void setPaymentMethod (String inPaymentMethod);
	void setReferenceNumber (String inReferenceNumber);
	void setAmountPaid (String inAmountPaid);
	void setAdditionalInfo (String inAdditionalInfo);
	void setTime (Date inTime);
	void setDate (Date inDate);

}
