package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.User;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
