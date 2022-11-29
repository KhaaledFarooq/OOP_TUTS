public class DriverLicense extends Card {
    private int expirationYear;

    public DriverLicense (String n,int expirationYear){
        super(n);
        this.expirationYear=expirationYear;
    }

    @Override
    public boolean isExpired() {
        if(expirationYear>2022){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String format() {
        return super.format()+", Expiration year: " + expirationYear;
    }
}
