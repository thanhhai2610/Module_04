package vn.thanhhai.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.thanhhai.model.customer.Customer;
import vn.thanhhai.model.customer.CustomerType;

import java.util.List;

@Repository
public interface ICustomerTypeRepo extends JpaRepository<CustomerType, Integer> {

    @Query(value = "SELECT * FROM case_study_m4.customer_type WHERE is_delete=1 ", nativeQuery = true)
    List<CustomerType> myFindAllCustomerType();




}
