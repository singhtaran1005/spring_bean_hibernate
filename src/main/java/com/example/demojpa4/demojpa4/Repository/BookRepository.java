package com.example.demojpa4.demojpa4.Repository;

import com.example.demojpa4.demojpa4.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {


//    public List<Book> findByAuthorName(String name);

    @Query(value = "select * from book b where b.author_name=:my_name", nativeQuery = true)
    public List<Book> findByAuthor(String my_name);   //to make your own function using native query language

    @Query(value = "select b from Book b where b.authorName=:authors_name")
    public List<Book> findByAuthors(String authors_name); //using java persistance query language
    //jpql makes mapping from the java object

    List<Book> findByCost(int cost);

    Book findById(int id);
}


//database func
//repository is an interface
//only implement the custom methods
//no_repository_bean