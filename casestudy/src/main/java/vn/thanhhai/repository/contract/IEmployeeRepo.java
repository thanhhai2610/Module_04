package vn.thanhhai.repository.contract;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.thanhhai.model.employee.Employee;

import javax.transaction.Transactional;
import java.util.List;

public interface IEmployeeRepo extends JpaRepository<Employee,Integer> {

    @Query(value = "select * from `employee` where is_delete= 1", nativeQuery = true)
    List<Employee> myFindAll();

    @Transactional
    @Modifying
    @Query(value = "update employee set is_delete = 0 where id = :id", nativeQuery = true)
    void remove(@Param("id") int id);
}
