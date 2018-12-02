package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Designer
import com.example.psp2.entities.employees.Employee
import com.example.psp2.repo.EmployeesRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("designersService")
open class DesignersService: BaseFacadeEmployeesService() {

    @Autowired
    override lateinit var employeesRepo: EmployeesRepo

//    override fun getByCondition(): List<Employee> {
//        val designersList: MutableList<Employee> = mutableListOf()
//        for(item in employeesRepo.findAll()) {
//            if (item is Designer) {
//                designersList.add(item)
//            }
//        }
//        return designersList
//    }


}