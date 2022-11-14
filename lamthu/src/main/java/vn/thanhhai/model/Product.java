package vn.thanhhai.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    private double price;
    private String description;


    @ManyToOne
    @JoinColumn(name = "producer_id", referencedColumnName = "id")
    private Producer producer;
    private int isStatus = 1;

    public Product() {
    }


    public int getId() {
        return id;
    }

    public Product(int id, String name, double price, String description, int isStatus, Producer producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.isStatus = isStatus;
        this.producer = producer;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public int getIsStatus() {
        return isStatus;
    }

    public void setIsStatus(int isStatus) {
        this.isStatus = isStatus;
    }
}
