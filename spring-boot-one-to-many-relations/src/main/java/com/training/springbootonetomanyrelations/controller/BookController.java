package com.training.springbootonetomanyrelations.controller;

import com.training.springbootonetomanyrelations.model.Book;
import com.training.springbootonetomanyrelations.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/api/v1/book")
@CrossOrigin
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/save")
    public Book save(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping(value = "/all")
    public List<Book> getAll() {
        return bookService.listAll();
    }

    @GetMapping(value = "/get/{bookId}")
    public Optional<Book> get(@PathVariable int bookId) {
        return bookService.getById(bookId);
    }

    @PutMapping(value = "/update/{bookId}")
    public Book update(@RequestBody Book book, @PathVariable int bookId) {
        return bookService.updateBook(book, bookId);
    }

    @DeleteMapping(value = "/delete")
    public String delete(@RequestParam int bookId) {
        bookService.deleteBook(bookId);
        return "The Book Was Deleted !";
    }
}

