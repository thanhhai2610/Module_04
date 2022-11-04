package vn.thanhhai.dto;

import vn.thanhhai.model.customer.CustomerType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CustomerDto {

    private int id;

    private String name;
    private String dateOfBirth;
    private int gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String address;


}
