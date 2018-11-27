package com.example.psp2.service.carsService

import com.example.psp2.entities.employees.EmployeeCars.Car

interface CarService {

    fun getAllCars(): List<Car>

    fun getSpecificCars(): List<Car>

    fun importCar(car: Car)
}