package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.Product;

import java.util.List;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
