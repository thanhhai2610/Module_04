package vn.thanhhai.service.facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.facility.Facility;
import vn.thanhhai.repository.facility.IFacilityRepo;

import java.util.Optional;


@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepo facilityRepo;


    @Override
    public Page<Facility> myFindAll(String name, String id, Pageable pageable) {
        return facilityRepo.myFindAll(name, id, pageable);
    }

    @Override
    public void removeById(int id) {
        facilityRepo.removeById(id);
    }

    @Override
    public void saveFacility(Facility facility) {
        facilityRepo.save(facility);
    }

    @Override
    public Facility findById(int id) {
        return facilityRepo.findById(id).orElse(null);
    }
}
