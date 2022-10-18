package vn.thanhhai.service;

import vn.thanhhai.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {

    Product findById(int id);

    ArrayList<Product>  findAll();

    List<Product> findByName(String name);

    void save(Product product);

    void update(int id, Product product);

    void delete(Product product);
}
