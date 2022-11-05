package vn.thanhhai.model.customer;

import org.springframework.beans.factory.annotation.Value;
import vn.thanhhai.model.customer.Customer;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


    @OneToMany(mappedBy = "customerType")
    private Set<Customer>  customer;

    @Value("1")
    private int isDelete;

    public CustomerType() {
    }

    public CustomerType(int id, String name, Set<Customer> customer) {
        this.id = id;
        this.name = name;
        this.customer = customer;
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

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
