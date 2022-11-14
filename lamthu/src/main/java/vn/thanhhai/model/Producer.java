package vn.thanhhai.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Producer<set> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String name;

    @Column(name="isStatus")
    private int isStatus = 1;

    @OneToMany(mappedBy="producer")
    private Set<Product> product;

    public Producer() {
    }


    public int getId() {
        return id;
    }

    public Producer(int id, String name, int isStatus, Set<Product> product) {
        this.id = id;
        this.name = name;
        this.isStatus = isStatus;
        this.product = product;
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

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public int getIsStatus() {
        return isStatus;
    }

    public void setIsStatus(int isStatus) {
        this.isStatus = isStatus;
    }
}
