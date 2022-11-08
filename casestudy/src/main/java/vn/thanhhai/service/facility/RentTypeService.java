package vn.thanhhai.service.facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.facility.RentType;
import vn.thanhhai.repository.facility.IRentTypeRepo;

import java.util.List;
@Service
public class RentTypeService implements IRentTypeService {

    @Autowired
    private IRentTypeRepo rentTypeRepo;

    @Override
    public List<RentType> myFindAllRentType() {
        return rentTypeRepo.myFindAllRentType();
    }

}
