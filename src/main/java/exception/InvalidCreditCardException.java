package exception;

public class InvalidCreditCardException extends PaymentException {

    public InvalidCreditCardException(String message) {
        super(message);
    }
}
