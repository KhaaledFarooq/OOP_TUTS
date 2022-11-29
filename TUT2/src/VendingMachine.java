public class VendingMachine {
    private int numCans;
    private int tokens;
    public VendingMachine(){
        numCans=10;
        tokens=0;
    }
    public VendingMachine(int cans){
        numCans = cans;
        tokens=0;
    }
    public void fillUp(int cans){
        numCans+=cans;
    }
    public void insertToken(){
        if(numCans>0){
            tokens+=1;
            numCans-=1;
        }
        else{
            System.out.println("Machine empty");
        }
    }

    public int getNumCans() {
        return numCans;
    }

    public int getTokens() {
        return tokens;
    }
}
