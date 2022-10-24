package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.User;
import vn.thanhhai.repository.IUserRepo;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepo userRepo;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepo.findAll(pageable);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }
}
