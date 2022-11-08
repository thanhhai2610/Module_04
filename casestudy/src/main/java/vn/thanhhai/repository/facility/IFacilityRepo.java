package vn.thanhhai.repository.facility;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.thanhhai.model.customer.Customer;
import vn.thanhhai.model.facility.Facility;

import javax.transaction.Transactional;

public interface IFacilityRepo extends JpaRepository<Facility, Integer> {

    @Query(value = "SELECT * FROM customer c" +
            "    inner join customer_type ct on c.customer_type_id = ct.id" +
            "    WHERE c.is_delete = 1" +
            "    and c.name like %:name%" +
            "    AND c.address LIKE %:address%" +
            "    and ct.name like %:type% ", nativeQuery = true)
    Page<Facility> search(@Param("name") String name,
                          @Param("address") String address,
                          @Param("type") String customerType, Pageable pageable);

//    @Query(value = "SELECT * FROM case_study_m4.facility WHERE is_delete=1  ", nativeQuery = true)
//    Page<Facility> myFindAll(Pageable pageable);

    @Query(value = "SELECT * FROM case_study_m4.facility " +
            "WHERE is_delete=1 " +
            "and name like %:name% " +
            "and facility_type_id like %:type%", nativeQuery = true)
    Page<Facility> myFindAll(@Param("name") String name,
                             @Param("type") String type,
                             Pageable pageable);
    @Transactional
    @Modifying
    @Query(value = "UPDATE `case_study_m4`.`facility` SET `is_delete` = 0 WHERE (`id` = :id)", nativeQuery = true)
    void removeById(@Param("id") int id);

}
