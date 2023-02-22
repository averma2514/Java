package linkedlistbook;

import java.util.LinkedList;

public class Append {

    LinkedList<Book> listobj = new LinkedList<>();

    public void add(Book book) {
        listobj.add(book);
    }

    public void showBook() {
        for (Book n : listobj) {
            System.out.println(n);
        }
    }

    public void show() {
        listobj.add(1, new Book(2, "A", "B"));

    }
}