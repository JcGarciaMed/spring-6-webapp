package com.greymatter.spring6webapp.services;

import com.greymatter.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
