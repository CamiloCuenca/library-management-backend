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

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBook(Long id){
        return bookRepository.findById(id);
    }

    public void saveOrUpdate(Book book){
        bookRepository.save(book);
    }

    public void delete(Long id){
        bookRepository.deleteById(id);
    }

}
