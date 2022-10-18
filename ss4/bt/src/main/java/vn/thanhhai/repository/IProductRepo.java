package vn.thanhhai.repository;

import vn.thanhhai.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepo {

    ArrayList<Product> findAll();

    Product findById(int id);

    List<Product> findByName(String name);

    void save(Product product);

    void update( int id, Product product);

    void delete(Product product);

}
