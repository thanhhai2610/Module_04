package vn.thanhhai.dto;

import java.util.Objects;

public class ProductDto {
    private int id;
    private String name;
    private String img;
    private double price;
    private String descriptionProduct;

    public ProductDto(int id, String name, String img, double price, String descriptionProduct) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.descriptionProduct = descriptionProduct;
    }

    public ProductDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return id == that.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
