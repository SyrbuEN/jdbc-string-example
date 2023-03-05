package ru.itgirl.jdbcstringexample.repository;

import ru.itgirl.jdbcstringexample.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBook();

    List<Book> findBooksById(Long id);
}
