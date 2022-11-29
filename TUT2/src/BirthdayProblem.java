public class BirthdayProblem {
    public static void main(String[] args) {
        int runCount=100000;
        int individualsTotal = 0;

        for(int i=0;i<runCount;i++){
            individualsTotal+=check();
        }
        System.out.println(individualsTotal/runCount);
    }

    public static int check(){
        //default value is false in a boolean array
        boolean [] birthday = new boolean[365];
        int numIndividuals = 0;
        while(true){
            numIndividuals++;
            int num = (int)(365*Math.random());
            if (birthday[num]){
                break;
            }
            else{
                birthday[num]=true;
            }
        }
        return numIndividuals;
    }
}
