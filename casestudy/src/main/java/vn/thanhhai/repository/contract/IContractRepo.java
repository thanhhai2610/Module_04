package vn.thanhhai.repository.contract;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.thanhhai.model.contract.AttachFacility;
import vn.thanhhai.model.contract.Contract;
import vn.thanhhai.model.contract.ContractDetail;

import java.util.List;


public interface IContractRepo extends JpaRepository<Contract, Integer> {
    @Query(value =
            "select * from case_study_m4.contract where is_delete = 1 ",
            nativeQuery = true)
    Page<Contract> myFindAll(Pageable pageable);

    @Query(value = "select * from `contract` where is_delete= 1", nativeQuery = true)
    List<Contract> myFindAll();

    @Query(value = "select * from `contract` where is_delete= 1 and  id = :id", nativeQuery = true)
    Contract myFindById(@Param("id") int id);

    @Query(value = "select * from `attach_facility` where is_delete= 1 and  id = :id", nativeQuery = true)
    AttachFacility myFindAttachFacilityByIdAttach(@Param("id") int attachId);


//
//    @Query(value =
//            "select`contract`.`id` as contractId," +
//            " `contract`.`start_date` as startDate, " +
//            "`contract`.`end_date` as endDate," +
//            " `contract`.`deposit` as `deposit`," +
//             "`customer`.`name` as customerName, " +
//             "`employee`.`name` as employeeName, " +
//             " `facility`.`name` as facilityName, " +
//            "(`facility`.`cost` + `contract`.`deposit` + sum(ifnull(`contract_detail`.`quantity`, 0) * ifnull(`attach_facility`.`cost`, 0))) as totalMoney " +
//            "from `contract` " +
//            "left join `facility` on `contract`.`facility_id` = `facility`.`id` " +
//            "left join `employee` on `contract`.`employee_id` = `employee`.`id` " +
//            "left join `customer` on `contract`.`customer_id` = `customer`.`id` " +
//            "left join `contract_detail` on `contract_detail`.`contract_id` = `contract`.`id` " +
//            "left join `attach_facility` on `attach_facility`.`id` = `contract_detail`.`attach_facility_id` " +
//            "where `contract`.`is_delete` = 1 " +
//            "group by `contract`.`id`",
//            nativeQuery = true)
//    Page<Contract> myFindAll(Pageable pageable);

}
