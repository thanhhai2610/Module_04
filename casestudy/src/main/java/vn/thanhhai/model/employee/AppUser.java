package vn.thanhhai.model.employee;

import org.springframework.beans.factory.annotation.Value;
import vn.thanhhai.model.employee.Employee;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class MyUser {

    @Id
    private String userName;

    private String password;

    @OneToOne(mappedBy = "myUser")
    private Employee employee;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id "))
    private List<Role> role;

    @Value("1")
    private int isDelete;

    public MyUser() {
    }

    public MyUser(String userName, String password , Employee employee, List<Role> role, int isDelete) {
        this.userName = userName;
        this.password = password;
        this.employee = employee;
        this.role = role;
        this.isDelete = isDelete;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
