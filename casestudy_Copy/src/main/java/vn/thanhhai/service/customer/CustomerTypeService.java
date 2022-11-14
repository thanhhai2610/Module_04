package vn.thanhhai.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.repository.customer.ICustomerTypeRepo;
import vn.thanhhai.model.customer.CustomerType;

@Service
public class CustomerTypeService implements ICustomerTypeService{

    @Autowired
    private ICustomerTypeRepo customerTypeRepo ;


    @Override
    public Iterable<CustomerType> myFindAllCustomerType() {
        return customerTypeRepo.myFindAllCustomerType();
    }

}
