package com.example.psp2.service

import com.example.psp2.entities.Designer
import com.example.psp2.entities.Employee
import com.example.psp2.entities.Manager
import com.example.psp2.factory.BaseFactory
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
    lateinit var employeesRepo: EmployeesRepo

    override fun getAllEmployees(): List<Employee> {
        return employeesRepo.findAll()
    }

    override fun addEmployee(employee: Employee): Employee {
        return employeesRepo.save(employee)
    }

    override fun importData() {
//        emp = Manager()
//        emp.id = "3"
//        emp.name = "James"
//        emp.position = "manager"
//        emp.wage = 2.5
//        employeesRepo.save(emp)
    }
}