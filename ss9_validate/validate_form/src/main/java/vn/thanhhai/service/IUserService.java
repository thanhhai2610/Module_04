package vn.thanhhai.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.User;

import java.util.List;

public interface IUserService {

    Page<User> findAll(Pageable pageable);

    void save(User user);

}
