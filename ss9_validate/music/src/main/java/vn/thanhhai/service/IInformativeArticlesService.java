package vn.thanhhai.service;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.dto.InformativeArticlesDto;
import vn.thanhhai.model.InformativeArticles;

import java.util.List;

public interface IInformativeArticlesService  {
    List<InformativeArticles> findAll();
    void save(InformativeArticles informativeArticles);
    InformativeArticles findById(int id);

}
