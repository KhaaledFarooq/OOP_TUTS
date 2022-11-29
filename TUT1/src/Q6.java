public class Q6 {
    public static void main(String[] args) {
        int [] luckyNumbers = new int[6];
        int i = 0;
        while(i< luckyNumbers.length){
            int num = getNum();
            if (uniqueCheck(num,luckyNumbers)){
                luckyNumbers[i]=num;
                i++;
            }
        }
        System.out.println("Lucky Numbers : ");
        print(luckyNumbers);
    }

    public static int getNum(){
        int num = (int)(Math.random()*49)+1;
        return num;
    }

    public static boolean uniqueCheck(int num,int[] numbers){
        boolean unique = true;
        for (int number : numbers) {
            if (number == num) {
                unique = false;
                break;
            }
        }
        return unique;
    }

    public static void print(int[] numbers){
        for(int x:numbers){
            System.out.print(x+" ");
        }
    }
}
