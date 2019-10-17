package com.abc.controller;

import com.abc.bean.Student;
import com.abc.servcie.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class SomeController {

    @Autowired
    private StudentService service;

     //通过表单提交
//     @PostMapping("/")
//     public String saveHandle(Student student) {
//         service.saveStudent(student);
//         return "success";
//     }

    // 通过JSON格式提交
    @PostMapping("/")
    public String saveHandle(@RequestBody Student student){
        service.saveStudent(student);
        return "success";
    }

    @GetMapping("/{id}/{name}")
    public Student getHandle(@PathVariable("id") int id,@PathVariable("name") String name) {
        Student student = service.getStudentById(id);
        System.out.println(name);
        return student;
    }

    @GetMapping("/xx")
    public String  getxxHandle() {
        System.out.println("xx");
        return "success";
    }
}
