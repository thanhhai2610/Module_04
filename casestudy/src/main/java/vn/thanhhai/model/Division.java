package vn.thanhhai.model;

import javax.persistence.*;

@Entity
@Table
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}
