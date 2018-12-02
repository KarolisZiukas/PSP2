package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Employee
import com.example.psp2.factory.CarsFactory
import com.example.psp2.factory.EmployeesFactory
import com.example.psp2.repo.CarsRepo
import com.example.psp2.repo.EmployeesRepo
import com.example.psp2.service.carsService.CarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class JuniorEmployeesFacadeServiceImpl: FacadeEmployeesService {

    @Autowired
    lateinit var employeeService: EmployeeService

    @Autowired
    lateinit var employeesRepo: EmployeesRepo

    @Autowired
    lateinit var employeesFactory: EmployeesFactory

    override fun getAll(): List<Employee> {
        return employeesRepo.findAll()
    }

    override fun import(model: Employee) {
        employeesRepo.save(employeesFactory.getModel(model))
    }

    override fun getByExperience(): List<Employee> {
        return employeeService.getByExperience(employeesRepo.findAll(), "Junior")
    }

    override fun getByPosition(position: String): List<Employee> {
        return employeeService.getByPosition(employeesRepo.findAll(), position)
    }
}