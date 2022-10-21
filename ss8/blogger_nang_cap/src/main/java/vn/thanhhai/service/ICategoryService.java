package vn.thanhhai.service;

import vn.thanhhai.model.Bloger;
import vn.thanhhai.model.Category;

import java.util.List;

public interface ICategoryService {
    Category findById(int id);

    void save(Category category);

    List<Category> findAll();
}
