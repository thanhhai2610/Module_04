package vn.thanhhai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.thanhhai.model.Position;

public interface IPositionRepo extends JpaRepository<Position, Integer> {
}
