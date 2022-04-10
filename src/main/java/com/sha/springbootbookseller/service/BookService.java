package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
