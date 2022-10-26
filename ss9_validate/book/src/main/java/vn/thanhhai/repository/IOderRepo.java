package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.Book;
import vn.thanhhai.model.Oder;

public interface IOderRepo extends JpaRepository<Oder,Integer> {
}
