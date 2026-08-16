public class Main {
  public static void main(String[] args){
    Book book = new Book();
    book.setAuthor("Reşat Nuri Güntekin");
    book.setTitle("Çalıkuşu");
    book.setPrice(120);
    System.out.println("book name: " + book.getTitle() + "author name: " + book.getAuthor() + "price: " + book.getPrice());

    BookManager  bookManager = new BookManager();
    bookManager.add(book);
  }
}
