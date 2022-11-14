package vn.thanhhai.repository.facility;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.thanhhai.model.customer.CustomerType;
import vn.thanhhai.model.facility.FacilityType;

import java.util.List;

public interface IFacilityTypeRepo extends JpaRepository<FacilityType,Integer> {
    @Query(value = "SELECT * FROM case_study_m4.facility_type WHERE is_delete=1 ", nativeQuery = true)
    List<FacilityType> myFindAllFacilityType();

}
