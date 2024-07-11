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

    //Constructor
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /** This is the GET request that returns all books
     *
     * @return All books
     */
    @GetMapping
    public List<Book> getAll(){
        return bookService.getBooks();
    }

    /** thi method is the GET request that return a specific book
     *
     * @param bookId
     * @return the specific book
     */
    @GetMapping("/{bookId}")
    public Optional<Book> getById(@PathVariable("bookId") Long bookId){
        return bookService.getBook(bookId);
    }

    /** This is the POST request that save or update a book
     *
     * @param book
     */
    @PostMapping
    public void saveUpdate(@RequestBody Book book){
        bookService.saveOrUpdate(book);
    }

    /** This is the DELETE request that delete a specific book
     *
     * @param bookId
     */
    @DeleteMapping("/{bookId}")
    public void saveUpdate(@PathVariable("bookId") Long bookId){
        bookService.delete(bookId);
    }



}
