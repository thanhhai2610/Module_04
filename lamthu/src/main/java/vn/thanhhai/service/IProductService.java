package vn.thanhhai.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.Product;

import java.util.List;

public interface IProductService {
    Page<Product> myFindAll(String name, String price ,Pageable pageable);

    List<Product> myFindAll();

    void remove(int id);


    void save(Product product);

    Product findById(int id);
}
