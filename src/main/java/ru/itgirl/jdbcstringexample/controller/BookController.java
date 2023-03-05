package ru.itgirl.jdbcstringexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.jdbcstringexample.model.Book;
import ru.itgirl.jdbcstringexample.repository.BookRepository;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    List<Book> getAllBooks() {
       return bookRepository.findAllBook();
    }

    @GetMapping("/book/{id}")
    List<Book> getBooksById(@PathVariable Long id) {
        return bookRepository.findBooksById(id);
    }
}
