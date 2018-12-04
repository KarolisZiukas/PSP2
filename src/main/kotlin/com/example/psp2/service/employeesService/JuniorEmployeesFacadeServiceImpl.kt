package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Employee
import com.example.psp2.domain.factory.EmployeesFactory
import com.example.psp2.repo.EmployeesRepo
import org.springframework.beans.factory.annotation.Autowired


class JuniorEmployeesFacadeServiceImpl: FacadeEmployeesService {

    @Autowired
    lateinit var employeeService: EmployeeService

    @Autowired
    lateinit var employeesRepo: EmployeesRepo

    @Autowired
    lateinit var employeesFactory: EmployeesFactory

    override fun getAll(): List<Employee> {
        return employeeService.getByExperience(employeesRepo.findAll(), "Junior")
    }

    override fun import(model: Employee) {
        employeesRepo.save(employeesFactory.getModel(model))
    }

    override fun getByPosition(position: String): List<Employee> {
        return employeeService.getByPosition(getAll(), position)
    }
}