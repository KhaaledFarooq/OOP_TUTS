public class PostalServiceTester {
    public static void main(String[] args) {
        PostalService p1 = new PostalService();
        p1.setBarCode("|:|:::|:|:||::::::||:|::|:::||");
        PostalService p2 = new PostalService();
        p2.setZipCode("950141");
        System.out.println(p1.convertToZipCode());
        System.out.println(p2.convertToBarCode());
    }
}
