package service;

import exception.InvalidChequeException;
import exception.InvalidCreditCardException;
import exception.PaymentException;
import payment.PaymentMode;

public interface PaymentService {

    public boolean validate(PaymentMode paymentMode) throws PaymentException;
}
