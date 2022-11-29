import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while(true) {
            printMenu();

            System.out.println("Enter menu option : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter title : ");
                    input.nextLine();
                    String title = input.nextLine();
                    System.out.println("Enter price : ");
                    double price = input.nextDouble();
                    System.out.println("Enter publish year : ");
                    int publishYear = input.nextInt();
                    System.out.println("Enter author");
                    input.nextLine();
                    String author = input.nextLine();
                    Book b = new Book(title, publishYear, author);
                    b.setPrice(price);
                    books.add(b);
                    break;

                case 2:
                    if(books.size()==0){
                        System.out.println("No books entered");
                    }
                    else{
                        for(int i=0;i<books.size();i++){
                            Book b1 = books.get(i);
                            System.out.println(b1.toString());
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    if(books.size()==0){
                        System.out.println("No books entered");
                    }
                    else{
                        Collections.sort(books);
                        for(int i=0;i<books.size();i++){
                            Book b1 = books.get(i);
                            System.out.println(b1.toString());
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");

            }
        }
    }
    public static void printMenu(){
        System.out.println("1 - Add Book");
        System.out.println("2 - View all Books");
        System.out.println("3 - Sort");
        System.out.println("4 - Quit");
        System.out.println();
    }
}
