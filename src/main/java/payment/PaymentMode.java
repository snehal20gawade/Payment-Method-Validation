package payment;

public interface PaymentMode {

    PaymentType getPaymentType();

    String getNumber();

    String getBankName();

    void setNumber(String number);

    void setBankName(String bankName);


}
