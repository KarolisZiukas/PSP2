package com.example.psp2.factory

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.entities.employees.EmployeeCars.LightWeightCar
import com.example.psp2.entities.employees.EmployeeCars.Van

class CarsFactory: BaseFactory<Car>() {

    override fun getModel(model: Car): Car {
        var car: Car?
        if (model is Van) {
            car = Van()
            car.id = model.id
            car.make = model.make
            car.model = model.model
        } else {
            car = LightWeightCar()
            car.id = model.id
            car.make = model.make
            car.model = model.model
        }
        return car
    }
}