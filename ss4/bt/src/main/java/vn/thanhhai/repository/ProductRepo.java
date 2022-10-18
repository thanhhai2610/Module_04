package vn.thanhhai.repository;

import org.springframework.stereotype.Repository;
import vn.thanhhai.model.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@Repository
public class ProductRepo implements IProductRepo {

    private static final Map<Integer, Product> products;

    static {
        products = new LinkedHashMap<>();
        products.put(1, new Product(1, "iPhone 5s", 1000000.0, "Apple"));
        products.put(2, new Product(2, "iPhone 6", 2000000.0, "Apple"));
        products.put(3, new Product(3, "iPhone 7", 3000000.0, "Apple"));
        products.put(4, new Product(4, "iPhone 8", 4000000.0, "Apple"));
        products.put(5, new Product(5, "iPhone X", 5000000.0, "Apple"));
        products.put(6, new Product(6, "iPhone 11", 6000000.0, "Apple"));
    }

    @Override
    public ArrayList<Product> findAll() {
        return new ArrayList<>(products.values());

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }


    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getName().contains(name)) {
                productList.add(product);
            }
        }
        return productList;
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }


    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void delete(Product product) {
        products.remove(product.getId());
    }
}
