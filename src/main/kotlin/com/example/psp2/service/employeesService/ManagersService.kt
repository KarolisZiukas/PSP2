package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Employee
import com.example.psp2.entities.employees.Manager
import com.example.psp2.repo.EmployeesRepo
import org.springframework.beans.factory.annotation.Autowired

class ManagersService: BaseFacadeEmployeesService() {

    @Autowired
    override lateinit var employeesRepo: EmployeesRepo

    fun getSpecific(): List<Employee> {
        val managerList = mutableListOf<Employee>()
        for (item in employeesRepo.findAll()) {
            if(item is Manager) {
                managerList.add(item)
            }
        }
        return managerList
    }
}