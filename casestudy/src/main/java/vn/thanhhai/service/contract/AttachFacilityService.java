package vn.thanhhai.service.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.contract.AttachFacility;
import vn.thanhhai.repository.contract.IAttachFacilityRepo;

import java.util.List;
@Service
public class AttachFacilityService implements IAttachFacilityService {

    @Autowired
    private IAttachFacilityRepo attachFacilityRepo;

    @Override
    public List<AttachFacility> myFindAllAttachFacility() {
        return attachFacilityRepo.myFindAll();
    }

    @Override
    public AttachFacility findAttachFacilityById(int attachId) {
        return attachFacilityRepo.findById(attachId).orElse(null);
    }


}
