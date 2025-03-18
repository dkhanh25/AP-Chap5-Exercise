package chap5;

import chap5.adapter.MoneyBookerAdapter;
import chap5.adapter.PayPalAdapter;

public class PaymentLogger {
    public static void main(String[] args) {
        PayPalAdapter payPalGateway = new PayPalAdapter();
        MoneyBookerAdapter moneyBookerGateway = new MoneyBookerAdapter();
        payPalGateway.pay(5000);
        moneyBookerGateway.pay(10000);

    }
}
