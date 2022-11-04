package vn.thanhhai.model.employee;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class AppUser {

    @Id
    private String userName;

    private String password;

    @OneToOne(mappedBy = "appUser")
    private Employee employee;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id "))
    private List<AppRole> appRole;

    @Value("1")
    private int isDelete;

    public AppUser() {
    }

    public AppUser(String userName, String password , Employee employee, List<AppRole> appRole, int isDelete) {
        this.userName = userName;
        this.password = password;
        this.employee = employee;
        this.appRole = appRole;
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

    public List<AppRole> getAppRole() {
        return appRole;
    }

    public void setAppRole(List<AppRole> appRole) {
        this.appRole = appRole;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
