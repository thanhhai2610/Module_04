package vn.thanhhai.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.customer.Customer;
import vn.thanhhai.repository.customer.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepo customerRepo;


    @Override
    public Page<Customer> myFindAll(Pageable pageable) {
        return customerRepo.myFindAll(pageable);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);
    }



    @Override
    public Page<Customer> search(String name, String address, String customerType, Pageable pageable) {
        return customerRepo.search(name, address, customerType, pageable);
    }

    @Override
    public void removeById(int id) {
        customerRepo.removeById(id);
    }

}
