import java.util.Comparator;

class ComparatorTest implements Comparator<BankAccountComparator> {
    public int compare(BankAccountComparator b1, BankAccountComparator b2) {
        if (b1.balance < b2.balance)
            return -1;
        else if (b1.balance > b2.balance)
            return 1;
        else
            return 0;
    }
}