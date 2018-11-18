package service;

import exception.InvalidCreditCardException;
import payment.PaymentMode;

public class CreditCardServiceImpl implements PaymentService{

    public boolean validate(PaymentMode creditCard)throws InvalidCreditCardException {

        if (creditCard.getNumber().length() != 16) {
            throw new InvalidCreditCardException("The Credit Card number is not valid");
        }
        if (creditCard.getNumber().startsWith("34") || creditCard.getNumber().startsWith("37") && creditCard.getBankName().equalsIgnoreCase("American Express")) {
            return true;
        } else if (creditCard.getNumber().startsWith("36") && creditCard.getBankName().equalsIgnoreCase("Diner's club / International")) {
            return true;
        } else if (creditCard.getNumber().startsWith("4") && creditCard.getBankName().equalsIgnoreCase("Visa")) {
            return true;
        } else {
            throw new InvalidCreditCardException("The Credit Card number and Bank is invaild");
        }
    }


}


