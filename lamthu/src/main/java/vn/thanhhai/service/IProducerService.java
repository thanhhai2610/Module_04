package vn.thanhhai.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.Producer;

import java.util.List;

public interface IProducerService {
//    Page<Producer> myFindAll(Pageable pageable);

    List<Producer> myFindAll();

//    void save(Producer producer);
//
//    void remove(Producer producer);

}
