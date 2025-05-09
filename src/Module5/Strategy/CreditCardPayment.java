package Module5.Strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private int cardNumber;

    public CreditCardPayment(String name, int cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(name + " pays " + amount + " on card " + cardNumber);
    }


}
