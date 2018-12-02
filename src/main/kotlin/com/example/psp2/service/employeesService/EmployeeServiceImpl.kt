package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Employee
import org.springframework.stereotype.Service


@Service
class EmployeeServiceImpl: EmployeeService {

    override fun getByExperience(list: List<Employee>, experience: String): List<Employee> {
        val experienceList = mutableListOf<Employee>()
        for (item in list) {
            if(item.experience == experience) {
                experienceList.add(item)
            }
        }
        return experienceList
    }

    override fun getByPosition(list: List<Employee>, position: String): List<Employee> {
        val positionList = mutableListOf<Employee>()
        for (item in list) {
            if(item.position == position) {
                positionList.add(item)
            }
        }
        return positionList
    }
}