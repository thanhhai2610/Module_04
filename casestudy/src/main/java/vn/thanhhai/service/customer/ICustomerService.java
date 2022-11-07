package vn.thanhhai.service.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.customer.Customer;

public interface ICustomerService {

    Page<Customer> myFindAll(Pageable pageable);

    void saveCustomer(Customer customer);

    Page<Customer> search(String name, String address, String customerType,Pageable pageable);

//    List<Customer> findAll();
//
//    Customer findById(int id);
//
//    Customer findByName(String name);

//    void saveCustomer(Customer customer);
//
    void removeById(int id);
//
//    void updateCustomer(Customer customer);


}
