package vn.thanhhai.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCategory;

    private String name;

    public Category() {
    }

    public Category(int idCategory, String name) {
        this.idCategory = idCategory;
        this.name = name;
    }

    @OneToMany(mappedBy = "category1")
    private Set<Bloger> blogs;

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
