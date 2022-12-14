package vn.thanhhai.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;
import vn.thanhhai.model.employee.Employee;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "division" )
    @JsonIgnore
    @JsonBackReference
    private Set<Employee> employee;

    @Value("1")
    private int isDelete;


    public Division() {
    }

    public Division(int id, String name, Set<Employee> employee) {
        this.id = id;
        this.name = name;
        this.employee = employee;
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

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
