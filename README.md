# Java-Spring-API-CURD
This project consists of three main versions. In each version, a new tool is used that increases the ease of write java spring code


first project 
project consists of four lyers 
Entity ->  Inside Package is the class Employee are the values ​​that belong to the employee and the employee table in Database
Employee dao ->  inside package interface and class Employee_dao_impl to implementation functions in interface These functions communicate with Database to extract the required data
Employee services -. In this class, we make any modifications before reaching the last stage
Employee controlle -> We define the functions that will be called in Postman and create their link

The second project added data-jpa
delete class Employee-dao-impl and extend jpaRepository by it we didn't implementation for interface

The third project added data-rest
add dependency data-rest in bom file 
delete packges of Employee-services and Employee-controller
