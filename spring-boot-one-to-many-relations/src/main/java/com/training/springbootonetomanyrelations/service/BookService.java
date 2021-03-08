package com.training.springbootonetomanyrelations.service;

import com.training.springbootonetomanyrelations.model.Book;
import com.training.springbootonetomanyrelations.model.Library;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> listAll();

    Optional<Book> getById(int bookId);

    Book saveBook(Book book);

    void deleteBook(int bookId);

    Book updateBook(Book book, int bookId);
}
