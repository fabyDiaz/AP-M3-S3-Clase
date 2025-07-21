package cl.diazfabiola;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagerTest {

    private LibraryManager libraryManager;

    @BeforeEach
    void setUp() {
        libraryManager = new LibraryManager();
    }

    @Test
    void testAddBook(){
        String bookTitle = "1984";
        String bookAuthor = "George Orwell";
        int year = 1949;

        Book book = libraryManager.addBook(bookTitle, bookAuthor, year);
        assertNotNull(book, "El libro no es null");
        assertEquals(bookTitle, book.getTitle());
    }


}