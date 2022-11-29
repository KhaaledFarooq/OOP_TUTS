public class CreditCard extends Card{
    private int pinNumber;
    private int number;

    public CreditCard(String n, int pin, int num)
    {
        super(n);
        pinNumber = pin;
        number = num;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public String format() {
        return super.format()+", pin: " + pinNumber + ", number: " + number;
    }
}
