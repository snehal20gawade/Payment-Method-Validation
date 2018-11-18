package service;

import exception.InvalidChequeException;
import payment.PaymentMode;

public class ChequeServiceImpl implements PaymentService  {

    public boolean validate(PaymentMode cheque) throws InvalidChequeException {

        if (cheque.getNumber().length() < 9) {
            throw new InvalidChequeException("The cheque number is not valid");
        }
        if (cheque.getNumber().startsWith("031176110") && cheque.getBankName().equalsIgnoreCase("CapitalOne")) {
            return true;
        } else if (cheque.getNumber().startsWith("021001088") && cheque.getBankName().equalsIgnoreCase("HSBC")) {
            return true;
        } else if (cheque.getNumber().startsWith("021000089") && cheque.getBankName().equalsIgnoreCase("Citi bank")) {
            return true;
        } else if (cheque.getNumber().startsWith("122101706") && cheque.getBankName().equalsIgnoreCase("Bank of America")) {
            return true;
        } else {
            throw new InvalidChequeException("The cheque number and Bank is invalid");
        }
    }

}
