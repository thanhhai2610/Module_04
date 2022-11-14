package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.Producer;

public interface IProducerRepo extends JpaRepository<Producer,Integer> {


}
