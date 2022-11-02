package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.User;

public interface UsesRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
