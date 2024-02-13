package _1_BookStore;

public class Book {
    private String nameOfBook, author;
    private double price;
    private int publishingDate;
    private static int count = 0;
    final int bookNo;
    public Book(String nameOfBook, String author, double price, int publishingDate) {
        setAuthor(author);
        setPrice(price);
        setNameOfBook(nameOfBook);
        setPublishingDate(publishingDate);
        this.bookNo = ++count;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }
    public int getBookNo() {
        return bookNo;
    }
}

