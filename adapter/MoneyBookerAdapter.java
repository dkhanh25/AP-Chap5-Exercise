package chap5.adapter;

import chap5.gateway.PaymentGatewayImp;
import chap5.method.MoneyBooker;

public class MoneyBookerAdapter extends MoneyBooker implements PaymentGatewayImp {
    public MoneyBookerAdapter() {
        super();
    }

    @Override
    public void pay(int amount) {
        super.payMoney(amount);
    }
}
