package vn.thanhhai.service;


import vn.thanhhai.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void save(Student student);

    public List<Student> findByName(String keyword);
}
