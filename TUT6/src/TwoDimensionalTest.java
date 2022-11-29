public class TwoDimensionalTest {
    public static void main(String[] args) {
        Board board1 = new Board(5);
        board1.print();
        System.out.println(board1.findMaxInRow(2));
        System.out.println(board1.findMaxInColumn(3));
        System.out.println(board1.findMaxInDiagonal1());
        System.out.println(board1.findMaxInDiagonal2());
        System.out.println(board1.maxDiagonal());
        System.out.println(board1.diagonal());
    }
}

