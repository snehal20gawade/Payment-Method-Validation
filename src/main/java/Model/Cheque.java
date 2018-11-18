package Model;

import payment.PaymentType;

public class Cheque extends BasicPaymentMode {

    public PaymentType getPaymentType() {
        return PaymentType.CHEQUE ;
    }

}

