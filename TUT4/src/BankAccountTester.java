import java.util.ArrayList;
import java.util.Collections;

public class BankAccountTester {
    public static void main (String[] args){
        BankAccount b1= new BankAccount(55);
        BankAccount b2= new BankAccount(7);
        BankAccount b3= new BankAccount(28);
        BankAccount b4= new BankAccount(313);
        BankAccount b5= new BankAccount(92);

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        Collections.sort(list);
        System.out.println(list);

        for (BankAccount b : list)
            System.out.println(b.getBalance());
    }
}

