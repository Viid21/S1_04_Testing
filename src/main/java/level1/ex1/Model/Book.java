package level1.ex1.Model;

public class Book {
    String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Book book){
        return this.name.equals(book.getName());
    }
}
