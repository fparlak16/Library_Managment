package com.project.library.Services;

import com.project.library.Repositories.BookRepo;
import org.springframework.stereotype.Service;

@Service
public class BookService {
   private BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
}
