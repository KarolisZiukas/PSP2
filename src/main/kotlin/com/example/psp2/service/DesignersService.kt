package com.example.psp2.service

import com.example.psp2.entities.Employee
import com.example.psp2.repo.EmployeesRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("designersService")
open class DesignersService: BaseEmployeesService() {

    @Autowired
    override lateinit var employeesRepo: EmployeesRepo

    override fun getSpecificEmployees(position: String): List<Employee> {
        return getSpecificEmployeesList(position)
    }

    private fun getSpecificEmployeesList(position: String): List<Employee> {
        val designersList: MutableList<Employee> = mutableListOf()
        for(item in employeesRepo.findAll()) {
            if (item.position == position) {
                designersList.add(item)
            }
        }
        return designersList
    }

}