package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.repository.ICustomerTypeRepo;
import vn.thanhhai.model.customer.CustomerType;


import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService{

    @Autowired
    private ICustomerTypeRepo customerTypeRepo ;


    @Override
    public Iterable<CustomerType> myFindAllCustomerType() {
        return customerTypeRepo.myFindAllCustomerType();
    }

}
