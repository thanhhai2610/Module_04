package vn.thanhhai.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.Bloger;

public interface IBloggerRepo extends JpaRepository<Bloger,Integer> {

}
