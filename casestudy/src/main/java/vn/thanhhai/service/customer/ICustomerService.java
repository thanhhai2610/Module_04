package vn.thanhhai.service.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.customer.Customer;

public interface ICustomerService {

    Page<Customer> myFindAll(Pageable pageable);

    void saveCustomer(Customer customer);

    Page<Customer> search(String name, String address, String customerType,Pageable pageable);

    void removeById(int id);


}
