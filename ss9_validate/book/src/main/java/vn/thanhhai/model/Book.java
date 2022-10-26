package vn.thanhhai.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int count;

    @OneToMany(mappedBy ="bookOder")
    private Set<Oder> oders;

    public Book() {
    }

    public Book(int id, String name, int count, Set<Oder> oders) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.oders = oders;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Set<Oder> getOders() {
        return oders;
    }

    public void setOders(Set<Oder> oders) {
        this.oders = oders;
    }
}
