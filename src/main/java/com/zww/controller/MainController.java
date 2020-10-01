package com.zww.controller;

import com.zww.domain.Employee;
import com.zww.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zww
 * @version 1.0
 * @date 2020/10/1 12:10
 */
@Controller
public class MainController {
    @Autowired
    private EmployeeService employeeService;
    //查询所有的Employee信息
    @ResponseBody
    @RequestMapping("/selectall")
    public List<Employee> selectAll(){

        List<Employee> employees = employeeService.selectAllEmployee();
        for (Employee e:employees){
            System.out.println(e);
        }

        return employees;
    }

    @RequestMapping("selectbyid/{id}")
    public Employee selectById(@PathVariable("id") Integer id){
        Employee employee = employeeService.selectEmployeeByid(id);
        System.out.println(employee);

        return employee;
    }

    @RequestMapping("deletebyid/{id}")
    public Employee deletebyid(@PathVariable("id") Integer id){

        System.out.println();
        return null;
    }
}
