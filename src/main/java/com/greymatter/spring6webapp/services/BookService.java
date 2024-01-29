package com.greymatter.spring6webapp.services;

import com.greymatter.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
