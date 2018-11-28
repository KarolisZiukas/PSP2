package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Employee
import com.example.psp2.entities.employees.Manager
import com.example.psp2.repo.EmployeesRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("managerService")
class ManagersService: BaseEmployeesService() {

    @Autowired
    override lateinit var employeesRepo: EmployeesRepo

    override fun getSpecific(): List<Employee> {
        val managerList = mutableListOf<Employee>()
        for (item in employeesRepo.findAll()) {
            if(item is Manager) {
                managerList.add(item)
            }
        }
        return managerList
    }
}