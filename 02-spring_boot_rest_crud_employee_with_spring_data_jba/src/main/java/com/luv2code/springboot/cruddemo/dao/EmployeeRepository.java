package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<employee,Integer> {

    // no need to write any code there
}

