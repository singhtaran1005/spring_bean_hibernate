package com.example.demojpa4.demojpa4.Models;

import javax.persistence.*;
import java.util.Iterator;
import java.util.Set;

@Entity
public class BookCategory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "bookCategory",cascade = CascadeType.ALL)
    private Set<Book> books;  //one to many mapping

    //hibernate
    //identity -sql query

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public BookCategory(String name) {
        this.name = name;
    }

    public BookCategory(String name, Set<Book> books) {
        this.name = name;
        this.books = books;

        //iterate over set
        //setting book category for every book so that it can be mapped
//1 - way >
//        Iterator it = books.iterator();
//        while (it.hasNext()) {
//            Book book = (Book) it.next();
//            book.setBookCategory(this);
//        }

//    using java streams ->
        this.books.forEach(x -> x.setBookCategory(this));
    }

    public BookCategory() {
    }
}
