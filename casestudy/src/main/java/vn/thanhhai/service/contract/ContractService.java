package vn.thanhhai.service.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.contract.AttachFacility;
import vn.thanhhai.model.contract.Contract;
import vn.thanhhai.model.contract.ContractDetail;
import vn.thanhhai.repository.contract.IContractRepo;

@Service
public class ContractService implements IContractService {

    @Autowired
    private IContractRepo contractRepo;


    @Override
    public Page<Contract> myFindAll(Pageable pageable) {
        return contractRepo.myFindAll(pageable);
    }

    @Override
    public void removeById(int id) {

    }

    @Override
    public void saveContract(Contract contract) {
        contractRepo.save(contract);
    }

    @Override
    public Contract findById(int id) {
        return null;
    }

    @Override
    public Contract myFindById(int attachId) {
        return contractRepo.myFindById(attachId);
    }

    @Override
    public AttachFacility findAttachFacility(int attachId) {
        return contractRepo.myFindAttachFacilityByIdAttach(attachId);
    }


}
