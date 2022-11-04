package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.AppUser;

public interface UsesRepo extends JpaRepository<AppUser, Integer> {

    AppUser findByUsername(String username);
}
