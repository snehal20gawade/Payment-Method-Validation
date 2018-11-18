package payment;

import Model.Cheque;
import Model.CreditCard;
import Model.Payment;
import exception.InvalidChequeException;
import exception.InvalidCreditCardException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class PaymentMethodControllerTest {


    private PaymentValidator paymentValidator;

    @Before
    public void setUp() {
        paymentValidator = new PaymentValidator();
    }

    @Test
    public void validatePaymentTypeCreditCard_Valid() {
        PaymentMode paymentMode = new CreditCard();
        Payment payment = new Payment("Alan", 100000.10, paymentMode);
        paymentMode.setBankName("American Express");
        paymentMode.setNumber("3410001234567890");
        boolean validate = paymentValidator.validatePayment(payment);
        assertThat(validate, equalTo(true));

    }

    @Test
    public void validatePaymentTypeCreditCard_Invalid() {
        PaymentMode paymentMode = new CreditCard();
        Payment payment = new Payment("Alan", 100000.10, paymentMode);
        paymentMode.setBankName("American Express");
        paymentMode.setNumber("2310001234567890");
        boolean validate = paymentValidator.validatePayment(payment);
        assertThat(validate, equalTo(false));


    }

    @Test
    public void validatePaymentTypeCheque_Invalid() {
        PaymentMode paymentMode = new Cheque();
        Payment payment = new Payment("Alan", 100000.10, paymentMode);
        paymentMode.setBankName("American Express");
        paymentMode.setNumber("3410001234567890");
        boolean validate = paymentValidator.validatePayment(payment);
        assertThat(validate, equalTo(false));
    }

    @Test
    public void validatePaymentTypeCheque_valid() {
        PaymentMode paymentMode = new Cheque();
        Payment payment = new Payment("Alan", 100000.10, paymentMode);
        paymentMode.setBankName("HSBC");
        paymentMode.setNumber("02100108845678");
        boolean validate = paymentValidator.validatePayment(payment);
        assertThat(validate, equalTo(true));
    }
}