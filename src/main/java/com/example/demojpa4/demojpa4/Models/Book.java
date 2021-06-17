package com.example.demojpa4.demojpa4.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //then only hibernate will pick it up(Spring IOC container)
public class Book {

    @Id
    private int id;
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


}
