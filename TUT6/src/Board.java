import java.util.*;
class Board {
    int[][] ar;
    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];
// fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i=0; i < n; i++)
            for (int j=0; j < n; j++)
                ar[i][j] = generator.nextInt(101);
    }
    // display the contents of the board
    public void print() {
        for (int[] r : ar) { // for all rows
            for (int c : r) // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public int findMaxInRow(int row){
        int max = ar[row][0];
        for(int i =0; i<ar[row].length;i++){
            if (ar[row][i]>max){
                max=ar[row][i];
            }
        }
        return max;
    }

    public int findMaxInColumn(int column){
        int max = ar[0][column];
        for(int i=0; i<ar[0].length;i++){
            if (ar[i][column]>max){
                max=ar[i][column];
            }
        }
        return max;
    }

    public int findMaxInDiagonal1(){
        int max = ar[0][0];
        for(int i=0;i<ar.length;i++){
            if (ar[i][i]>max){
                max=ar[i][i];
            }
        }
        return max;
    }

    public int findMaxInDiagonal2(){
        int n = ar.length-1;
        int max = ar[n][0];
        for(int i=0;i< ar.length;i++){
            if(ar[n-i][i]>max){
                max = ar[n-i][i];
            }
        }
        return max;
    }

    public int maxDiagonal(){
        return Math.max(findMaxInDiagonal1(), findMaxInDiagonal2());
    }
    public int diagonal(){
        int max= ar[0][0];
        int s;
        for (int i=0; i<ar.length;i++){
            s = Math.max(ar[(ar.length - 1) - i][i], ar[i][i]);
            if(s>max)
                max=s;
        }
        return max;
    }
}