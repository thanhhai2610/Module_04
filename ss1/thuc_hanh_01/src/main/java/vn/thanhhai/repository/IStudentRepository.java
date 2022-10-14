package vn.thanhhai.repository;



import vn.thanhhai.model.Student;

import java.util.List;

public interface IStudentRepository {

    List<Student> findAll();

    void save(Student student);

    public List<Student> findByName(String keyword);

}
