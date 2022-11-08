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
import vn.thanhhai.dto.FacilityDto;
import vn.thanhhai.model.customer.Customer;
import vn.thanhhai.model.facility.Facility;
import vn.thanhhai.model.facility.FacilityType;
import vn.thanhhai.model.facility.RentType;
import vn.thanhhai.service.facility.IFacilityService;
import vn.thanhhai.service.facility.IFacilityTypeService;
import vn.thanhhai.service.facility.IRentTypeService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private IFacilityTypeService facilityTypeService;

    @Autowired
    private IRentTypeService rentTypeService;


    @ModelAttribute("facilityTypeList")
    public List<FacilityType> facilityTypeList() {
        return facilityTypeService.myFindAllFacilityType();
    }

    @ModelAttribute("rentTypeList")
    public List<RentType> rentTypeList() {
        return rentTypeService.myFindAllRentType();
    }


    @GetMapping("")
    public String search(@RequestParam(value = "searchName", defaultValue = "") String name,
                         @RequestParam(value = "searchFacilityTypeList", defaultValue = "") String facilityTypeList,
                         @PageableDefault(value = 5) Pageable pageable,
                         Model model,
                         RedirectAttributes redirectAttributes) {

        Page<Facility> facilityPage = facilityService.myFindAll(name, facilityTypeList, pageable);
        List<FacilityDto> facilityDtoList = new ArrayList<>();
        FacilityDto facilityEmptyDto = new FacilityDto();
        for (Facility facility : facilityPage) {
            FacilityDto facilityDto1 = new FacilityDto();
            BeanUtils.copyProperties(facility, facilityDto1);
            facilityDtoList.add(facilityDto1);
        }
        Page<FacilityDto> facilityDtoListPage
                = new PageImpl<>(facilityDtoList, pageable, facilityPage.getTotalElements());

        model.addAttribute("facilityEmptyDto", facilityEmptyDto);
        model.addAttribute("searchName", name);
        model.addAttribute("searchFacilityTypeList", facilityTypeList);
        model.addAttribute("facilityDtoListPage", facilityDtoListPage);
        return "/facility/list";
    }

    @GetMapping("/create")
    public String create(@ModelAttribute FacilityDto facilityDto, Model model) {
        model.addAttribute("facilityDto", facilityDto);
        return "/facility/create";
    }

    @PostMapping("/create")
    private String addFacility(@ModelAttribute("facilityDto") FacilityDto facilityDto,
                               BindingResult bindingResult,
                               RedirectAttributes redirect) {
        if (!bindingResult.hasErrors()) {
            Facility facility = new Facility();
            BeanUtils.copyProperties(facilityDto, facility);
            facilityService.saveFacility(facility);

            redirect.addFlashAttribute("message", "Customer created successfully");
        } else {
            redirect.addFlashAttribute("message", "Customer creation failed");
        }
        return "redirect:/facility/";
    }

    @GetMapping("delete/{id}")
    public String deleteFacility(@PathVariable int id) {
        facilityService.removeById(id);
        return "redirect:/facility/";
    }

    @GetMapping("edit/{id}")
    public String editFacility(@PathVariable int id, Model model) {
        Facility facility = facilityService.findById(id);
        model.addAttribute("facilityDto", facility);
        return "/facility/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("facilityDto") FacilityDto facilityDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirect) {
        if (!bindingResult.hasErrors()) {
            Facility facility = new Facility();
            BeanUtils.copyProperties(facilityDto, facility);
            facilityService.saveFacility(facility);

            redirect.addFlashAttribute("message", "Customer created successfully");
        } else {
            redirect.addFlashAttribute("message", "Customer creation failed");
        }
        return "redirect:/customer/";
    }


}
