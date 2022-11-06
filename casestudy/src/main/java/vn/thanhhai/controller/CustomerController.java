package vn.thanhhai.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.thanhhai.dto.CustomerDto;
import vn.thanhhai.model.customer.Customer;
import vn.thanhhai.model.customer.CustomerType;
import vn.thanhhai.repository.ICustomerRepo;
import vn.thanhhai.service.ICustomerService;
import vn.thanhhai.service.ICustomerTypeService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("")
    public String showCustomerList(@PageableDefault(value = 10) Pageable pageable, Model model) {
        Page<Customer> customerPage = customerService.myFindAll(pageable);
        List<CustomerDto> customerDtoList = new ArrayList<>();
        CustomerDto customerDto = new CustomerDto();

        for (Customer customer : customerPage) {
            CustomerDto customerDto1 = new CustomerDto();
            BeanUtils.copyProperties(customer, customerDto1);
            customerDtoList.add(customerDto1);
        }

        Page<CustomerDto> customerDtoListPage
                = new PageImpl<>(customerDtoList, pageable, customerPage.getTotalElements());

        List<CustomerType> customerTypeList = (List<CustomerType>) customerTypeService.myFindAllCustomerType();

        model.addAttribute("customerTypeList", customerTypeList);
        model.addAttribute("customerDto", customerDto);
        model.addAttribute("customerDtoListPage", customerDtoListPage);
        return "/customer/list";
    }


    @PostMapping("/create")
    private String addCustomer(@ModelAttribute("customerDto") CustomerDto customerDto,
                               BindingResult bindingResult,
                               RedirectAttributes redirect) {
        if (!bindingResult.hasErrors()) {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.saveCustomer(customer);

            redirect.addFlashAttribute("message", "Customer created successfully");
        } else {
            redirect.addFlashAttribute("message", "Customer creation failed");
        }
        return "redirect:/customer/";
    }

    @GetMapping("/search")
    public String search(@RequestParam("searchNname") String name,
                         @RequestParam("searchAddress") String address,
                         @RequestParam("searchGender") int gender,
                         @PageableDefault(value = 10) Pageable pageable,
                         Model model,
                         RedirectAttributes redirectAttributes) {

        Page<Customer> customerList = customerService.search(name, address, gender, pageable);
        List<CustomerDto> customerDtoList = new ArrayList<>();
        CustomerDto customerDto = new CustomerDto();
        for (Customer customer : customerList) {
            CustomerDto customerDto1 = new CustomerDto();
            BeanUtils.copyProperties(customer, customerDto1);
            customerDtoList.add(customerDto1);
        }
        Page<CustomerDto> customerDtoListPage
                = new PageImpl<>(customerDtoList, pageable, customerList.getTotalElements());

        List<CustomerType> customerTypeList = (List<CustomerType>) customerTypeService.myFindAllCustomerType();

        model.addAttribute("customerTypeList", customerTypeList);
        model.addAttribute("customerDto", customerDto);
        model.addAttribute("customerDtoListPage", customerDtoListPage);
        return "/customer/list";
    }

    @GetMapping("/edit/{id}")
    public String getCustomer(@ModelAttribute("customerDto") String customerDto,
                              BindingResult bindingResult,
                              RedirectAttributes redirect,
                              Model model) {
        if (!bindingResult.hasErrors()) {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.saveCustomer(customer);

            redirect.addFlashAttribute("message", "Customer created successfully");
        } else {
            redirect.addFlashAttribute("message", "Customer creation failed");
        }
        return "redirect:/customer/";
    }

    @GetMapping("/delete/{idDelete}")
    public String deleteCustomer(@PathVariable("idDelete") int idDelete ) {
        customerService.removeById(idDelete);
        return "redirect:/customer/";
    }


}
