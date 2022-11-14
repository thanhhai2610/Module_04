package vn.thanhhai.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import vn.thanhhai.model.Producer;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ProductDto implements Validator {
    private int id;

    @NotBlank(message = "Tên không được để trống.")
    @Pattern(regexp = "^(([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5})| *$",
            message = "Tên  không được chứa số, và các kí tự đầu tiên của mỗi từ phải viết hoa.")
    private String name;

    @NotNull(message = "Không được để trống.")
    private double price;

    @NotBlank(message = "Không được để trống.")
    private String descriptionProduct;
    private Producer producer;

    public ProductDto() {
    }

    public ProductDto(int id, String name, double price, String descriptionProduct, Producer producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descriptionProduct = descriptionProduct;
        this.producer = producer;
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

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
