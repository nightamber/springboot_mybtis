package xin.mrbear.springboot_mybtis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.mrbear.springboot_mybtis.bean.Department;
import xin.mrbear.springboot_mybtis.mapper.DepartmentMapper;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(Integer id){
        return departmentMapper.getDeptByID(id);
    }

    @GetMapping("/dept")
    public Department indsrDept(Department department){
        departmentMapper.inserDept(department);
        return department;

    }
}
