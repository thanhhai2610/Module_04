package vn.thanhhai.service;

import vn.thanhhai.model.Blogger;

import java.util.List;

public interface IBloggerService {
    List<Blogger> findAll();

    Blogger findById(int id);

    void save(Blogger bloger);

    void remove(Blogger bloger);

}
