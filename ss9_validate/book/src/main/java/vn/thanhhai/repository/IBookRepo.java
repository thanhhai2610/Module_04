package vn.thanhhai.repository;

import org.hibernate.boot.JaccPermissionDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.Book;

public interface IBookRepo extends JpaRepository<Book,Integer> {
}
