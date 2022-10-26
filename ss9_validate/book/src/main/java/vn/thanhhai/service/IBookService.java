package vn.thanhhai.service;

import vn.thanhhai.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book findById(int id);

    void save(Book book);

}
