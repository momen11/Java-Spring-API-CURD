package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;
@Autowired
    public EmployeeServiceImpl(EmployeeDAO theemployeeDAO){
        employeeDAO = theemployeeDAO;
    }
    @Override
    public List<employee> findall() {
        return employeeDAO.findaa();
    }

    @Override
    public employee findbyid(int theid) {
        return employeeDAO.findbyid(theid);
    }
@Transactional
    @Override
    public employee save(employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }
@Transactional
    @Override
    public void deletebyid(int theid) {
       employeeDAO.deletebyid(theid);
    }
}
