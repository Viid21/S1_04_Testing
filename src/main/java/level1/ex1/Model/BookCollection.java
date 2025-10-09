package level1.ex1.Model;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(String name){
        if(BookCollectAssist.findBookByName(name, books) == -1){
            books.add(new Book(name));
            books = BookCollectAssist.sortBooks(books);
        }
    }

    public String showAllBooks(){
        int i = 0;
        StringBuilder output = new StringBuilder();
        for(Book book : books){
            output.append(++i).append(".- ").append(book.getName()).append("\n");
        }
        return output.toString();
    }

    public String findBookByIndex(int index){
        return books.get((index)).getName();
    }

    public void addBookWithPos(int index, String name){
        if(BookCollectAssist.findBookByName(name, books) == -1) {
            books.add(index, new Book(name));
            books = BookCollectAssist.sortBooks(books);
        }
    }

    public void removeBook(String name){
        books.remove(books.get(BookCollectAssist.findBookByName(name, books)));
        books = BookCollectAssist.sortBooks(books);
    }
}
