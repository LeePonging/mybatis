package com.abc.servcie;

import com.abc.bean.Student;

public interface StudentService {
    void saveStudent(Student student);

    Student getStudentById(int id);
}
