package vn.thanhhai.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    Page<Customer> myFindAll(Pageable pageable);

//    List<Customer> findAll();
//
//    Customer findById(int id);
//
//    Customer findByName(String name);

//    void saveCustomer(Customer customer);
//
//    void deleteCustomer(Customer customer);
//
//    void updateCustomer(Customer customer);


}
