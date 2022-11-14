package vn.thanhhai.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.thanhhai.model.Product;

import javax.transaction.Transactional;

public interface IProductRepo extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT * FROM productthithum4.product " +
            "WHERE name like %:name% and price >= :price and is_status = 1 ", nativeQuery = true)
    Page<Product> search(@Param("name") String name,
                          @Param("price") String price,
                          Pageable pageable);
    @Transactional
    @Modifying
    @Query(value = "UPDATE `productthithum4`.`product` SET `is_status` = '0' WHERE `id` = :id", nativeQuery = true)
    void myRemove(@Param("id") int id);
}
