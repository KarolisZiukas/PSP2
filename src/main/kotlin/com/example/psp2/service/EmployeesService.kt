package com.example.psp2.service

import com.example.psp2.entities.Employee

interface EmployeesService {

    fun getAllEmployees(): List<Employee>

    fun getSpecificEmployees(position: String): List<Employee>

    fun addEmployee(employee: Employee): Employee

    fun importData()

}