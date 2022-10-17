package vn.thanhhai.repository;

import org.springframework.stereotype.Repository;
import vn.thanhhai.model.Users;

import java.util.ArrayList;
import java.util.List;


@Repository
public class LoginRepo implements ILoginRepository {
    private static List<Users> users;
    static {
        users = new ArrayList<>();
        Users u1 = new Users();
        u1.setAge(10);
        u1.setName("John");
        u1.setAccount("john");
        u1.setEmail("john@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        Users u2 = new Users();
        u2.setAge(15);
        u2.setName("Bill");
        u2.setAccount("bill");
        u2.setEmail("bill@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Mike");
        u3.setAccount("mike");
        u2.setEmail("mike@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }

    static {
        usersList = new ArrayList<>();


    }
    @Override
    public List<Users> findAll() {
        return usersList;
    }

    @Override
    public void save(Users users) {

    }

    @Override
    public List<Users> findByName(String keyword) {
        return null;
    }
}
