package com.BookStore.pojo;

public class book {
    private int Id;
    private String BookName;
    private double Price;
    private String Writer;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    @Override
    public String toString() {
        return "book{" +
                "Id=" + Id +
                ", BookName='" + BookName + '\'' +
                ", Price=" + Price +
                ", Writer='" + Writer + '\'' +
                '}';
    }
}
