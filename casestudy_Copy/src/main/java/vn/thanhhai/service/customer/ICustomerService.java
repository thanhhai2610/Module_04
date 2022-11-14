package vn.thanhhai.service.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.thanhhai.model.customer.Customer;

import java.util.List;

public interface ICustomerService {

    Page<Customer> myFindAll(Pageable pageable);

    List<Customer> myFindAllList();

    void saveCustomer(Customer customer);

    Page<Customer> search(String name, String address, String customerType, Pageable pageable);

    void removeById(int id);


}
