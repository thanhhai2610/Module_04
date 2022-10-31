package vn.thanhhai.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.Blogger;

public interface IBloggerRepo extends JpaRepository<Blogger, Integer> {


}
