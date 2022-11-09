package vn.thanhhai.service.contract;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.contract.AttachFacility;
import vn.thanhhai.model.contract.Contract;
import vn.thanhhai.model.contract.ContractDetail;
import vn.thanhhai.model.facility.Facility;

import java.util.List;

public interface IContractService {
    Page<Contract> myFindAll(Pageable pageable);

    void removeById(int id);

    void saveContract(Contract contract);

    Contract findById(int id);

    Contract myFindById(int attachId);

    AttachFacility findAttachFacility(int attachId);


}
