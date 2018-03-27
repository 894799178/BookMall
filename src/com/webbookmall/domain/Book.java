package com.webbookmall.domain;

/**
 * 书籍类,对应数据库中字段属性.
 */
public class Book {
    private int bookId;
    private String bookName;
    private String author;//作者
    private double bookPrice;//书籍的价格
    private int bookAmount;//书籍的数量

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookAmount=" + bookAmount +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(int bookAmount) {
        this.bookAmount = bookAmount;
    }


}
