package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Book;
import vn.thanhhai.repository.IBookRepo;

import java.util.List;
@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepo bookRepo;
    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        bookRepo.save(book);
    }
}
