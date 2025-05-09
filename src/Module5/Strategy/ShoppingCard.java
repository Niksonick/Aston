package Module5.Strategy;

public class ShoppingCard {

    private PaymentStrategy paymentStrategy;

    public ShoppingCard(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
