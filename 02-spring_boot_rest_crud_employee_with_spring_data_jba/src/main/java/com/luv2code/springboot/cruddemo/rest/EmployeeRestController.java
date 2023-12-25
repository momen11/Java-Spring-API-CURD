package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

private EmployeeService employeeService;
//quick and dirty : inject employee dao (use a constructor injection)
public EmployeeRestController(EmployeeService theemployeeService){
    employeeService=theemployeeService;
}
@GetMapping("/employees")
    public List<employee> findall(){
    return employeeService.findall();
}

@GetMapping("/employees/{employeeid}")
    public employee getemployeebyid(@PathVariable int employeeid){
    employee theEmployee =employeeService.findbyid(employeeid);
    if (theEmployee == null){
        throw new RuntimeException("Emplyee is not found "+employeeid);
    }
    return theEmployee;

}


    //add a new Employee - add a mapping post /employees
    @PostMapping("/employees")
    public employee addEmployee(@RequestBody employee theEmployee){

theEmployee.setId(0);
employee dbEmployee = employeeService.save(theEmployee);
return dbEmployee;
    }

    //update a Employee - update a mapping put /employee
    @PutMapping("employees")
    public employee updateEmployee(@RequestBody employee theEmployee){
        employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }


    //delete Employee - delete a mapping delete /employee/{employeeId}
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        employee theEmployee =employeeService.findbyid(employeeId);
        //thow exception if null
        if(theEmployee == null){
            throw new RuntimeException("Employee is not found " + employeeId);
        }
        employeeService.deletebyid(employeeId);
        return "Delete employee id-> " + employeeId;
    }
}
