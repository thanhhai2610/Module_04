package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.Category;

public interface ICategoryReppo extends JpaRepository<Category,Integer> {
}
