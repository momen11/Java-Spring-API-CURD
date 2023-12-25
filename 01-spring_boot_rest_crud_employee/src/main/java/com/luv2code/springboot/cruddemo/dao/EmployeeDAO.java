package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.employee;

import java.util.List;

public interface EmployeeDAO {
    List<employee> findaa();
    employee findbyid(int theid);
    employee save(employee theEmployee);

    void deletebyid(int theid);
}
