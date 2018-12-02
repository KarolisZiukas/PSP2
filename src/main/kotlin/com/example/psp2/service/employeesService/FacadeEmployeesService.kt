package com.example.psp2.service.employeesService

import com.example.psp2.entities.employees.Employee

interface FacadeEmployeesService {

    fun getAll(): List<Employee>

    fun import(model: Employee)

    fun getByExperience(): List<Employee>

    fun getByPosition(position: String): List<Employee>

}