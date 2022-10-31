package vn.thanhhai.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Bloger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBlog;
    private String name;
    private String content;
    private String image;

    @ManyToOne
    @JsonBackReference
    @JsonIgnore
    @JoinColumn(name = "category_id", referencedColumnName = "idCategory")
    private Category category1;

    public Bloger() {
    }

    public Bloger(int idBlog, String name, String content, String image) {
        this.idBlog = idBlog;
        this.name = name;
        this.content = content;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    public Category getCategory1() {
        return category1;
    }

    public void setCategory1(Category category1) {
        this.category1 = category1;
    }
}
