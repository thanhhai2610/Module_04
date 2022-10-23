package vn.thanhhai.service;

import vn.thanhhai.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    Product findById(int id);

    List<Product>  findAll();

    List<Product> findByName(String name);

    Product save(Product product);

    void update(int id, Product product);

    void delete(Product product);
}
