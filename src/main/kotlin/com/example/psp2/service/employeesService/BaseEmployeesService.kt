package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Employee
import com.example.psp2.factory.EmployeesFactory
import com.example.psp2.repo.EmployeesRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Service

@Service
@ComponentScan(value = ["com.example.PSP2.repo"])
@Qualifier("baseService")
abstract class BaseEmployeesService : EmployeesService {


    @Autowired
    lateinit var employeesFactory: EmployeesFactory

    @Autowired
    lateinit var employeesRepo: EmployeesRepo

    override fun getAllEmployees(): List<Employee> {
        return employeesRepo.findAll()
    }

    override fun addEmployee(employee: Employee): Employee {
        return employeesRepo.save(employee)
    }

    override fun importData(employee: Employee) {
      employeesRepo.save(employeesFactory.getModel(employee))
    }
}