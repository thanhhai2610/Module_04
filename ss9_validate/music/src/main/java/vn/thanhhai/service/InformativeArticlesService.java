package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.InformativeArticles;
import vn.thanhhai.repository.IInformativeArticlesRepo;

import java.util.List;

@Service
public class InformativeArticlesService implements IInformativeArticlesService {


    @Autowired
    private IInformativeArticlesRepo iInformativeArticlesRepo;

    @Override
    public List<InformativeArticles> findAll() {
        return iInformativeArticlesRepo.findAll();
    }

    @Override
    public void save(InformativeArticles informativeArticles) {
        iInformativeArticlesRepo.save(informativeArticles);
    }

    @Override
    public InformativeArticles findById(int id) {
        return iInformativeArticlesRepo.findById(id).orElse(null);
    }
}
