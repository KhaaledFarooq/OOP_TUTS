public class Printer {
    public static void main(String[] args) {
        Letter l1 = new Letter("Duck");
        l1.print();
        String grades[] = {"A", "B", "C", "D", "F"};
        Student s1 = new Student("John",grades);
        s1.print();
    }
}
