package com.example.psp2.service.carsService

import com.example.psp2.entities.employees.EmployeeCars.Car

interface CarService {

    fun getByCondition(list: List<Car>, type: Boolean): List<Car>

    fun getByType(list: List<Car>, type: String): List<Car>

}
