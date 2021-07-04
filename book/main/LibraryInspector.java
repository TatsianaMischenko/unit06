package by.epam.book.main;

import java.util.ArrayList;
import java.util.List;

//   a) список книг заданного автора;
//   b) список книг, выпущенных после заданного года.
public class LibraryInspector {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();
        Library library = new Library();

        Book book1 = new Book("The Norton Anthology of Poetry, Shorter 5th Edition", "Margaret Ferguson", "Norton, W. W. & Company, Inc.", 2004, 1424, 58.69, "Paperback");
        Book book2 = new Book("The Best Loved Poems of the American People", "Hazel Felleman", "Knopf Doubleday Publishing Group", 1936, 670, 17.92, "Hardcover");
        Book book3 = new Book("The Norton Anthology of Poetry", "Margaret Ferguson", "Norton, W. W. & Company, Inc.", 2004, 2256, 66.3, "Paperback");
        Book book4 = new Book("The Latino Reader: An American Literary Tradition from 1542 to the Present", "Margarite Fernandez Olmos", "Houghton Mifflin Harcourt", 1997, 528, 13.98, "Paperback");
        Book book5 = new Book("Feeling Italian: The Art of Ethnicity in America", "Thomas Ferraro", "New York University Press", 2005, 408, 22.08, "Paperback");
        Book book6 = new Book("The Jazz Poetry Anthology", "Sascha Feinstein", "Indiana University Press", 1991, 320, 19.34, "Paperback");
        Book book7 = new Book("Poems That Live Forever", "Hazel Felleman", "Knopf Doubleday Publishing Group", 1965, 480, 18.55, "Hardcover");
        Book book8 = new Book("The Best American Magazine Writing", "Clay Felker", "PublicAffairs", 2000, 432, 14.36, "Paperback");
        Book book9 = new Book("The Vintage Book of African American Poetry", "Michael S. Harper", "Knopf Doubleday Publishing Group", 2000, 448, 16.32, "Paperback");
        Book book10 = new Book("Every Shut Eye Ain't Asleep; An Anthology of Poetry by African Americans since 1945", "Michael S. Harper", "Hachette Book Group", 1994, 344, 18.4, "Paperback");


        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        library.setBooks(books);
        library.findByAuthor("Margaret Ferguson");
        library.findById(book1.getId());
        library.findByYearPublishedAfter(1990);
        library.findByYearPublished(2004);
        library.findByYearPublishedBefore(2000);

        System.out.println("список книг заданного автора");
        for (Book book : library.findByAuthor("Margaret Ferguson")) {
            System.out.println(book);
        }

        System.out.println("список книг, выпущенных после заданного года");
        for (Book book : library.findByYearPublishedAfter(2000)) {
            System.out.println(book);
        }
    }
}
