package exception;

public class InvalidChequeException extends PaymentException{

    public InvalidChequeException(String message){
        super(message);
    }
}
