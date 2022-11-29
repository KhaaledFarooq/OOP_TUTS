public class VotingMachine {
    private int labourVotes;
    private int conservativeVotes;

    public void voteLabour(){
        labourVotes += (int) 7*Math.random();
    }
    public void voteConservative(){
        conservativeVotes+=1;
    }

    public int getLabourVotes() {
        return labourVotes;
    }

    public int getConservativeVotes() {
        return conservativeVotes;
    }
    public void clear(){
        labourVotes = 0;
        conservativeVotes = 0;
    }
}
