package Module2.Task2;

import java.util.List;

public class Student {

    private String name;
    private List<Book> books;

    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Студент " + name + " (" + books.size() + " книг)";
    }
}
