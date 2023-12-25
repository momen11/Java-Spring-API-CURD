package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.employee;

import java.util.List;

public interface EmployeeService {

    List<employee> findall();

    employee findbyid(int theid);
    employee save(employee theEmployee);

    void deletebyid(int theid);
}
