public class Letter implements Printable{
    String text;
    Letter(String text){
        this.text = text;
    }
    public void print(){
        System.out.println("Text : "+text);
    }
}
