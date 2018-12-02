package com.example.psp2.service.carsService

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.entities.employees.EmployeeCars.LightWeightCar
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class CarServiceImpl: CarService {

    override fun getByCondition(list: List<Car>, type: Boolean): List<Car> {
        val conditionCars = mutableListOf<Car>()
        for (item in list) {
            if(item.isBroken == type) {
                conditionCars.add(item)
            }
        }
        return conditionCars
    }

    override fun getByType(list: List<Car>, type: String): List<Car> {
        val typeCars = mutableListOf<Car>()
        for (item in list) {
            if(item.type == type) {
                typeCars.add(item)
            }
        }
        return typeCars
    }
}