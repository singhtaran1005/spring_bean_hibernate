package com.example.demojpa4.demojpa4.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookCategory {


    @Id
    private int id;
    private String name;

    //hibernate
    //identity -sql query

}
