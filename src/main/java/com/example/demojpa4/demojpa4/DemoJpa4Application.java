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
        Book b1 = new Book(3, "HEHEHEHEH", "Aman", 500);
//        b1.setId(2);
//        b1.setCost(30);
//        b1.setAuthorName("Karan");
//        b1.setBookName("Dreams");
        bookRepository.save(b1);
        System.out.println(bookRepository.findByAuthor("Taran"));
//        System.out.println(bookRepository.findByCost(20));
//        System.out.println(bookRepository.findById(1));
        System.out.println(bookRepository.findByAuthors("Simar"));
        //saving to db
    }
}
