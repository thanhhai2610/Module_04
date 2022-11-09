package vn.thanhhai.repository.contract;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.thanhhai.model.contract.AttachFacility;
import vn.thanhhai.model.contract.Contract;
import vn.thanhhai.model.contract.ContractDetail;
import vn.thanhhai.model.employee.Employee;

import java.util.List;

public interface IAttachFacilityRepo extends JpaRepository<AttachFacility, Integer> {
    @Query(value = "select * from `attach_facility` where is_delete= 1", nativeQuery = true)
    List<AttachFacility> myFindAll();

}
