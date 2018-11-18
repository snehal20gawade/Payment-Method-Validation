package Model;

import payment.PaymentMode;

public abstract class BasicPaymentMode implements PaymentMode {

    private String bankName;

    private String number;

    public String getNumber() {
        return this.number;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
