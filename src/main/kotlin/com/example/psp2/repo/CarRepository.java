package com.example.psp2.repo;

import com.example.psp2.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Employee, Integer> {

}
