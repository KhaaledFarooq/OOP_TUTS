public class VendingMachineTester
{
    public static void main(String[] args)
    {
        VendingMachine machine = new VendingMachine();
        machine.fillUp(10); // fill up with ten cans
        machine.insertToken();
        machine.insertToken();
        System.out.print("Token count = ");
        System.out.println(machine.getTokens());
        System.out.print("Can count = ");
        System.out.println(machine.getNumCans());
    }
}
