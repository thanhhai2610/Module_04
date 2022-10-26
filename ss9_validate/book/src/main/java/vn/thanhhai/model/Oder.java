package vn.thanhhai.model;

import javax.persistence.*;

@Entity
@Table
public class Oder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int code;
    private String date;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book bookOder;

    public Oder() {
    }

    public Oder(int id, int code, String date, Book bookOder) {
        this.id = id;
        this.code = code;
        this.date = date;
        this.bookOder = bookOder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Book getBookOder() {
        return bookOder;
    }

    public void setBookOder(Book bookOder) {
        this.bookOder = bookOder;
    }
}
