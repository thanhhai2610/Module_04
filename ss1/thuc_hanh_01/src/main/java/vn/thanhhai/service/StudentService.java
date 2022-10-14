package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.thanhhai.model.Student;
import vn.thanhhai.repository.IStudentRepository;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentRepository studentRepository ;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public List<Student> findByName(String keyword) {
        return null;
    }
}
