package vn.thanhhai.service;

import vn.thanhhai.model.Book;
import vn.thanhhai.model.Oder;

import java.util.List;

public interface IOderService {
    List<Oder> findAll();

    Oder findById(int id);

    void save(Oder oder);

}
