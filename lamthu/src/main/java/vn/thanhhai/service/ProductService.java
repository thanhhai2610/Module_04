package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Product;
import vn.thanhhai.repository.IProductRepo;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepo productRepo;
    @Override
    public Page<Product> myFindAll(String name, String price ,Pageable pageable) {
        return productRepo.search(name, price, pageable);
    }

    @Override
    public List<Product> myFindAll() {
        return productRepo.findAll();
    }

    @Override
    public void remove(int id) {
        productRepo.myRemove(id);
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).orElse(null);
    }


}
