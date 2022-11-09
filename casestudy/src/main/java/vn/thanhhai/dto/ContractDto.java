package vn.thanhhai.dto;

import vn.thanhhai.model.contract.ContractDetail;
import vn.thanhhai.model.customer.Customer;
import vn.thanhhai.model.employee.Employee;
import vn.thanhhai.model.facility.Facility;

import java.util.Set;

public class ContractDto {
    private int id;
    private String startDate;
    private String endDate;
    private double deposit;
    private Customer customer;
    private Employee employee;
    private Facility facility;
    private Set<ContractDetail> contractDetails;
    private double total;

    public ContractDto() {

    }

    public ContractDto(int id, String startDate, String endDate, double deposit, Customer customer, Employee employee, Facility facility, Set<ContractDetail> contractDetails, double total) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.customer = customer;
        this.employee = employee;
        this.facility = facility;
        this.contractDetails = contractDetails;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void getTotalCost() {
        this.total = this.facility.getCost();
        if (this.contractDetails != null) {
            for (ContractDetail contractDetail : this.contractDetails) {
                this.total += contractDetail.getQuantity() * contractDetail.getAttachFacility().getCost();
            }
        }
    }

}
