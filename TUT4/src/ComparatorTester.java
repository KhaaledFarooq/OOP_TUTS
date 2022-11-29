import java.util.ArrayList;
import java.util.Collections;

class ComparatorTester {
    public static void main(String[] args) {
        BankAccountComparator ba1 = new BankAccountComparator(55);
        BankAccountComparator ba2 = new BankAccountComparator(322);
        BankAccountComparator ba3 = new BankAccountComparator(214);

        ArrayList<BankAccountComparator> list = new ArrayList<BankAccountComparator>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);

        Collections.sort(list, new ComparatorTest());

        for (BankAccountComparator b : list)
            System.out.println(b.balance);
    }
}