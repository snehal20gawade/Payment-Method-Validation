package payment;

import exception.UnsupportedPaymentType;
import service.ChequeServiceImpl;
import service.CreditCardServiceImpl;
import service.PaymentService;

public class PaymentServiceFactory {

    public PaymentService createPaymentService(PaymentType paymentType) throws UnsupportedPaymentType {

        if (paymentType.equals(PaymentType.CHEQUE)) {
            return new ChequeServiceImpl();

        } else if (paymentType.equals(PaymentType.CREDITCARD)) {
            return new CreditCardServiceImpl();
        } else throw new UnsupportedPaymentType("The PaymentType is not supported");

    }

}
