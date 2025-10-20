package level1.ex1.Model;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(String name) {
        if(!books.contains(new Book(name))){
            books.add(new Book(name));
            books = BookCollectAssist.sortBooks(books);
        }
    }

    public String showAllBooks() {
        if(!books.isEmpty()) {
            int i = 0;
            StringBuilder output = new StringBuilder();
            for (Book book : books) {
                output.append(++i).append(".- ").append(book.getName()).append("\n");
            }
            return output.toString();
        }else{
            return "There are no books in the collection.";
        }
    }

    public String findBookByIndex(int index) {
        try {
            return books.get((index)).getName();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void addBookWithPos(int index, String name) {
        if (!books.contains(new Book(name))){
            try {
                books.add(index, new Book(name));
                books = BookCollectAssist.sortBooks(books);
            }catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void removeBook(String name) {
        if (!books.contains(new Book(name))) {
            try {
                books.remove(books.get(books.indexOf(new Book(name))));
                books = BookCollectAssist.sortBooks(books);
            }catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
