public class VotingMachineTest {
    public static void main(String[] args) {
        VotingMachine v1 = new VotingMachine();
        v1.clear();
        v1.voteConservative();
        v1.voteConservative();
        v1.voteConservative();
        v1.voteLabour();
        v1.voteLabour();
        v1.voteLabour();
        System.out.println("Conservative votes : "+v1.getConservativeVotes());
        System.out.println("Labour votes : "+v1.getLabourVotes());
    }
}
