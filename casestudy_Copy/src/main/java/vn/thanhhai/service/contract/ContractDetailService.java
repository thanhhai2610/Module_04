package vn.thanhhai.service.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.contract.ContractDetail;
import vn.thanhhai.repository.contract.IContractDetailRepo;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    private IContractDetailRepo contractDetailRepo;

    @Override
    public List<ContractDetail> myFindAllContractDetail(int id ) {
        return contractDetailRepo.myFindAllContractDetail(id);
    }

    @Override
    public List<ContractDetail> myFindAll() {
        return contractDetailRepo.myFindAll();
    }

    @Override
    public void saveContractDetail(ContractDetail contractDetailExit) {
        contractDetailRepo.save(contractDetailExit);
    }

    @Override
    public ContractDetail findContractDetail(int attachId, int contractId) {
        return contractDetailRepo.myFindContractDetailByIdAttach(attachId, contractId);
    }


}
