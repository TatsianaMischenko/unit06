package by.epam.book.main;

import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void add(Book book) {
        books.add(book);
    }

    public Book findById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }

        throw new RuntimeException("No such book in the Library, id=" + id);
    }

    public ArrayList<Book> findByAuthor(String author) {
        ArrayList<Book> res = new ArrayList<Book>();

        for (Book book : books) {
            String a = book.getAuthor();

            if (a.contains(author)) {
                res.add(book);
            }
        }

        return res;
    }

    public ArrayList<Book> findByYearPublished(int year) {
        ArrayList<Book> res = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getYearPublished() == year) {
                res.add(book);
            }
        }

        return res;
    }

    public ArrayList<Book> findByYearPublishedBefore(int year) {
        ArrayList<Book> res = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getYearPublished() < year) {
                res.add(book);
            }
        }

        return res;
    }

    public ArrayList<Book> findByYearPublishedAfter(int year) {
        ArrayList<Book> res = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getYearPublished() > year) {
                res.add(book);
            }
        }

        return res;
    }

    @Override
    public String toString() {
        return "Library [books=" + books + "]";
    }
}