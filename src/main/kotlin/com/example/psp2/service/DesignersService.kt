package com.example.psp2.service

import com.example.psp2.entities.Employee
import com.example.psp2.repo.CarRepository
import com.example.psp2.repo.EmployeesRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class DesignersService: BaseEmployeesService() {

    @Autowired
    lateinit var employeesRepo: EmployeesRepo

    @Autowired
    lateinit var carRepository: CarRepository

    override fun getPosition() = "DESIGNER"

    override fun getSpecificEmployees(): List<Employee> {
        println("OOOOOPP")
        return getSpecificEmployeesList()
    }

    private fun getSpecificEmployeesList(): List<Employee> {
        val designersList: MutableList<Employee> = mutableListOf()
        for(item in carRepository.findAll()) {
            if (item.position == getPosition()) {
                designersList.add(item)
            }
        }
        return designersList
    }

}