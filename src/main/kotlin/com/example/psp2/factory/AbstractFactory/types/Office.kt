package com.example.psp2.factory.AbstractFactory.types

import com.example.psp2.factory.AbstractFactory.factories.PlaceParametersFactory

class Office (
       val placeParametersFactory: PlaceParametersFactory
): BuildingType() {


    override fun build() {
        println("building $name")
        parking = placeParametersFactory.createParking()
        specs = placeParametersFactory.addSpecs()
    }
}