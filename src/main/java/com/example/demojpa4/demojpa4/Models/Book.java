package com.example.demojpa4.demojpa4.Models;

import javax.persistence.*;

@Entity  //then only hibernate will pick it up(Spring IOC container)
//@Table(name = "my_book")  // to change the table name
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //    @Column(name = "book_name") //to change the column name
    private String bookName;
    private String authorName;
    private int cost;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Book( String bookName, String authorName, int cost) {
//        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.cost = cost;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
