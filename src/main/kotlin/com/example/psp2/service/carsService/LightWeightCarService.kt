package com.example.psp2.service.carsService

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.entities.employees.EmployeeCars.LightWeightCar
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier(value = "lightWeightCarService")
class LightWeightCarService: BaseCarsService() {

    override fun getSpecific(): List<Car> {
        val lightWeightCars = mutableListOf<Car>()
        for (item in carsRepo.findAll()) {
            if(item is LightWeightCar) {
                lightWeightCars.add(item)
            }
        }
        return lightWeightCars
    }
}