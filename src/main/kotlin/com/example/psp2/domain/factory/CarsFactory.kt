package com.example.psp2.domain.factory

import com.example.psp2.entities.EmployeeCars.Car
import com.example.psp2.entities.EmployeeCars.LightWeightCar
import com.example.psp2.entities.EmployeeCars.Van
import org.springframework.stereotype.Component

@Component
class CarsFactory: BaseFactory<Car>() {

    override fun getModel(model: Car): Car {
        return when {
            model.type == "Van" -> createModel(model, Van())
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
        car.isBroken = model.isBroken
        return car
    }
}