package Model;

import payment.PaymentType;

public class CreditCard extends BasicPaymentMode {

    public PaymentType getPaymentType() {
        return PaymentType.CREDITCARD ;
    }

}
