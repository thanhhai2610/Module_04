package vn.thanhhai.dto;

import vn.thanhhai.model.Product;

import java.util.HashMap;
import java.util.Map;

public class CartDto {
    private Map<ProductDto, Integer> productsMap = new HashMap<>();

    public CartDto() {
    }


    public Map<ProductDto, Integer> getProductsMap() {
        return productsMap;
    }

    public void setProductsMap(Map<ProductDto, Integer> productsMap) {
        this.productsMap = productsMap;
    }

    public void addProduct(ProductDto productDto) {
        if (productsMap.containsKey(productDto)) {
            Integer currentValue = productsMap.get(productDto);
            productsMap.put(productDto, currentValue + 1);
        } else {
            productsMap.put(productDto, 1);
        }

    }
}
