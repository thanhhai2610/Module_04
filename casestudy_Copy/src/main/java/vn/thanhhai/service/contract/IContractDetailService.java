package vn.thanhhai.service.contract;

import vn.thanhhai.model.contract.ContractDetail;
import vn.thanhhai.model.facility.FacilityType;

import java.util.List;

public interface IContractDetailService {

    List<ContractDetail> myFindAllContractDetail(int id);

    List<ContractDetail> myFindAll();

    void saveContractDetail(ContractDetail contractDetailExit);

    ContractDetail findContractDetail(int attachId, int contractId);

}
