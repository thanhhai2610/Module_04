package vn.thanhhai.service.facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.facility.FacilityType;
import vn.thanhhai.repository.facility.IFacilityTypeRepo;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    private IFacilityTypeRepo facilityTypeRepo;


    @Override
    public List<FacilityType> myFindAllFacilityType() {
        return facilityTypeRepo.myFindAllFacilityType();
    }


}
