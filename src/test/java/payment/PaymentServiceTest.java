package payment;

import Model.Cheque;
import Model.CreditCard;
import exception.InvalidChequeException;
import exception.InvalidCreditCardException;
import exception.PaymentException;
import org.junit.Before;
import org.junit.Test;
import service.ChequeServiceImpl;
import service.CreditCardServiceImpl;
import service.PaymentService;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class PaymentServiceTest {
    private PaymentService paymentService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void validateCreditCard_AmericanExpress()throws PaymentException {
        paymentService = new ChequeServiceImpl();
        CreditCard creditCard = new CreditCard();
        creditCard.setBankName("American Express");
        creditCard.setNumber("3410001234567890");
        boolean validate = paymentService.validate(creditCard);

    }

    @Test(expected = InvalidCreditCardException.class)
    public void validateCreditCard_AmericanExpress_LengthMoreThan16Digit()throws PaymentException {
        paymentService = new CreditCardServiceImpl();
        CreditCard creditCard = new CreditCard();
        creditCard.setBankName("American Express");
        creditCard.setNumber("341000123456789013333");
        paymentService.validate(creditCard);
    }

    @Test
    public void validateCheque_BankOfAmerica() throws PaymentException {
        paymentService = new ChequeServiceImpl();
        Cheque cheque = new Cheque();
        cheque.setBankName("Bank of America");
        cheque.setNumber("122101706123");
        boolean validate = paymentService.validate(cheque);
        assertThat(validate, equalTo(true));
    }


    @Test(expected = InvalidChequeException.class)
    public void validateCheque_BankOfAmerica_ChequeLenthLessThan9() throws PaymentException {
        paymentService = new ChequeServiceImpl();
        Cheque cheque = new Cheque();
        cheque.setBankName("Bank of America");
        cheque.setNumber("123");
        boolean validate = paymentService.validate(cheque);
        assertThat(validate, equalTo(false));
    }
}