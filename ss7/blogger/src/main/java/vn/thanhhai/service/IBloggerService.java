package vn.thanhhai.service;

import vn.thanhhai.model.Bloger;

import java.util.List;

public interface IBloggerService {
    List<Bloger> findAll();

    Bloger findById(int id);

    void save(Bloger bloger);

    void remove(Bloger bloger);
}
