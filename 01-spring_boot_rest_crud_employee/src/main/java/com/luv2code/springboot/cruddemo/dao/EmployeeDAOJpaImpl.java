package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{
//define fields for entitymanager
    private EntityManager theEntityManger;

    // set up constractor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager){
        theEntityManger = entityManager;
    }
    @Override
    public List<employee> findaa() {
        // create a query
        TypedQuery <employee>theQuery =     theEntityManger.createQuery("from employee",employee.class);

        // excute query and get result list
        List<employee> employees = theQuery.getResultList();

        // return the result

        return employees;
    }

    @Override
    public employee findbyid(int theid) {
        //get employee
employee theEmployee = theEntityManger.find(employee.class,theid);

        //return employee

        return theEmployee;
    }

    @Override
    public employee save(employee theEmployee) {
        // save employee
employee dbemployee = theEntityManger.merge(theEmployee);
        // return the dbemployee
        return dbemployee;
    }

    @Override
    public void deletebyid(int theid) {

        // find by id
        employee theEmployee = theEntityManger.find(employee.class,theid);

        // remove the employee
        theEntityManger.remove(theEmployee);

    }


}
