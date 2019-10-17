package com.abc.servcie;

import com.abc.bean.Student;
import com.abc.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    public void saveStudent(Student student){
        dao.insertStudent(student);
    }

    @Override
    public Student getStudentById(int id) {
        return dao.selectStudentById(id);
    }
}
