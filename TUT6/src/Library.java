import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void populate(){
        for(int i=0; i<4;i++){
            Book b = new Book();
            b.author = ("Author"+i);
            b.title = ("Title"+i);
            books.add(b);
        }
    }

    public void displayAllBooks(){
        for(int i=0;i<books.size();i++){
            Book b = books.get(i);
            System.out.println("Book: author=" + b.author + ", title=" + b.title);
        }
    }
}
