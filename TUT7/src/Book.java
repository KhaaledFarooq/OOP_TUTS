public class Book implements Comparable<Book> {
    private String title;
    private double price;
    private int publishYear;
    private String author;

    public Book(String title, int publishYear, String author){
        this.title=title;
        this.publishYear=publishYear;
        this.author=author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPublishYear(int publishYear){
        this.publishYear = publishYear;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String toString(){
        return("Title : "+title+"\nPrice : "+price+"\nYear : "+publishYear+"\nAuthor : "+author);
    }

    public int compareTo(Book b){
        if (publishYear > b.publishYear)
            return 1;
        else if (publishYear > b.publishYear)
            return -1;
        else {
            return 0;
        }
    }
}
