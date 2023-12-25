package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "/members")
public interface EmployeeRepository extends JpaRepository<employee,Integer> {

    // no need to write any code there
}

