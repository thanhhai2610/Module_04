package com.thanhhai.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CaclcRepo implements ICalcRepo {

    @Override
    public double cong (double a, double b, String tinh) {

        if (tinh.equals("cong")) {
            return a + b;
        } else if (tinh.equals("tru")) {
            return a - b;
        } else if (tinh.equals("nhan")) {
            return a * b;
        } else {
            return a / b;
        }
    }
}
