package com.zww.dao;

import com.zww.domain.Employee;

import java.util.List;

/**
 * @author zww
 * @version 1.0
 * @date 2020/10/1 11:58
 */
public interface EmployeeMapper {
    List<Employee> selectAllEmployee();
    Employee selectEmployeeByid(Integer id);
}
