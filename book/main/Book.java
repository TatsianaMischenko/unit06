package by.epam.book.main;

//Создать класс Book, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы. Создать второй класс,
// агрегирующий массив типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//        Найти и вывести:
//        a) список книг заданного автора;
//        b) список книг, выпущенных после заданного года.



public class Book {

    private static int idCount = 0;
    // ID will be unique
    private final int id;
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private int pages;
    private double price;
    private String cover;

    {
        idCount++;
    }

    public Book() {
        id = idCount;
        title = "Default Title";
        author = "Default Author";
        publisher = "Default Publisher";
        yearPublished = 2021;
        pages = 0;
        price = 0.0;
        cover = "Default Cover";
    }

    public Book(String title, String author, double price, String cover) {
        this.id = idCount;
        this.title = title;
        this.author = author;
        this.price = price;
        this.cover = cover;
    }

    public Book(String title, String author, String publisher, int yearPublished, int pages, double price, String cover) {
        this.id = idCount;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.pages = pages;
        this.price = price;
        this.cover = cover;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((cover == null) ? 0 : cover.hashCode());
        result = prime * result + id;
        result = prime * result + pages;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + yearPublished;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (cover == null) {
            if (other.cover != null)
                return false;
        } else if (!cover.equals(other.cover))
            return false;
        if (id != other.id)
            return false;
        if (pages != other.pages)
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (publisher == null) {
            if (other.publisher != null)
                return false;
        } else if (!publisher.equals(other.publisher))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (yearPublished != other.yearPublished)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format(
                "Book {id=%s, title=%s, author=%s, publisher=%s, yearPublished=%s, pages=%s, price=%s, cover=%s}",
                id, title, author, publisher, yearPublished, pages, price, cover);
    }

}