package exception;

public class UnsupportedPaymentType extends Exception {
    public UnsupportedPaymentType(String message) {
        super(message);
    }
}
