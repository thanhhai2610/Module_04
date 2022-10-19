package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Product;
import vn.thanhhai.repository.IProductRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepo productRepo;


    @Override
    public Product findById(int id) {
        return productRepo.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepo.findByName(name);
    }

    @Override
    public Product save(Product product) {
         return productRepo.save(product);
    }

    @Override
    public void update(int id, Product product) {
        productRepo.update(product);
    }

    @Override
    public void delete(Product product) {
        productRepo.delete(product);
    }
}
