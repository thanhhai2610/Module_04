package vn.thanhhai.repository;



import vn.thanhhai.model.Users;

import java.util.List;

public interface ILoginRepository {

    List<Users> findAll();

    void save(Users users);

    public List<Users> findByName(String keyword);

}
