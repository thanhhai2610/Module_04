package vn.thanhhai.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Bloger;
import vn.thanhhai.repository.IBloggerRepo;

import java.util.List;


@Service
public class BloggerService implements IBloggerService {

    @Autowired
    private IBloggerRepo bloggerRepo;

    @Override
    public Page<Bloger> findAll(Pageable pageable) {
        return bloggerRepo.findAll(pageable);
    }

    @Override
    public List<Bloger> findAll() {
        return bloggerRepo.findAll();
    }

    @Override
    public Bloger findById(int id) {
        return bloggerRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Bloger bloger) {
        bloggerRepo.save(bloger);
    }

    @Override
    public void remove(Bloger bloger) {
        bloggerRepo.delete(bloger);
    }

    @Override
    public List<Bloger> getListByCategoryId(int id) {
        return bloggerRepo.findByCategoryId(id);
    }

    @Override
    public List<Bloger> getByName(String name) {
        return bloggerRepo.findByNameContains(name);
    }
}
