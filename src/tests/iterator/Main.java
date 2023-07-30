package tests.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Java"));
        bookShelf.appendBook(new Book("Python"));
        bookShelf.appendBook(new Book("C++"));
        bookShelf.appendBook(new Book("Javascript"));
        bookShelf.appendBook(new Book("HTML"));
        bookShelf.appendBook(new Book("CSS"));
        bookShelf.appendBook(new Book("Javascript"));

        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

    }
}
