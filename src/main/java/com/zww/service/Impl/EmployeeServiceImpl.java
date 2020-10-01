package com.zww.service.Impl;

import com.zww.dao.EmployeeMapper;
import com.zww.domain.Employee;
import com.zww.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zww
 * @version 1.0
 * @date 2020/10/1 11:57
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employees = employeeMapper.selectAllEmployee();
        return employees;
    }

    @Override
    public Employee selectEmployeeByid(Integer id) {
        Employee employee = employeeMapper.selectEmployeeByid(id);

        return employee;
    }


}
