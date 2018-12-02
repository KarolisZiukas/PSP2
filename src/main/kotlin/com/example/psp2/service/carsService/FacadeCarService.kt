package com.example.psp2.service.carsService

import com.example.psp2.entities.employees.EmployeeCars.Car

interface FacadeCarService {

    fun getAll(): List<Car>

    fun import(model: Car)

    fun getByCondition(): List<Car>

    fun getByType(type: String): List<Car>


}