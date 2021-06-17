package com.example.demojpa4.demojpa4.Repository;

import com.example.demojpa4.demojpa4.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {


}


//database func
//repository is an interface
//only implement the custom methods
//no_repository_bean