package com.sha.springbootbookseller.repository;

import com.sha.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
