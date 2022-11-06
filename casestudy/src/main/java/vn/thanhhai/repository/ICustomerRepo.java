package vn.thanhhai.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.thanhhai.model.customer.Customer;
import vn.thanhhai.model.customer.CustomerType;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

    @Query(value = "SELECT * FROM case_study_m4.customer WHERE is_delete=1 ", nativeQuery = true)
    Page<Customer> myFindAll(Pageable pageable);


    @Query(value = "SELECT * FROM case_study_m4.customer " +
            "WHERE is_delete=1 " +
            "and name like %:name% " +
            "AND address LIKE %:address% " +
            "and gender = :gender", nativeQuery = true)
    Page<Customer> search(@Param("name") String name, @Param("address") String address, @Param("gender") int gender,Pageable pageable);


    @Modifying
    @Query(value = "INSERT INTO `case_study_m4`.`customer` (`address`, `date_of_birth`, `email`, " +
            "`gender`, `id_card`, `is_delete`, `name`, `phone_number`, `customer_type_id`) " +
            "VALUES (:address ,:date_of_birth ,:email ,:gender ,:id_card ,:is_delete ,:name ,:phone_number ,:customer_type_id )", nativeQuery = true)
    void saveCustomer(@Param("address") String address,
                      @Param("date_of_birth") String dateOfBirth,
                      @Param("email") String email,
                      @Param("gender") int gender,
                      @Param("id_card") String idCard,
                      @Param("is_delete") int isDelete,
                      @Param("name") String name,
                      @Param("phone_number") String phoneNumber,
                      @Param("customer_type_id") int customerTypeId);
    @Transactional
    @Modifying
    @Query(value = "UPDATE `case_study_m4`.`customer` SET `is_delete` = 0 WHERE (`id` = :id);\n", nativeQuery = true)
    void removeById(@Param("id") int id);


}
