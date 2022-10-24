package vn.thanhhai.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import vn.thanhhai.model.User;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserDto implements Validator {

    @NotEmpty(message = "Ban can nhap gi do")
    private String username;

    @NotEmpty(message = "Ban can nhap gi do")
    private String phone;

    @Min(18)
    private int age;

    @NotEmpty(message = "Ban can nhap gi do")
    private String email;


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
//        if (userDto.getAge()) {
//            errors.rejectValue("age", "", "Ban nhap chua dung dinh dang");
//
//        }
        if (!userDto.getUsername().matches("\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*")) {
            errors.rejectValue("username", "name.format", "Ban nhap chua dung dinh dang");
        }
        if (!userDto.getPhone().matches("^[0][0-9]{9}$")) {
            errors.rejectValue("phone", "phone.format", "Phone nhap chua dung dinh dang");
        }
        if (userDto.getPhone().matches("^[a-zA-Z_]$")) {
            errors.rejectValue("phone", "phoneString.format", "Phone nhap khong phai là so");
        }

        if (!userDto.getEmail().matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+" +
                "(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
            errors.rejectValue("email", "email.format", "Email nhap chua dung dinh dang ");
        }

    }

    public UserDto() {
    }

    public UserDto(String username, String phone, int age, String email) {
        this.username = username;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
