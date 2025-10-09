package level1.ex1.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookCollectionTest {
    private BookCollection bookCollection;

    @BeforeEach
    void init() {
        bookCollection = new BookCollection();
        bookCollection.addBook("A");
        bookCollection.addBook("B");
        bookCollection.addBook("C");
    }

    @Test
    void testBookCollectionNotNull() {
        assertNotNull(bookCollection.getBooks());
    }

    @Test
    void testCorrectSizeAfterAddBook() {
        assertEquals(3, bookCollection.getBooks().size());
    }

    @Test
    void testBookInIndex() {
        assertEquals("B", bookCollection.getBooks().get(1).getName());
    }

    @Test
    void testDuplicatesNotAllowed() {
        bookCollection.addBook("A");

        assertEquals(3, bookCollection.getBooks().size());
    }

    @Test
    void testFindBookByIndex() {
        assertEquals(bookCollection.findBookByIndex(1), bookCollection.getBooks().get(1).getName());
    }

    @Test
    void testAddBookWithPos() {
        bookCollection.addBookWithPos(3, "D");

        assertNotEquals("D", bookCollection.getBooks().getFirst().getName());
    }

    @Test
    void testRemoveBook() {
        bookCollection.removeBook("A");

        assertEquals(2, bookCollection.getBooks().size());
    }

    @Test
    void testBooksAlwaysSorted() {
        bookCollection.addBook("F");
        bookCollection.addBook("Z");
        bookCollection.addBook("E");
        bookCollection.addBook("D");
        bookCollection.removeBook("E");
        String allBooks = """
                1.- A
                2.- B
                3.- C
                4.- D
                5.- F
                6.- Z
                """;

        assertEquals(allBooks, bookCollection.showAllBooks());
    }
}