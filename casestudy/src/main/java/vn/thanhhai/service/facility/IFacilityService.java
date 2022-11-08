package vn.thanhhai.service.facility;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.facility.Facility;

import java.util.Optional;

public interface IFacilityService {

    Page<Facility> myFindAll(String name, String id,  Pageable pageable);


//    Page<Customer> search(String name, String address, String customerType,Pageable pageable);

    void removeById(int id);

    void saveFacility(Facility facility);

    Facility findById(int id);
}
