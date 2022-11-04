package vn.thanhhai.model.employee;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String roleName;

    @ManyToMany(mappedBy = "role")
    private Set<MyUser> myUser;

    @Value("1")
    private int isDelete;

    public Role() {
    }

    public Role(int id, String roleName, Set<MyUser> myUser, int isDelete) {
        this.id = id;
        this.roleName = roleName;
        this.myUser = myUser;
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

    public Set<MyUser> getMyUser() {
        return myUser;
    }

    public void setMyUser(Set<MyUser> myUser) {
        this.myUser = myUser;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
