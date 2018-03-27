package com.webbookmall.domain;

import java.util.List;

public class ShoppingCart {
    private List<Book> listBook;
    private double totalPrice=0.0;
    private int totalAmount=0;

    public List<Book> getListBook() {
        return listBook;
    }
    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }
    @Override
    public String toString() {
        return "ShoppingCart{" +
                "listBook=" + listBook +
                ", totalPrice=" + totalPrice +
                ", totalAmount=" + totalAmount +
                '}';
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 根据传入的book进行更新总数据
     * @param book
     */
    public void addBookToShoppingCart(Book book){
        listBook.add(book);
        updatetotal(book);
    }

    /**
     * 添加book的时候更新购物车中的数据
     * @param book
     */
    public void updatetotal(Book book){
        totalPrice+= book.getBookPrice()*book.getBookAmount();
        totalAmount+=book.getBookAmount();
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
