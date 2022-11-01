package vn.thanhhai.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategory;

    private String name;

    @OneToMany(mappedBy = "category1")
    @JsonBackReference
    private Set<Bloger> blogs;

    public Category() {
    }

    public Category(int idCategory, String name) {
        this.idCategory = idCategory;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public Set<Bloger> getBlogs() {
        return blogs;
    }

    public void setBlogs(Set<Bloger> blogs) {
        this.blogs = blogs;
    }
}
