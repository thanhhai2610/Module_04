package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Producer;
import vn.thanhhai.repository.IProducerRepo;

import java.util.List;

@Service
public class ProducerService implements IProducerService {
    @Autowired
    IProducerRepo producerRepo;

//    @Override
//    public Page<Producer> myFindAll(Pageable pageable) {
//        return producerRepo.findAll(pageable);
//    }

    @Override
    public List<Producer> myFindAll() {
        return producerRepo.findAll();
    }
}
