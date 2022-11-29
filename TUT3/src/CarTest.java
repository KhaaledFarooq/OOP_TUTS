public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("ABC123", 98.0);
        car1.print();
        Car car2 = new Car("DEF456", 155.0, 55.0);
        car2.print();
        Car car3 = new Car("GHI789", 20.0, 500.0);
        car3.print();
    }
}