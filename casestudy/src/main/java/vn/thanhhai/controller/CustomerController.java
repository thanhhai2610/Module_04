package vn.thanhhai.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.thanhhai.dto.CustomerDto;
import vn.thanhhai.model.customer.Customer;
import vn.thanhhai.repository.ICustomerRepo;
import vn.thanhhai.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String showCustomerList(@PageableDefault(value = 5) Pageable pageable, Model model) {
        Page<Customer> customerPage = customerService.myFindAll(pageable);
        List<CustomerDto> customerDtoList = new ArrayList<>();

        for (Customer customer : customerPage) {
            CustomerDto customerDto = new CustomerDto();
            BeanUtils.copyProperties(customer, customerDto);
            customerDto.setNameCustomerType(customer.getCustomerType().getName());
            customerDtoList.add(customerDto);
        }

        Page<CustomerDto> customerDtoListPage = new PageImpl<>(customerDtoList, pageable, customerPage.getTotalElements());




        model.addAttribute("customerDto", customerDtoListPage);
        return "/customer/list";
    }


}
