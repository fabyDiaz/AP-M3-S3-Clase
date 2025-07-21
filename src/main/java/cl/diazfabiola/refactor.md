````java

public class LibraryManager {

    private static int nextId=1;

    private final Map<Integer, Book> booksMap = new HashMap<>();

    public Book addBook(String title, String author, int year){
        Book book = new Book(nextId++, title, author, year);
        booksMap.put(book.getId(), book);
        return book;

    }
}

````