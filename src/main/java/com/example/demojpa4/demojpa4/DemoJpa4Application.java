package com.example.demojpa4.demojpa4;

import com.example.demojpa4.demojpa4.Models.Book;
import com.example.demojpa4.demojpa4.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJpa4Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoJpa4Application.class, args);
    }

    @Autowired   //injecting dependency of Book_repo...
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Book b1 = new Book();
        b1.setId(1);
        b1.setCost(20);
        b1.setAuthorName("Taran");
        b1.setBookName("Life in 2021");
        bookRepository.save(b1);  //saving to db
    }
}
