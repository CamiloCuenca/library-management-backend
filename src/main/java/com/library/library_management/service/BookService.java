package com.library.library_management.service;

import com.library.library_management.entity.Book;
import com.library.library_management.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    /** this method returns all books
     *
     * @return  All books
     */
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    /** This method return a specific book
     *
     * @param id
     * @return specific book
     */
    public Optional<Book> getBook(Long id){
        return bookRepository.findById(id);
    }

    /** This method save or update a book
     *
     * @param book
     */
    public void saveOrUpdate(Book book){
        bookRepository.save(book);
    }

    /** this method delete a specific book
     *
     * @param id
     */
    public void delete(Long id){
        bookRepository.deleteById(id);
    }

}
