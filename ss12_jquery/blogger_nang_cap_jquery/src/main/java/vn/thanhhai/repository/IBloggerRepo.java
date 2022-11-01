package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.thanhhai.model.Bloger;

import javax.transaction.Transactional;
import java.util.List;

public interface IBloggerRepo extends JpaRepository<Bloger, Integer> {

    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM bloger WHERE category_id = :keyword", nativeQuery = true)
    List<Bloger> findByCategoryId(@Param("keyword") int categoryId);

    @Query(value = "SELECT * FROM bloger WHERE name like %:keyword%", nativeQuery = true)
    List<Bloger> findByNameContains(@Param("keyword") String name);

//    List<Bloger> findByNameContains(String name);
}
