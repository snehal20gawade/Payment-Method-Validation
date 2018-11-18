package payment;

import Model.Payment;

import exception.UnsupportedPaymentType;
import exception.PaymentException;
import service.PaymentService;

public class PaymentValidator {

    PaymentServiceFactory paymentServiceFactory = new PaymentServiceFactory();

    public boolean validatePayment(Payment payment) {

        boolean isValidPayment = false;
        PaymentService paymentService = null;
        try {
            paymentService = paymentServiceFactory.createPaymentService(payment.getPaymentMode().getPaymentType());
        } catch (UnsupportedPaymentType invalidPaymentType) {
            invalidPaymentType.printStackTrace();
        }
        try {
            isValidPayment = paymentService.validate(payment.getPaymentMode());

        } catch (PaymentException paymentException) {
            paymentException.printStackTrace();
        }

        return isValidPayment;
    }
}
