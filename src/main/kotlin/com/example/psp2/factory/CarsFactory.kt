package com.example.psp2.factory

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.entities.employees.EmployeeCars.LightWeightCar
import com.example.psp2.entities.employees.EmployeeCars.Van
import org.springframework.stereotype.Component

@Component
class CarsFactory: BaseFactory<Car>() {

    override fun getModel(model: Car): Car {
        return when {
            model.type == "van" -> createModel(model, Van())
            else -> createModel(model, LightWeightCar())
        }
    }

    override fun createModel(model: Car, type: Car): Car {
        val car: Car?
        car = type
        car.id = model.id
        car.make = model.make
        car.model = model.model
        car.type = model.type
        return car
    }
}