package com.example.tpnosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import  com.example.tpnosql.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}