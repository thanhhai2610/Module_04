package vn.thanhhai.model.employee;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String roleName;

    @ManyToMany(mappedBy = "appRole")
    private Set<AppUser> appUser;

    @Value("1")
    private int isDelete;

    public AppRole() {
    }

    public AppRole(int id, String roleName, Set<AppUser> appUser, int isDelete) {
        this.id = id;
        this.roleName = roleName;
        this.appUser = appUser;
        this.isDelete = isDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<AppUser> getAppUser() {
        return appUser;
    }

    public void setAppUser(Set<AppUser> appUser) {
        this.appUser = appUser;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
