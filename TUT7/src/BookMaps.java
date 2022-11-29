import java.util.*;

public class BookMaps {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        Book b1 = new Book("title1",2001,"author1");
        Book b2 = new Book("title2",2002,"author2");
        Book b3 = new Book("title3",2003,"author3");
        Book b4 = new Book("title4",2004,"author4");
        Book b5 = new Book("title5",2005,"author5");
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        HashMap<Book, Integer> hmap = new HashMap<Book, Integer>();

        for (int i=0; i<bookList.size(); i++){
            System.out.println("Please, enter the number of the shelf where is placed the book" + bookList.get(i).getTitle());
            int numShelf = s.nextInt();
            hmap.put(bookList.get(i), numShelf);
        }
        System.out.println("Insert the number of the shelf");
        int selectedShelf = s.nextInt();
        System.out.println("The book in shelf " + selectedShelf + " are : ");

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if(selectedShelf == (int) entry.getValue()){
                System.out.println(((Book)entry.getKey()).getTitle());
            }
        }
    }
}
