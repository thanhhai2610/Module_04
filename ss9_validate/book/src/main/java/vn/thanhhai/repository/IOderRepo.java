package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import vn.thanhhai.model.Book;
import vn.thanhhai.model.Oder;

import javax.persistence.criteria.Order;

@Repository
public interface IOderRepo extends JpaRepository<Oder, Integer> {
    @Query(value = "SELECT * from book_oder.oder where code = :keyword", nativeQuery = true)
    Oder findByCode(@Param("keyword") int code);
}
