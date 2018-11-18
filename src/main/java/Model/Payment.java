package Model;

import payment.PaymentMode;

public class Payment {
    	private  String userName;
        private  Double amount;
        private PaymentMode paymentMode;

    public Payment(String userName, Double amount, PaymentMode paymentMode) {
        this.userName = userName;
        this.amount = amount;
        this.paymentMode = paymentMode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}
