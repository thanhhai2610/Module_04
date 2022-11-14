package vn.thanhhai.repository.contract;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.thanhhai.model.contract.Contract;
import vn.thanhhai.model.contract.ContractDetail;
import vn.thanhhai.model.employee.Employee;

import java.util.List;

public interface IContractDetailRepo extends JpaRepository<ContractDetail, Integer> {
//    @Query(value = "select af.name as nameDto," +
//            "af.unit as unitDto," +
//            "sum(ifnull(cd.quantity, 0)) as quantityDto," +
//            "af.status as statusDto," +
//            "af.cost as costDto " +
//            "from contract_detail cd" +
//            "join attach_facility af on cd.attach_facility_id = af.id" +
//            "where cd.contract_id = :id " +
//            "group by af.id  ", nativeQuery = true)
//    List<ContractDetail> myFindAllContractDetail(@Param("id") int id);

    @Query(value = "select * from `contract_detail` where is_delete = 1 and contract_id = :id", nativeQuery = true)
    List<ContractDetail> myFindAllContractDetail(@Param("id") int id);

    @Query(value = "select * from `contract_detail` where is_delete= 1", nativeQuery = true)
    List<ContractDetail> myFindAll();

    @Query(value = "select * from `contract_detail` where is_delete= 1 and  contract_id = :contractId1 " +
            "and  attach_facility_id = :attachId", nativeQuery = true)
    ContractDetail myFindContractDetailByIdAttach(@Param("attachId") int attachId,
                                                  @Param("contractId1") int contractId1);
}
