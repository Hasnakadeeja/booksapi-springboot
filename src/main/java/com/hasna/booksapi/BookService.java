package com.hasna.booksapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class BookService {
    private final List<Book> books = new ArrayList<>();
    private long nextId = 1;

    public List<Book> findAll() {
        return books;
    }

    public Book add(Book book) {
        book.setId(nextId++);
        books.add(book);
        return book;
    }

    public Book findById(Long id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public Book update(Long id, Book updatedBook){
        for(Book b : books){
            if(b.getId().equals(id)){
                b.setTitle(updatedBook.getTitle());
                b.setAuthor(updatedBook.getAuthor());
                return b;
            }
        }
        return null;
    }

    public boolean delete(Long id){
      return books.removeIf(b -> b.getId().equals(id));
    }

}
