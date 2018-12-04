package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Employee

interface EmployeeService {

    fun getByExperience(list: List<Employee>, experience: String): List<Employee>
    fun getByPosition(list: List<Employee>, position: String): List<Employee>
}