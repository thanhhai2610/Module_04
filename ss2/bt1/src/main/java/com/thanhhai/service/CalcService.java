package com.thanhhai.service;

import com.thanhhai.repository.ICalcRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcService implements ICalcService {

    @Autowired
    ICalcRepo calcRepo;


    @Override
    public double cong(double a, double b, String tinh) {
       return calcRepo.cong(a, b,tinh);

    }

}
