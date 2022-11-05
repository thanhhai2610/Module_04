package vn.thanhhai.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.customer.Customer;
import vn.thanhhai.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {

    Iterable <CustomerType> myFindAllCustomerType();

}
