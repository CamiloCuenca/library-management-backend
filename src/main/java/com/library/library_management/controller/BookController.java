package com.library.library_management.controller;

import com.library.library_management.entity.Book;
import com.library.library_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (path = "v1/books")
public class BookController {
    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAll(){
        return bookService.getBooks();
    }

    @GetMapping("/{bookId}")
    public Optional<Book> getById(@PathVariable("bookId") Long bookId){
        return bookService.getBook(bookId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Book book){
        bookService.saveOrUpdate(book);
    }

    @DeleteMapping("/{bookId}")
    public void saveUpdate(@PathVariable("bookId") Long bookId){
        bookService.delete(bookId);
    }



}
