package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entity.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeDAO;
@Autowired
    public EmployeeServiceImpl(EmployeeRepository theemployeeDAO){
        employeeDAO = theemployeeDAO;
    }
    @Override
    public List<employee> findall() {
        return employeeDAO.findAll();
    }

    @Override
    public employee findbyid(int theid) {
       // return employeeDAO.findById(theid);
        Optional<employee> resulte = employeeDAO.findById(theid);
        employee theEmployee = null;
        if(resulte.isPresent()){
            theEmployee = resulte.get();
        }
        else {
            //we didn't find the employee
            throw new RuntimeException("Did not find Employee Id-> "+theid);
        }
          return theEmployee;
    }
    @Override
    public employee save(employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }
    @Override
    public void deletebyid(int theid) {
       employeeDAO.deleteById(theid);
    }
}
