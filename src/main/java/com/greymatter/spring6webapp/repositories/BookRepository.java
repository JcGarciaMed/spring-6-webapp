package com.greymatter.spring6webapp.repositories;

import com.greymatter.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
