public class CardTester {
    public static void main(String[] args) {
        DriverLicense d1 = new DriverLicense("John", 2017);
        Passport p1 = new Passport("Anne", "Colombo", 2075);
        CreditCard c1 = new CreditCard("Tom", 7896, 78539652);
        System.out.println(d1.format());
        System.out.println(p1.format());
        System.out.println(c1.format());
    }
}