package vn.thanhhai.service;

import vn.thanhhai.model.Book;
import vn.thanhhai.model.Oder;

import java.util.List;

public interface IOderService {
    List<Oder> findAll();

    Oder findById(int id);

    Oder findByCode(int keyword);

    void save(Oder oder);

    void delete(Oder oder);


}
