package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.dto.InformativeArticlesDto;
import vn.thanhhai.model.InformativeArticles;

public interface IInformativeArticlesRepo extends JpaRepository<InformativeArticles,Integer> {
}
