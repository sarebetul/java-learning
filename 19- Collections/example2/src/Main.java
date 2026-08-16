import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(1,"Java",30.60));
        books.add(new Book(2,"SQL",200));
        books.add(new Book(3,"Python",400));
        for(Book book:books){
            System.out.println(book.name);
        }
    }
}
