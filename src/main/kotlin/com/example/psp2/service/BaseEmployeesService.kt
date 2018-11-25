package com.example.psp2.service

import com.example.psp2.entities.Employee
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Service

@Service
@ComponentScan(value = ["com.example.PSP2.repo"])
abstract class BaseEmployeesService: EmployeesService {



    override fun getAllEmployees(): List<Employee> {
        return listOf()
//            return carRepository.findAll() as List<Employee>
    }

    override fun addEmployee(employee: Employee) {
//        carRepository.save(employee)
    }

    abstract fun getPosition(): String
}