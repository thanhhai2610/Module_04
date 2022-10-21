package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Category;
import vn.thanhhai.repository.ICategoryReppo;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryReppo categoryReppo;

    @Override
    public Category findById(int id) {
        return categoryReppo.findById(id).orElse(null);
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public List<Category> findAll() {
        return categoryReppo.findAll();
    }
}
