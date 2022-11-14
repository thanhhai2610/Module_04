package vn.thanhhai.service.contract;

import vn.thanhhai.model.contract.AttachFacility;

import java.util.List;

public interface IAttachFacilityService {
     List<AttachFacility> myFindAllAttachFacility();

    AttachFacility findAttachFacilityById(int attachId);
}
