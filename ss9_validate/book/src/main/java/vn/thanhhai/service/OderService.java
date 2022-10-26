package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Oder;
import vn.thanhhai.repository.IOderRepo;

import java.util.List;

@Service
public class OderService implements IOderService {
    @Autowired
    private IOderRepo oderRepo;

    @Override
    public List<Oder> findAll() {
        return oderRepo.findAll();
    }

    @Override
    public Oder findById(int id) {
        return oderRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Oder oder) {
        oderRepo.save(oder);
    }
}
