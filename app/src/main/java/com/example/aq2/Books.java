package com.example.aq2;

public class Books {

    String bookName,Author,Pages;
    String available;

    public Books(String bookName, String author, String pages, String available) {
        this.bookName = bookName;
        Author = author;
        Pages = pages;
        this.available = available;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPages() {
        return Pages;
    }

    public void setPages(String pages) {
        Pages = pages;
    }

    public String isAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
