package com.zww.service;

import com.zww.dao.EmployeeMapper;
import com.zww.domain.Employee;

import java.util.List;


/**
 * @author zww
 * @version 1.0
 * @date 2020/10/1 11:56
 */
public interface EmployeeService {
    List<Employee> selectAllEmployee();
    Employee selectEmployeeByid(Integer id);
}
