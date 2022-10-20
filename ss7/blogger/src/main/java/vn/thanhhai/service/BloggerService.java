package vn.thanhhai.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Bloger;
import vn.thanhhai.repository.IBloggerRepo;

import java.util.List;

@Service
public class BloggerService implements IBloggerService {

    @Autowired
    private IBloggerRepo bloggerRepo;


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
}
