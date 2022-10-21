package vn.thanhhai.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.Bloger;

import java.util.List;
public interface IBloggerService {
    Page<Bloger> findAll(Pageable pageable);

    Bloger findById(int id);

    void save(Bloger bloger);

    void remove(Bloger bloger);
}
