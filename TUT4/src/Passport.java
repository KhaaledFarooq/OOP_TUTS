public class Passport extends Card{
    private String birthLocation;
    private int expirationYear;

    public Passport(String n,String birthLocation,int expirationYear){
        super(n);
        this.birthLocation=birthLocation;
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
        return super.format()+", Birth location: " + birthLocation + ", Expiration year: " + expirationYear;
    }
}
