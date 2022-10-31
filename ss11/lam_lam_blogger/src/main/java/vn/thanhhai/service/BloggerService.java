package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Blogger;
import vn.thanhhai.repository.IBloggerRepo;

import java.util.List;
@Service
public class BloggerService implements IBloggerService {

    @Autowired
    private IBloggerRepo bloggerRepo;

    @Override
    public List<Blogger> findAll() {
        return bloggerRepo.findAll();
    }

    @Override
    public Blogger findById(int id) {
        return bloggerRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Blogger blogger) {
        bloggerRepo.save(blogger);
    }

    @Override
    public void remove(Blogger blogger) {
        bloggerRepo.delete(blogger);
    }
}
