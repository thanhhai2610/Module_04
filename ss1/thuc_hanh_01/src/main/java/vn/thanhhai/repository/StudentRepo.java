package vn.thanhhai.repository;

import org.springframework.stereotype.Repository;
import vn.thanhhai.model.Student;

import java.util.ArrayList;
import java.util.List;


@Repository
public class StudentRepo implements IStudentRepository {
    private static List<Student> studentList;

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "Nguyen Van A", 0, new String[]{"JAVA", "C#"}));
        studentList.add(new Student(2, "Nguyen Van B", 1, new String[]{"C#"}));
        studentList.add(new Student(3, "Nguyen Van C", 3, new String[]{"JAVA"}));

    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public List<Student> findByName(String keyword) {
        return null;
    }
}
