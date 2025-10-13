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
    void givenThreeBooks_whenAddBook_thenListNotEmpty() {
        assertNotNull(bookCollection.getBooks());
    }

    @Test
    void givenThreeBooks_whenAddBook_thenListCorrectSize() {
        assertEquals(3, bookCollection.getBooks().size());
    }

    @Test
    void givenThreeBooks_whenAddBook_thenBookCorrectIndex_() {
        assertEquals("B", bookCollection.getBooks().get(1).getName());
    }

    @Test
    void givenThreeBooks_whenAddBook_thenDuplicatesNotAllowed_() {
        bookCollection.addBook("A");

        assertEquals(3, bookCollection.getBooks().size());
    }

    @Test
    void givenThreeBooks_whenAddBook_thenDuplicatesNotAllowed() {
        assertEquals(bookCollection.findBookByIndex(1), bookCollection.getBooks().get(1).getName());
    }

    @Test
    void givenThreeBooks_whenAddBook_thenAddBookWithPos() {
        bookCollection.addBookWithPos(3, "D");

        assertNotEquals("D", bookCollection.getBooks().getFirst().getName());
    }

    @Test
    void givenThreeBooks_whenAddBook_thenRemoveBook() {
        bookCollection.removeBook("A");

        assertEquals(2, bookCollection.getBooks().size());
    }

    @Test
    void givenThreeBooks_whenAddBook_thenBooksAlwaysSorted() {
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