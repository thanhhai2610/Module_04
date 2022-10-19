package vn.thanhhai.repository;

import vn.thanhhai.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepo {

    List<Product> findAll();

    Product findById(int id);

    List<Product> findByName(String name);

    Product save(Product product);

    void update( Product product);

    void delete(Product product);

}
