package vn.thanhhai.service.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.employee.Employee;
import vn.thanhhai.repository.contract.IEmployeeRepo;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepo employeeRepo;
    @Override
    public List<Employee> myFindAllEmployee() {
        return employeeRepo.myFindAll();
    }
}
