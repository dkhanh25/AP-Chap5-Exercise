package chap5.adapter;

import chap5.gateway.PaymentGatewayImp;
import chap5.method.PayPal;

public class PayPalAdapter extends PayPal implements PaymentGatewayImp {
    public PayPalAdapter() {
        super();
    }
    @Override
    public void pay(int amount) {
        super.depositMoney(amount);
    }
}
