package vn.thanhhai.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.thanhhai.model.customer.Customer;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

    @Query(value = "SELECT * FROM case_study_m4.customer WHERE is_delete=1 ", nativeQuery = true)
    Page<Customer> myFindAll(Pageable pageable);


}
