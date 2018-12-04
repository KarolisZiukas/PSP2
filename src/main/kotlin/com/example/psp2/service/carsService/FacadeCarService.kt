package com.example.psp2.service.carsService

import com.example.psp2.entities.EmployeeCars.Car

interface FacadeCarService {

    fun getAll(): List<Car>

    fun import(model: Car)

    fun getByType(type: String): List<Car>


}