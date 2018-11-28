package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Designer
import com.example.psp2.entities.employees.Employee
import com.example.psp2.repo.EmployeesRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("designersService")
open class DesignersService: BaseEmployeesService() {

    @Autowired
    override lateinit var employeesRepo: EmployeesRepo

    override fun getSpecific(): List<Employee> {
        val designersList: MutableList<Employee> = mutableListOf()
        for(item in employeesRepo.findAll()) {
            if (item is Designer) {
                designersList.add(item)
            }
        }
        return designersList
    }

    override fun update(model: Employee) {
        employeesRepo.save(employeesFactory.getModel(model))
    }
}